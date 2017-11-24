package org.bansang.web;

import org.bansang.dto.RecommendDTO;
import org.bansang.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@RequestMapping("/Recommend/*")
@Log
public class RecommendController {
	
	@Autowired
	private RecommendService service;

	@CrossOrigin
	@PostMapping("/recommend")
	public void addValue(@RequestBody RecommendDTO dto) {
		log.info("========================");
		log.info(""+ dto);
		log.info("========================");
		service.recommend(dto);
	}

}
