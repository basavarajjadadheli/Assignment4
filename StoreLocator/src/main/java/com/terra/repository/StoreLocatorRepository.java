package com.terra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.terra.entity.Store;


@Repository
public interface StoreLocatorRepository extends JpaRepository<Store, String>{

	
}
