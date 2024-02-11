package fr.dlesaout.springbootstartertemplate.service;

import fr.dlesaout.springbootstartertemplate.model.PetResource;

import java.util.List;

public interface PetService {

    List<PetResource> listPets(Integer limit);

    Void createPets(PetResource petResource);

    PetResource showPetById(Integer petId);
}
