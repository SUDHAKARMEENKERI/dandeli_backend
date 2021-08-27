package com.dandeli.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dandeli.model.SystemUsersBean;
import com.dandeli.model.UserLoginBean;
import com.dandeli.service.SystemUserService;

@RestController
@RequestMapping("/dandeli/systemUser")
@CrossOrigin
public class SystemUserController {

	@Autowired 
	private SystemUserService systemUserservice;
	
	@GetMapping("/getSystemUserList")  
	private List<SystemUsersBean> getAllSystemUserList()   
	{  
	return systemUserservice.getAllSystemUserList();  
	} 
	
	@PostMapping("/addSystemUser")  
	private int saveSystemUser(@RequestBody SystemUsersBean systemUser)   
	{  
		systemUserservice.saveOrUpdate(systemUser);  
	return systemUser.getSystemUserId();
	} 
	
	@PutMapping("/updateSystemUser")  
	private SystemUsersBean update(@RequestBody SystemUsersBean systemUser)   
	{  
		systemUserservice.saveOrUpdate(systemUser);  
	return systemUser;  
	} 
	
	@DeleteMapping("/deleteSystemUserById/{systemUserId}")  
	private int deleteSystemUser(@PathVariable("systemUserId") int systemUserId)   
	{  
		systemUserservice.deleteSystemUser(systemUserId);  
		return systemUserId;
	} 
	
	@PostMapping("/systemUserlogin")  
	private Map<String, Boolean> systemUserLogin(@RequestBody UserLoginBean userLogin)   
	{
	List<SystemUsersBean> user = systemUserservice.getAllSystemUserList(); 
	
	Map<String,Boolean> reg_Response = new HashMap<String, Boolean>();
	
	boolean flage = false; 
	reg_Response.put("Message", flage);
	
	for(int i = 0; i < user.size(); i++) {
		if(user.get(i).getEmail().equals(userLogin.getEmail()) && user.get(i).getPassword().equals(userLogin.getPassword())) {
			flage = true;
			reg_Response.put("Message", flage);
			return reg_Response;
		}else {
			reg_Response.put("Message", flage);
			return reg_Response;
		}
	}
	return reg_Response;
	} 
}
