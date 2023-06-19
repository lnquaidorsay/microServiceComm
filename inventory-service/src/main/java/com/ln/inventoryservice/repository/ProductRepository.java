package com.ln.inventoryservice.repository;

import com.ln.inventoryservice.models.Product;
import org.hibernate.boot.JaccPermissionDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {

}
