package fr.dlesaout.springbootstartertemplate.service.impl;

import fr.dlesaout.springbootstartertemplate.entity.Pet;
import fr.dlesaout.springbootstartertemplate.exception.BadRequestException;
import fr.dlesaout.springbootstartertemplate.model.PetResource;
import fr.dlesaout.springbootstartertemplate.repository.PetRepository;
import fr.dlesaout.springbootstartertemplate.service.MessageService;
import fr.dlesaout.springbootstartertemplate.service.PetService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Slf4j
@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;
    private final ModelMapper modelMapper;
    private final MessageService messageService;

    public PetServiceImpl(PetRepository petRepository, ModelMapper modelMapper, MessageService messageService) {
        this.petRepository = petRepository;
        this.modelMapper = modelMapper;
        this.messageService = messageService;
    }

    @Override
    public List<PetResource> listPets(Integer limit) {
        log.info("PetService - getting list of pets sorted by id, limit: {}", limit);
        List<Pet> frameList = petRepository.findAll();
        return frameList.stream()
                .sorted(Comparator.comparing(Pet::getId))
                .limit(limit)
                .map(frame -> modelMapper.map(frame, PetResource.class))
                .toList();
    }

    @Override
    public Void createPets(PetResource petResource) {
        log.info("PetService - creating a new pet");
        if ((petResource.getName().trim().equalsIgnoreCase("Felix") || petResource.getName().trim().equalsIgnoreCase("Félix")) && petResource.getTag().toUpperCase().trim().equals("DOG")) {
            throw new BadRequestException(HttpStatus.BAD_REQUEST, messageService.getMessage("pet.validation.nameNotOriginal"));
        }
        Pet pet = modelMapper.map(petResource, Pet.class);
        petRepository.save(pet);
        return null;
    }

    @Override
    public PetResource showPetById(Integer petId) {
        log.info("PetService - Getting a pet by id: {}", petId);
        Pet pet = petRepository.findById(petId).orElse(null);
        return modelMapper.map(pet, PetResource.class);
    }

}
