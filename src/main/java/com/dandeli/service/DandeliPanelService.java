package com.dandeli.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandeli.model.BannerListBean;
import com.dandeli.repository.BannerListRep;

@Service
@Transactional
public class DandeliPanelService {
	
	@Autowired
	public BannerListRep banerlistRep;
	
	public List<BannerListBean> getAllBannerList() {
		return banerlistRep.findAll();
	}
	
	public void saveOrUpdateBannerList(BannerListBean bannerlist) {
		banerlistRep.save(bannerlist);
	} 
	
	public void deleteBannerList(int id) {
		 banerlistRep.deleteById(id);
	}
}
