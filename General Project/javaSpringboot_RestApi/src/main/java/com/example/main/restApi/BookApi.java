package com.example.main.restApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.Book;
import com.example.main.service.BookService;

//@RestController
@Controller
@ResponseBody
public class BookApi {

	//@PathVariable  -->  http://localhost:8080/books/1
    //@RequestParam  -->  http://localhost:8080/books?id=1
	//While @RequestParams extract values from the query string, @PathVariables extract values from the URI path
		
	@Autowired
	private BookService bookService;
	
	//Get
	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
	public String getHelloWorld() {
		return "This is first Hello World!! String";
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> books() {
		if(this.bookService.getAllBooks().isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(this.bookService.getAllBooks()));
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> booksById(@PathVariable int id) {
		if(this.bookService.getBookById(id)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(this.bookService.getBookById(id)));
	}

	//Post
	@PostMapping("/books")
	public ResponseEntity<Book> AddBook(@RequestBody Book book) {
		try {
			return ResponseEntity.of(Optional.of(this.bookService.addBook(book)));
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//@DeleteMapping
	@DeleteMapping("/books/{id}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable int id) {
		if(this.bookService.getBookById(id)==null) {
		    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		this.bookService.deleteBook(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
}
