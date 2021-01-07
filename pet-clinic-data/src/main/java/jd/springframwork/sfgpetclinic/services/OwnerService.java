package jd.springframwork.sfgpetclinic.services;

import jd.springframwork.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * author JD
 * created 1/6/21 10:48 PM
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
