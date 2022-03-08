package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.main.jpa.Repository.UserDao;
import com.example.main.jpa.service.UserService;

@SpringBootApplication
public class JavaSpringbootApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationcontext=SpringApplication.run(JavaSpringbootApplication.class,args);
		UserDao userrepo=applicationcontext.getBean(UserDao.class);
		
		//========================================================================|
		
		UserService userservice=new UserService();
		
		userservice.listUser(userrepo);
		
		userservice.getUserById(userrepo, 2);
		
		userservice.getUserByName(userrepo, "Dheeru");
		
		userservice.getUserByNameOrPassword(userrepo, "Dheeru","232323");
		
		userservice.getUserByNameAndPassword(userrepo, "Dheeru","23323");
		
		userservice.getAllUser(userrepo);
		
		userservice.getAllUserByName(userrepo,"Dheeru");
		
		//========================================================================|
	}
}
