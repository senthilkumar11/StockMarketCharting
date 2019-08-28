package com.premium.stc.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.model.IPOPlaned;
import com.premium.stc.service.IPOservice;
@CrossOrigin(origins = "http://localhost:4201")
@RestController
public class IPORestController {
	@Autowired
	IPOservice ipoService;
	@GetMapping("/ipodetails/{companyname}")
	public IPOPlaned getIPODetailsByCompany(@PathVariable("companyname") String companyName) throws Exception
	{
		
		return ipoService.getIPOBycompanyName(companyName);
		
	}

	@RequestMapping(value="/getipo", method = RequestMethod.GET)
	public List<IPOPlaned> getIpo() throws Exception
	{
		return ipoService.getAllIpo();
	}
}
