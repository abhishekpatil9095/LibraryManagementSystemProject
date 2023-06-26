package com.service;

public class Book {

	int id;
	String title;
	String author;
	String genre;
	int year;
	int quantity;
	
	public Book()
	{
		
	}
	public Book(int id, String title, String author, String genre, int year, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
		this.quantity = quantity;
	}
	public Book(String title, String author, String genre, int year, int quantity)
	{
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", year=" + year
				+ ", quantity=" + quantity + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
