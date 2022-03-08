package com.example.main.jpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.main.jpa.Entity.User;

/*
Annotation
@CRUDRepository
@JpaRepository
*/

public interface UserDao extends JpaRepository<User, Integer> {
      
	/*
	 Derived Query
	 find--> Introducer
	 ByName-->criteria query 
	 
	 Query Creation
	 https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	 */
	
	public List<User> findByName(String name);
	public List<User> findByPassword(String password);
	public List<User> findByNameOrPassword(String name,String password);
	public List<User> findByNameAndPassword(String name,String password);
	
	//Using Native Query or JPQL
	@Query("select u from User u")
	public List<User> getAllUser();
	
	@Query("select u from User u where u.name =:n")
	public List<User> getAllUserByName(@Param("n") String name);
}
