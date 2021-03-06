package com.premium.stc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.premium.stc.model.StockPrice;
import com.premium.stc.service.UploadService;


@CrossOrigin(origins = "http://localhost:4201")
@RestController
public class UploadController {
	@Autowired
	private UploadService uploadService;

	@PostMapping("/upload")
	public List<StockPrice> upload(@RequestParam("file") MultipartFile file) throws Exception {
		return uploadService.upload(file);
	}
}
