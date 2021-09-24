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

import com.dandeli.model.AdverticementBean;
import com.dandeli.model.BannerListBean;
import com.dandeli.model.EmergencyContactBean;
import com.dandeli.model.ResortHomeStayBean;
import com.dandeli.service.DandeliPanelService;

@RestController
@RequestMapping("/panel/v1")
@CrossOrigin

public class DandeliPanelController {
	
	@Autowired
	public DandeliPanelService dandeli_service;
	
	/*---------------------BANNER APIS --------------------*/
	
	@GetMapping("/getBannerlist")  
	private List<BannerListBean> getAllBannerList()   
	{  
		return dandeli_service.getAllBannerList();  
	}

	@PostMapping("/addBanner")
	private int addBannerList(@RequestBody BannerListBean bannerData) {
		dandeli_service.saveOrUpdateBannerList(bannerData);
		return bannerData.getId();
	}
	
	@PutMapping("/updateBanner")
	private BannerListBean updateBanner(@RequestBody BannerListBean bannerData) {
		dandeli_service.saveOrUpdateBannerList(bannerData);
		return bannerData;
	}
	@DeleteMapping("/deleteBannerById/{id}")
	private void BannerDeleteById(@PathVariable("id") int id) {
		dandeli_service.deleteBannerList(id);
	}
	
	/*---------------------ADVERTICEMENT APIS --------------------*/
	
	@GetMapping("/getAdverticementlist")  
	private List<AdverticementBean> getAllAdverticement()   
	{  
		return dandeli_service.getAllAdverticementList();  
	}

	@PostMapping("/addAdverticement")
	private int addAdverticementList(@RequestBody AdverticementBean adverticementData) {
		dandeli_service.saveOrUpdateAdverticementList(adverticementData);
		return adverticementData.getId();
	}
	
	@PutMapping("/updateAdverticement")
	private AdverticementBean updateBanner(@RequestBody AdverticementBean adverticementData) {
		dandeli_service.saveOrUpdateAdverticementList(adverticementData);
		return adverticementData;
	}
	@DeleteMapping("/deleteAdverticementById/{id}")
	private void AdverticementDeleteById(@PathVariable("id") int id) {
		dandeli_service.deleteAdverticementList(id);
	}
	
	/*---------------------Emergency Contact APIS --------------------*/
	
	@GetMapping("/getAllEmergencyContactlist")  
	private List<EmergencyContactBean> getAllEmergencyContact()   
	{  
		return dandeli_service.getAllEmergencyContactList();  
	}

	@PostMapping("/addEmergencyContact")
	private int addEmergencyContactList(@RequestBody EmergencyContactBean emergencylist) {
		dandeli_service.saveOrUpdateEmergencyContactList(emergencylist);
		return emergencylist.getId();
	}
	
	@PutMapping("/updateEmergencyContact")
	private EmergencyContactBean updateEmergencyContact(@RequestBody EmergencyContactBean emergencylist) {
		dandeli_service.saveOrUpdateEmergencyContactList(emergencylist);
		return emergencylist;
	}
	@DeleteMapping("/deleteEmergencyContactById/{id}")
	private void EmergencyContactDeleteById(@PathVariable("id") int id) {
		dandeli_service.deleteAdverticementList(id);
	}
	
	/*---------------------RESORT HOME STAY APIS --------------------*/

	@GetMapping("/getAllResortHomeStaylist")  
	private List<ResortHomeStayBean> getAllResortHomeStay()   
	{  
		return dandeli_service.getAllResortHomeStayList();  
	}

	@PostMapping("/addResortHomeStay")
	private int addResortHomeStayList(@RequestBody ResortHomeStayBean resortlist) {
		dandeli_service.saveOrUpdateResortHomeStayList(resortlist);
		return resortlist.getId();
	}
	
	@PutMapping("/updateResortHomeStayt")
	private ResortHomeStayBean updateResortHomeStay(@RequestBody ResortHomeStayBean resortlist) {
		dandeli_service.saveOrUpdateResortHomeStayList(resortlist);
		return resortlist;
	}
	@DeleteMapping("/deleteResortHomeStayById/{id}")
	private void resortHomeStayDeleteById(@PathVariable("id") int id) {
		dandeli_service.deleteResortHomeStayList(id);
	}
	
}
