package com.cobra.petclinic.services;

import com.cobra.petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
