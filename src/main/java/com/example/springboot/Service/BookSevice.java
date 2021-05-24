package com.example.springboot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Model.Book;
import com.example.springboot.Model.User;
import com.example.springboot.Repo.BookRepo;
@Service 
public class BookSevice {
	@Autowired
	BookRepo repo;
	

	public List<Book> getAllBooks()   
	{  
	List<Book> books=new ArrayList<Book>();
	repo.findAll().forEach(book->books.add(book));
	return books;
  
	}  
	public void delete(int bid)
	{
		repo.deleteById(bid);
		
	}
	
}
