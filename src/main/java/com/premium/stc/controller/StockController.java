package com.premium.stc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.model.StockExchange;
import com.premium.stc.service.StockExchangeService;
@CrossOrigin(origins = "http://localhost:4201")
@RestController
public class StockController {
	@Autowired
	StockExchangeService stockExchangeService;
	@GetMapping(path="/stockexchangelist")
	public List<StockExchange> getStockList() throws Exception {
		 return stockExchangeService.getStockList();
	}
	
	@PostMapping(path="/insertstockexchange")
	public void createStockExchange(@RequestBody StockExchange stockExchange) throws Exception
	{
		System.out.println(stockExchange);
		stockExchangeService.insertStockExchange(stockExchange);
	}
	
	
}
