package jd.springframwork.sfgpetclinic.services;

import jd.springframwork.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * author JD
 * created 1/6/21 10:51 PM
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
