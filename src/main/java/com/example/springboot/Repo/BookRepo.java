package com.example.springboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.springboot.Model.Book;
import com.example.springboot.Model.User;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
