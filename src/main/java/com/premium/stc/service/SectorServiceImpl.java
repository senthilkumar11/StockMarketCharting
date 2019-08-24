package com.premium.stc.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.CompanyDao;
import com.premium.stc.dao.SectorDao;
import com.premium.stc.dao.StockPriceDao;
import com.premium.stc.model.Company;
import com.premium.stc.model.Sector;
import com.premium.stc.model.StockPrice;
@Service
public class SectorServiceImpl implements SectorService {
	@Autowired
	private SectorDao sectorDao;
	@Autowired
	private CompanyDao companyDao;
	@Autowired
	StockPriceDao stockPriceDao;
	public Sector insert(Sector sector) throws ClassNotFoundException, SQLException {
		return sectorDao.save(sector) ;
	}

	public List<Sector> getAllSector() throws ClassNotFoundException, SQLException {
		return sectorDao.findAll();
	}

	
	public List<StockPrice> getSectorPrice(String SectorName,Date from,Date to) throws ClassNotFoundException, SQLException {
		Sector sector=sectorDao.findByName(SectorName);
		
		List<Company> companyList=companyDao.findBySectorId(sector.getId());
		System.out.println(from);
		List<StockPrice> stockPriceList =new ArrayList<>();
		for(Company company:companyList)
		{
			
		List<StockPrice> companyStock=stockPriceDao.getStockPrice(company.getId(), from, to);
			stockPriceList.addAll(companyStock);
		}
		return stockPriceList;
	}
	

}
