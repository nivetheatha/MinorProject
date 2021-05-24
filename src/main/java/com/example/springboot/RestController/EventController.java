package com.example.springboot.RestController;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Model.Book;
import com.example.springboot.Model.Event;
import com.example.springboot.Service.EventService;


@RestController
public class EventController {
@Autowired
EventService eservice;
@RequestMapping("/event")
public List<Event> event()
{
	return eservice.getAllEvents();
	
		
}
@RequestMapping("/eventByDate")
public List<Event> eventByDate(Date edate)
{
	return eservice.getAllEventsByDate(edate);
	
		
}



}
