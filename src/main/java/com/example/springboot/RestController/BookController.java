package com.example.springboot.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.Model.Book;
import com.example.springboot.Repo.BookRepo;
import com.example.springboot.Service.BookSevice;

@RestController
public class BookController {
@Autowired
BookSevice bservice;
@RequestMapping("/book")
public List<Book> book()
{
	
	return bservice.getAllBooks();
		
}
@RequestMapping("/deleteBook")
public String deleteBook(@RequestParam int bid)
{
	bservice.delete(bid);
	return "Book Deleted";
}

}
