package org.bansang.web;

import org.bansang.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/sample/*")
@Log
public class SampleController {
	
//	@Autowired
//	private SampleService sampleService;
	
	@GetMapping("/test")
	public void getSample() {
		log.info(".........");
		return;
	}
	
}
