package com.dandeli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandeli.model.UserLoginBean;

public interface UserListRep extends JpaRepository<UserLoginBean, Integer>{

}
