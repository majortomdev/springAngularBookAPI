//by joek 08-03-19
package com.jokin.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jokin.spring.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(Book book) {
		return 0;
	}

	@Override
	public Book get(Long id) {
		return null;
	}

	@Override
	public List<Book> list() {
		@SuppressWarnings("unchecked")
		List<Book> list = sessionFactory.getCurrentSession().createQuery("FROM book").list();
		return list;
	}

	@Override
	public void update(long id, Book book) {
		
	}

	@Override
	public void delete(long id) {
	
		
	}
	
}
