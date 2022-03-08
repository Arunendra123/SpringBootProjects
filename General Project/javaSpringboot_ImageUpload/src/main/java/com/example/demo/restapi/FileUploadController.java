package com.example.demo.restapi;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	Logger logger = LoggerFactory.getLogger(FileUploadController.class);
	
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	@PostMapping("/upload")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException {
		logger.info(file.getName());
		logger.info(file.getOriginalFilename());
		logger.info(Long.toString(file.getSize()));
		
		if(file.isEmpty()) {
			return ResponseEntity.internalServerError().body("Request must contain a file");
		} else if(!file.getContentType().equals("image/jpeg")) {
			return ResponseEntity.internalServerError().body("The only allowed format is jpeg");
		} else {
			String path=new ClassPathResource("static/images").getFile().getAbsolutePath();
			if(fileUploadHelper.upload(file, path)) {
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
			} else {
				return ResponseEntity.internalServerError().body("Something went wrong!!");
			}
		}
		
	}
}
