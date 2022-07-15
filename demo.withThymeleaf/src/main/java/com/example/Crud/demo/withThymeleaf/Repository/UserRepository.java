package com.example.Crud.demo.withThymeleaf.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Crud.demo.withThymeleaf.Bean.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
