package com.dandeli.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandeli.model.AdverticementBean;
import com.dandeli.model.BannerListBean;
import com.dandeli.model.EmergencyContactBean;
import com.dandeli.repository.AdverticementRep;
import com.dandeli.repository.BannerListRep;
import com.dandeli.repository.EmergencyContactRep;

@Service
@Transactional
public class DandeliPanelService {
	
	@Autowired
	public BannerListRep banerlistRep;
	
	@Autowired
	public AdverticementRep adverticeRep;
	
	@Autowired
	public EmergencyContactRep emergencyRep;
	
	/*---------------------BANNER APIS --------------------*/

	
	public List<BannerListBean> getAllBannerList() {
		return banerlistRep.findAll();
	}
	
	public void saveOrUpdateBannerList(BannerListBean bannerlist) {
		banerlistRep.save(bannerlist);
	} 
	
	public void deleteBannerList(int id) {
		 banerlistRep.deleteById(id);
	}
	
	/*---------------------ADVERTICEMENT APIS --------------------*/

	public List<AdverticementBean> getAllAdverticementList() {
		return adverticeRep.findAll();
	}
	
	public void saveOrUpdateAdverticementList(AdverticementBean adverticelist) {
		adverticeRep.save(adverticelist);
	} 
	
	public void deleteAdverticementList(int id) {
		adverticeRep.deleteById(id);
	}
	
	/*---------------------EMERGENCY CONTACT APIS --------------------*/
	
	public List<EmergencyContactBean> getAllEmergencyContactList() {
		return emergencyRep.findAll();
	}
	
	public void saveOrUpdateEmergencyContactList(EmergencyContactBean emergency) {
		emergencyRep.save(emergency);
	} 
	
	public void deleteEmergencyContactList(int id) {
		emergencyRep.deleteById(id);
	}
}

