package fr.dlesaout.springbootstartertemplate.mapper;

import fr.dlesaout.springbootstartertemplate.entity.Pet;
import fr.dlesaout.springbootstartertemplate.model.PetResource;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    private final ModelMapper modelMapper;

    public PetMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    public void configureModelMapper() {
        modelMapper.createTypeMap(Pet.class, PetResource.class)
                .addMapping(Pet::getId, PetResource::setId);
    }

    public PetResource toResource(Pet pet) {
        return modelMapper.map(pet, PetResource.class);
    }

    public Pet toEntity(PetResource petResource) {
        return modelMapper.map(petResource, Pet.class);
    }
}

