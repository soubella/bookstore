package com.sqli.BookStore.repository;

import com.sqli.BookStore.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCopyRepository extends JpaRepository<BookCopy,Long> {
}
