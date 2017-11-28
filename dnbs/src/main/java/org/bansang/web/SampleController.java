package org.bansang.web;

import java.util.List;

import org.bansang.dto.SampleDTO;
import org.bansang.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@CrossOrigin
@RestController
@RequestMapping("/sample/*")
@Log
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/list")
	public List<SampleDTO> list() {
		log.info(""+sampleService.list());
		return sampleService.list();
	}
}
