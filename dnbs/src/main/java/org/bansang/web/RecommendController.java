package org.bansang.web;

import org.bansang.dto.RecommendDTO;
import org.bansang.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@CrossOrigin
@RestController
@RequestMapping("/recommend/*")
@Log
public class RecommendController {
	
	@Autowired
	private RecommendService recommendService;
}
