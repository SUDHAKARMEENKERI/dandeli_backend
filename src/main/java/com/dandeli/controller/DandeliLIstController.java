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

import com.dandeli.model.DandeliListingBean;
import com.dandeli.service.DandeliListService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class DandeliLIstController {

	@Autowired
	private DandeliListService dandeliListService;
	
	@GetMapping("/getDandeliList")  
	private List<DandeliListingBean> getAllDandeliList()   
	{  
	return dandeliListService.getAllDandeliList();  
	}  
	
	@PostMapping("/addDandeliList")  
	private int saveManageList(@RequestBody DandeliListingBean dandelilist)   
	{  
		dandeliListService.saveOrUpdateDandeliList(dandelilist);
	return dandelilist.getId();
	}  
	
	@PutMapping("/updateDandeliList")  
	private DandeliListingBean update(@RequestBody DandeliListingBean dandelilist)   
	{  
		dandeliListService.saveOrUpdate(dandelilist);  
	return dandelilist;  
	} 

	@DeleteMapping("/deleteDandeliListById/{id}")  
	private void deleteManageList(@PathVariable("id") int id)   
	{  
		dandeliListService.deleteDandeliList(id);  
	} 
	
}
