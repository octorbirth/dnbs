package org.bansang.web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.java.Log;

@RequestMapping("/upload/*")
@RestController
@Log
public class ImageUploadController {

	@PostMapping("/register")
	public void uploadRecommendImagePost(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("upload register POST!!!!!!!!!!!!!");
		log.info("" + file);
		
        log.info("======= UPLOAD =======");        

        UUID uuid = UUID.randomUUID();
        String uploadName = uuid.toString() + "_" + file.getOriginalFilename();
        String filePath = "C:\\zzz\\zupload\\" + uploadName;
        OutputStream out = new FileOutputStream(filePath);
        FileCopyUtils.copy(file.getInputStream(), out);

	}
}
