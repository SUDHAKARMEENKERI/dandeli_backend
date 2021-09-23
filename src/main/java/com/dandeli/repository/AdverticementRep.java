package com.dandeli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandeli.model.AdverticementBean;

public interface AdverticementRep extends JpaRepository<AdverticementBean, Integer>{

}
