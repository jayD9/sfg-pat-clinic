package jd.springframwork.sfgpetclinic.services;

import java.util.Set;

/**
 * author JD
 * created 1/7/21 2:27 PM
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T Object);

    void deleteById(ID id);

}
