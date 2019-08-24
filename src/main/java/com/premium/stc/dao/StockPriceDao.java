package com.premium.stc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.premium.stc.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer> {
	
	List<StockPrice> findByCompanyCode(int companyCode);
		@Query("Select s from StockPrice s where s.companyCode= :companyCode and s.date between :from_date and :to_date ")
			public List<StockPrice> getStockPrice(@Param("companyCode") int companyCode,@Param("from_date") Date from_date,@Param("to_date") Date to_date); 
		 

   
}
