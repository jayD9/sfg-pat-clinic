package jd.springframwork.sfgpetclinic.services;

import jd.springframwork.sfgpetclinic.model.Owner;

/**
 * author JD
 * created 1/6/21 10:48 PM
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
