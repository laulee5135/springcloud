package com.laulee.springcloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laulee.springcloud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
