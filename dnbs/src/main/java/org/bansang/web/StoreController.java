package org.bansang.web;

import org.bansang.dto.RecommendDTO;
import org.bansang.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import lombok.extern.java.Log;
@CrossOrigin
@RestController
@RequestMapping("/store/*")
@Log
=======
import org.bansang.dto.StoreDTO;
import org.bansang.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

>>>>>>> branch 'master' of https://github.com/octorbirth/dnbs.git
public class StoreController {
	
<<<<<<< HEAD

	@Autowired
	private StoreService storeService;
	
	@PostMapping("/recommend")
	public void addValue(@RequestBody RecommendDTO dto){
		storeService.register(dto);
	}
	
	@GetMapping("/list")
	public void list() {
		
	}
=======
	@Autowired
	StoreService storeService;
	
	@GetMapping("/{storeNum}")
	public StoreDTO getRecommendList(@RequestParam("storeNum") Long storeNum) {
	 		
	 	return storeService.getInfo(storeNum);
	}
>>>>>>> branch 'master' of https://github.com/octorbirth/dnbs.git
}
