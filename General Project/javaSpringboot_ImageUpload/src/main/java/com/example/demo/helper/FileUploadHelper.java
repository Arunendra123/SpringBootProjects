package com.example.demo.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public boolean upload(MultipartFile file,String path) {
		boolean f=false;
		try {
			InputStream is=file.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			
			FileOutputStream fout=new FileOutputStream(path+File.separator+file.getOriginalFilename());
			fout.write(data);
			fout.flush();
			fout.close();
			f=true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
}
