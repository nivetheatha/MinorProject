package com.example.springboot.Service;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Model.Book;
import com.example.springboot.Model.Event;
import com.example.springboot.Repo.EventRepo;
@Service
public class EventService {
@Autowired
EventRepo erepo;
public List<Event> getAllEvents()   
{  
List<Event> events=new ArrayList<Event>();
erepo.findAll().forEach(event->events.add(event));
return events;

}  
public List<Event> getAllEventsByDate(Date edate)   
{  
List<Event> events=new ArrayList<Event>();
erepo.findByEdate(edate).forEach(event->events.add(event));
return events;

}  



}
