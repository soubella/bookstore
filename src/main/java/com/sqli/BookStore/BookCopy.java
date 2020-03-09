package com.sqli.BookStore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookCopy {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Customer customer;

    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public BookCopy() {
    }

    public BookCopy(Long id, Book book, Location location) {
        this.id = id;
        this.book = book;
        this.location = location;
        available=true;
    }

    public Book getBook() {
        return book;
    }

    public Location getLocation() {
        return location;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
