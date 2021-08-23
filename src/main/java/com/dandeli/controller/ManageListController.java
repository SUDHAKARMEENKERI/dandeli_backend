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

import com.dandeli.model.ManageListBean;
import com.dandeli.model.SystemUsersBean;
import com.dandeli.repository.SystemUserListRep;
import com.dandeli.service.ManageListService;
import com.dandeli.service.SystemUserService;

//@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ManageListController {
	
	@Autowired
	private ManageListService manageservice;
	
	@GetMapping("/getManageList")  
	private List<ManageListBean> getAllManageList()   
	{  
	return manageservice.getAllManageList();  
	}  
	
	@PostMapping("/addManageList")  
	private int saveManageList(@RequestBody ManageListBean managelist)   
	{  
		manageservice.saveOrUpdate(managelist);  
	return managelist.getId();
	}  
	
	@PutMapping("/updateManageList")  
	private ManageListBean update(@RequestBody ManageListBean managelist)   
	{  
		manageservice.saveOrUpdate(managelist);  
	return managelist;  
	} 
	
	
	@GetMapping("/getManageListById/{id}")  
	private ManageListBean getManageList(@PathVariable("id") int id)   
	{  
	return manageservice.getManageListById(id);  
	} 

	@DeleteMapping("/deleteManageListById/{id}")  
	private void deleteManageList(@PathVariable("id") int id)   
	{  
		manageservice.delete(id);  
	} 
	
 
}
