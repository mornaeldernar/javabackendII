package com.ejemplo.ejemplo02.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.List;
import java.util.Set;

@Entity
@Data
@RestResource(rel="ticket",path="tickets")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity Customer;
    @ManyToMany
    private Set<ProductEntity> Products;

}
