package com.weCode.bookStore.controller;
import com.weCode.bookStore.controller.dto.BookDta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
	@GetMapping
	public ResponseEntity<List<BookDta>> getBooks(){
		
		BookDta book = BookDta.builder()
				.title("My First book title")
				.build();
		
		List<BookDta> books = new ArrayList<>();
		books.add(book);
		
		return ResponseEntity.ok(books);
		
	}
}
