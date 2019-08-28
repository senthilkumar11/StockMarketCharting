package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.IPOPlanedDao;
import com.premium.stc.model.IPOPlaned;
@Service
public class IPOServiceImpl implements IPOservice {
	@Autowired
	IPOPlanedDao ipoPlanedDao;
	public IPOPlaned getIPOBycompanyName(String companyName) {
		
		return ipoPlanedDao.findByCompanyName(companyName);
	}
	public void insertIPO(IPOPlaned ipoPlaned) throws Exception {
		ipoPlanedDao.save(ipoPlaned);
		
	}
	public List<IPOPlaned> getAllIpo() throws Exception {
	
		return ipoPlanedDao.findAll();
	}

}
