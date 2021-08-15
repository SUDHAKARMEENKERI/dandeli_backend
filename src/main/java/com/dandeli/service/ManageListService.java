package com.dandeli.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dandeli.model.ManageListBean;
import com.dandeli.repository.ManageListRep;

@Service
@Transactional
public class ManageListService {

	@Autowired
	 private ManageListRep manage_repository;
	
	public List<ManageListBean> getAllManageList() {
		// TODO Auto-generated method stub
//		List<ManageListBean> managelist = new ArrayList<ManageListBean>();
		
		return manage_repository.findAll();  
//		System.out.println(managelist);
//		return managelist;  
	}
	
	public void saveOrUpdate(ManageListBean managelist)   
	{  
		manage_repository.save(managelist);  
	}

	public ManageListBean getManageListById(int id) {
		// TODO Auto-generated method stub
		return manage_repository.findById(id).get();  
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		manage_repository.deleteById(id);
		
	}  

}
