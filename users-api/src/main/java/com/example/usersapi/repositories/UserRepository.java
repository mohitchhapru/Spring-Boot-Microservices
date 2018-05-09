package com.example.usersapi.repositories;

import com.example.usersapi.models.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User, Long> {


}