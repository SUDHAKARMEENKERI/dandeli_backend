package com.dandeli.controller;

import java.util.List;

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
	
	@DeleteMapping("/deleteManageListById/{systemUserId}")  
	private void deleteSystemUser(@PathVariable("systemUserId") int systemUserId)   
	{  
		systemUserservice.deleteSystemUser(systemUserId);  
	} 
}
