package com.dandeli.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandeli.model.DandeliListingBean;
import com.dandeli.model.ManageListBean;
import com.dandeli.repository.DandeliListRepo;

@Service
@Transactional
public class DandeliListService {
	
	@Autowired
	public DandeliListRepo dandeliListRep;
	
	// DandeliList APIS
	
	public List<DandeliListingBean> getAllDandeliList() {
		return dandeliListRep.findAll();
	}
	
	public void saveOrUpdateDandeliList(DandeliListingBean dandelilist) {
		dandeliListRep.save(dandelilist);
	}
	
	public void saveOrUpdate(DandeliListingBean managelist) {  
		dandeliListRep.save(managelist);  
	}
	
	public void deleteDandeliList(int id) {
		dandeliListRep.deleteById(id);
	}
}
