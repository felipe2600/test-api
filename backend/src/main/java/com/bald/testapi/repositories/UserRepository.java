package com.bald.testapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bald.testapi.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
