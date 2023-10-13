package com.jpah2.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpah2.test.entity.User1;

public interface UserRepository extends JpaRepository< User1 , Integer>{

}
