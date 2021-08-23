package com.dandeli.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandeli.model.SystemUsersBean;
import com.dandeli.repository.ManageListRep;
import com.dandeli.repository.SystemUserListRep;

@Service
@Transactional
public class SystemUserService {
	
	@Autowired
	 private SystemUserListRep systemUser_repository;

	public List<SystemUsersBean> getAllSystemUserList() {
		return systemUser_repository.findAll();
	}

	public void saveOrUpdate(SystemUsersBean systemUser) {
		systemUser_repository.save(systemUser);
	}

	public void deleteSystemUser(int systemUserId) {
		systemUser_repository.deleteById(systemUserId);
	}

}
