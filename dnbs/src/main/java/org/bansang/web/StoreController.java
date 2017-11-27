package org.bansang.web;

import org.bansang.dto.StoreDTO;
import org.bansang.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
@CrossOrigin
@RestController
@RequestMapping("/store/*")
@Log
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	
	@PostMapping("/recommend")
	public void addValue(@RequestBody StoreDTO dto) {
		log.info("========================");
		log.info(""+ dto);
		log.info("========================");
		storeService.recommend(dto);
	}
	
	@GetMapping("/list")
	public void list() {
		
	}
}
