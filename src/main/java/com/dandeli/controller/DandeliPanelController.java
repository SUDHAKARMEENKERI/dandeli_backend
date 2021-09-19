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

import com.dandeli.model.BannerListBean;
import com.dandeli.service.DandeliPanelService;

@RestController
@RequestMapping("/panel/v1")
@CrossOrigin

public class DandeliPanelController {
	
	@Autowired
	public DandeliPanelService dandeli_service;
	
	@GetMapping("/getBannerlist")  
	private List<BannerListBean> getAllManageList()   
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
}




