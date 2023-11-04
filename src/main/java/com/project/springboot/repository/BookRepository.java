package com.project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
