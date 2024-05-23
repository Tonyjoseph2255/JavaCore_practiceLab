package org.ust.mylearning;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedList {
	
	static class Book{
		Book(String name, String author, int year, int sold) {
            this.name = name;
            this.author = author;
            this.year = year;
            this.solded = sold;
        }
		String name;
		String author;
		int year;
		int solded;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book>bookList=new ArrayList<>();
		bookList.add(new Book("string","string",2017,10));
		for(Book book:bookList) {
			System.out.println(book.name);
		}
		

	}

}
