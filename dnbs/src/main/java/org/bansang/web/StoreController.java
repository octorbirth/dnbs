package org.bansang.web;

import java.util.List;

import org.bansang.dto.StoreDTO;
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
    public List<StoreDTO> list(){
		log.info("================");
		log.info(""+storeService.list());
		log.info("================");
		return storeService.list();
    }
	
}
