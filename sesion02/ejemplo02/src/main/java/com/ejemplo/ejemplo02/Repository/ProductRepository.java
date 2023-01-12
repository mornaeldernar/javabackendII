package com.ejemplo.ejemplo02.Repository;

import com.ejemplo.ejemplo02.Entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Long> {
}
