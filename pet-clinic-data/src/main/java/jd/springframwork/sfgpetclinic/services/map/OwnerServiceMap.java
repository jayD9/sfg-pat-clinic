package jd.springframwork.sfgpetclinic.services.map;

import jd.springframwork.sfgpetclinic.model.Owner;
import jd.springframwork.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * author JD
 * created 1/7/21 3:22 PM
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
