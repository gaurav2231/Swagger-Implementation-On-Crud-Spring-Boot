package com.example.db.Entity;

import javax.persistence.*;

@Entity
@Table( name = "book" )
public class Book {

    @Id
    @SequenceGenerator( name = "book_id_seq", sequenceName = "book_id_seq", allocationSize = 1 )
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "book_id_seq" )
    private int id;

    private String title;

    private String available;

    private String author;

    private double price;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( referencedColumnName = "id", nullable = false )
    private Publisher publisher;

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

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Book(int id, String title, String available, String author, double price, Publisher publisher) {
		super();
		this.id = id;
		this.title = title;
		this.available = available;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public Book() {
		super();
	}
    
    
}
