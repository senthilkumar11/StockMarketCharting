package com.premium.stc.service;

import java.util.List;

import com.premium.stc.model.IPOPlaned;

public interface IPOservice {
	public IPOPlaned getIPOBycompanyName(String companyName);
	public void insertIPO(IPOPlaned ipoPlaned)throws Exception;
	public List<IPOPlaned> getAllIpo()throws Exception;
}
