package jd.springframwork.sfgpetclinic.services;

import jd.springframwork.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * author JD
 * created 1/6/21 10:50 PM
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
