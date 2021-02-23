package jd.springframwork.sfgpetclinic.services.map;

import jd.springframwork.sfgpetclinic.model.Pet;
import jd.springframwork.sfgpetclinic.services.CrudService;
import jd.springframwork.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * author JD
 * created 1/7/21 3:29 PM
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
