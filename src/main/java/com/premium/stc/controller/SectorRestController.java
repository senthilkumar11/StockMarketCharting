package com.premium.stc.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.StockPrice;
import com.premium.stc.service.SectorService;
@RestController
public class SectorRestController {
	@Autowired
	SectorService sectorService;		
	@GetMapping("/sectorprice/{sectorname}/{from}/{to}")
	List<StockPrice> getSectorPrice(@PathVariable("sectorname") String sector ,@PathVariable("from")String from,@PathVariable("to")String to) throws ClassNotFoundException, SQLException, ParseException
	{
		DateFormat datefm = new SimpleDateFormat("dd-MM-yyyy");
		return sectorService.getSectorPrice(sector,datefm.parse(from),datefm.parse(to));
		
	}
}
