package org.bansang.web;

import java.io.FileOutputStream;
import java.util.Base64;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.java.Log;

@RequestMapping("/upload/*")
@Controller
@Log
public class ImageUploadController {

	@GetMapping("/register")
	public void uploadRecommendImageGet() {
		System.out.println("upload register GET!!!!!!!!!!!!!");
	}

	@PostMapping("/")
	public @ResponseBody String uploadRecommendImagePost(@RequestParam("file") String file) {
		System.out.println("upload register POST!!!!!!!!!!!!!");
		log.info("" + file);
		
//		try {
//			// This will decode the String which is encoded by using Base64 class
//			byte[] imageByte = Base64.getDecoder().decode(file);
//
//			String directory = "C:\\zzz\\";
//
//			new FileOutputStream(directory).write(imageByte);
//			return "success ";
//		} catch (Exception e) {
//			return "error = " + e;
//		}
		
		return null;

	}
}
