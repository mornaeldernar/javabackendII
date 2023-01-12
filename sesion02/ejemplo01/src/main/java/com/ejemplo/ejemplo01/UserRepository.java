package com.ejemplo.ejemplo01;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepository extends CrudRepository<WebsiteUser,Long> {
}
