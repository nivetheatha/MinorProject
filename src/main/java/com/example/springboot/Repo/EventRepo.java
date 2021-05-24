package com.example.springboot.Repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.Model.Event;


public interface EventRepo extends  JpaRepository<Event,Integer>{

	
	List<Event> findByEdate(Date edate);
	
	
	
}
