package com.mapping.mapping_demo.repositories;

import com.mapping.mapping_demo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
