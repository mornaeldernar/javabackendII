package com.ejemplo.ejemplo02.Repository;

import com.ejemplo.ejemplo02.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

        public List<CustomerEntity> findByNameIgnoreCaseContaining(@Param("name") String name);
}
