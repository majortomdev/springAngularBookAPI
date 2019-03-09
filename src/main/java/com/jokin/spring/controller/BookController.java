/*by Jkinahan 08-03-19*/
package com.jokin.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jokin.spring.model.Book;
import com.jokin.spring.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	//get all the books
	@GetMapping("/api/book")
	public ResponseEntity<List<Book>> list() {
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}
	
}
