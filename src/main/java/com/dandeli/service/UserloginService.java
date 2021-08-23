package com.dandeli.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandeli.model.ManageListBean;
import com.dandeli.model.UserLoginBean;
import com.dandeli.repository.UserListRep;

@Service
@Transactional
public class UserloginService {

	@Autowired
	private UserListRep userloginRep;
	
	public List<UserLoginBean> getAllUserLoginList() {
		return userloginRep.findAll();  
	}
	
	public void saveOrUpdate(UserLoginBean userlist)   
	{  
		userloginRep.save(userlist);  
	}

	public UserLoginBean getUserLoginListById(int id) {
		return userloginRep.findById(id).get();  
	}

	public void deleteUserLogin(int id) {
		userloginRep.deleteById(id);
		
	}  
}
