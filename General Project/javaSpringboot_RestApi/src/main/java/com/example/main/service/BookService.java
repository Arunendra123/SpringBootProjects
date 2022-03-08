package com.example.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.main.entity.Book;

@Component
public class BookService {

	public static List<Book> books=new ArrayList<Book>();
	static {
		books.add(new Book(1,"A",200));
		books.add(new Book(2,"B",200));
		books.add(new Book(3,"Z",200));
		books.add(new Book(4,"C",200));
		books.add(new Book(5,"D",200));
		books.add(new Book(6,"A",200));
		books.add(new Book(7,"E",200));
		books.add(new Book(8,"F",200));
		books.add(new Book(9,"G",200));
	}
	
    public List<Book> getAllBooks(){
		return books;
	}
    
    public List<Book> getBookByName(String name){
    	return books.stream().filter(b->b.getName()==name).collect(Collectors.toList());
    }
    
    public Book getBookById(int id){
    	try {
    		return books.stream().filter(b->b.getId()==id).findFirst().get(); 
    	} catch(Exception e) {
    	    e.printStackTrace();
    		return null;
    	}
    }
    
    public Book addBook(Book book) {
    	books.add(book);
    	return book;
    }
    
    public void deleteBook(int id) {
    	 books=books.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
    }
    
    public Book updateBook(Book book) {
    	books=books.stream().map(b->{
    		if(b.getId()==book.getId()) {
    			b.setName(book.getName());
    			b.setPageNumber(book.getPageNumber());
    		}
    		return b;
    	}).collect(Collectors.toList());
        return book;
    }
}
