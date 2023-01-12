package com.ejemplo.ejemplo02.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Set;

@Entity
@Data
@RestResource(rel="product",path="products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    private String name;
    @Column
    private Double price;
    @ManyToMany @JsonIgnore
    private Set<TicketEntity> ticket;

}
