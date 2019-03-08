//by joek 080319
package com.jokin.spring.dao;

import java.util.List;

import com.jokin.spring.model.Book;

public interface BookDAO { 
	
	//save the record
	long save(Book book);
	
	//get a singel record
	Book get(Long id);
	
	//get all the records
	List<Book> list();
	
	//update a record
	void update(long id, Book book);
	
	//delete a record
	void delete(long id);

}
