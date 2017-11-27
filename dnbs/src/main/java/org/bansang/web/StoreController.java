package org.bansang.web;

import java.util.List;

import org.bansang.dto.RecommendDTO;
import org.bansang.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	
	@GetMapping("/list")
    public List<RecommendDTO> list(){
		log.info("================");
		log.info(""+storeService.list());
		log.info("================");
		return storeService.list();
    }
	
	@GetMapping("/view")
	public RecommendDTO getView(Long storeNumber) {
		log.info("================");
		log.info(""+storeService.view(storeNumber));
		log.info("================");
		return storeService.view(storeNumber);
	}
	
}
