package com.springproject.mypetclinic.sevices.map;

import com.springproject.mypetclinic.model.Pet;
import com.springproject.mypetclinic.sevices.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService <Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        super.save(object.getId(), object);
        return object;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
