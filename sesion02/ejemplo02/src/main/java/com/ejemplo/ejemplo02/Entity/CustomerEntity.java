package com.ejemplo.ejemplo02.Entity;

import com.ejemplo.ejemplo02.Entity.CityEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Data
@RestResource(rel="customers",path="customers")
public class CustomerEntity {
    @Id
    Long id;
    @Column
    String name;
    @Column
    String address;
    @Column
    String telephone;
    @Column @JsonIgnore //Esto oculta el elemento de los resultados json
    String secret;
    @OneToOne
    CityEntity city;


}
