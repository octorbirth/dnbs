package org.bansang.web;

import org.bansang.dto.StoreDTO;
import org.bansang.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@GetMapping("/{storeNum}")
	public StoreDTO getRecommendList(@RequestParam("storeNum") Long storeNum) {
	 		
	 	return storeService.getInfo(storeNum);
	}
}
