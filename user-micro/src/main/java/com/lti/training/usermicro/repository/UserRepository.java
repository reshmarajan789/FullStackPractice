package com.lti.training.usermicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.training.usermicro.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
