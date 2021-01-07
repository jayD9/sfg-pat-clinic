package jd.springframwork.sfgpetclinic.services.map;

import jd.springframwork.sfgpetclinic.model.Vet;
import jd.springframwork.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * author JD
 * created 1/7/21 3:32 PM
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
