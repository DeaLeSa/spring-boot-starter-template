package fr.dlesaout.springbootstartertemplate.controller;

import fr.dlesaout.springbootstartertemplate.model.PetResource;
import fr.dlesaout.springbootstartertemplate.service.PetService;
import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/api}")
public class PetsApiController implements PetsApi {

    private final NativeWebRequest request;

    private final PetService petService;

    @Autowired
    public PetsApiController(NativeWebRequest request, PetService petService) {
        this.request = request;
        this.petService = petService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> createPets(PetResource petResource) {
        return ResponseEntity.ok(petService.createPets(petResource));
    }

    @Override
    public ResponseEntity<List<PetResource>> listPets(Integer limit) {
        return ResponseEntity.ok(petService.listPets(limit));
    }

    @Override
    public ResponseEntity<PetResource> showPetById(Integer petId) {
        return ResponseEntity.ok(petService.showPetById(petId));
    }
}
