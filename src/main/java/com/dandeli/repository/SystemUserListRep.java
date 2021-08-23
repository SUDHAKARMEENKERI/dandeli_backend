package com.dandeli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandeli.model.SystemUsersBean;

public interface SystemUserListRep extends JpaRepository<SystemUsersBean, Integer>{

}
