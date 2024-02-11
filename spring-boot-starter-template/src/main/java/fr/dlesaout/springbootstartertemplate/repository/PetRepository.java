package fr.dlesaout.springbootstartertemplate.repository;

import fr.dlesaout.springbootstartertemplate.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
