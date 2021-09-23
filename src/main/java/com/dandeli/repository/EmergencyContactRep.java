package com.dandeli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandeli.model.EmergencyContactBean;

public interface EmergencyContactRep extends JpaRepository<EmergencyContactBean, Integer>{

}
