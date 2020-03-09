package com.sqli.BookStore.repository;

import com.sqli.BookStore.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Set<Book> findBooksByTitleOrAuthor(String title,String author);
}
