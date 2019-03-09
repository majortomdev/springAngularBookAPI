/*by Jkinahan 08-03-19*/
package com.jokin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jokin.spring.dao.BookDAO;
import com.jokin.spring.model.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDAO;
	@Override
	public long save(Book book) {
		 
		return 0;
	}

	@Override
	public Book get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Book> list() {
		return bookDAO.list();
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
