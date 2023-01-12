package com.ejemplo.ejemplo02.Repository;

import com.ejemplo.ejemplo02.Entity.TicketEntity;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<TicketEntity, Long> {
}
