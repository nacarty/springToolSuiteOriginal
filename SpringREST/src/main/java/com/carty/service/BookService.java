package com.carty.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carty.model.Books;
import com.carty.repo.BookRepo;

@Service	
public class BookService {
	@Autowired
	BookRepo repo;

	public List<Books> getAllBooks(){
		List<Books> list = new ArrayList<>();
		repo.findAll().forEach(books1->list.add(books1));
		return list;
		
	}
	
	public Books getBooksById(int bkId) {
		return repo.findById(bkId).get();
	}
	
	public void saveOrUpdate(Books books) {
		repo.save(books);
	}
	
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public void update(Books books, int id) {
		repo.save(books);
	}

	public void saveAll(List<Books> b) {
	
		repo.saveAll(b);
		
	}
}
