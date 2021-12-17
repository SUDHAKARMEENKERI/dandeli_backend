package com.dandeli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandeli.model.DandeliListingBean;

public interface DandeliListRepo extends JpaRepository<DandeliListingBean, Integer>{

}
