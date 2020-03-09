package com.sqli.BookStore;

import com.sqli.BookStore.repository.BookCopyRepository;
import com.sqli.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BookStoreServiceImpl implements BookStoreService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookCopyRepository bookCopyRepository;

    @Override
    public Set<Book> findBooksByKey(String key) {
        return bookRepository.findBooksByTitleOrAuthor(key,key);
    }

    @Override
    public boolean checkStock(Long bookId) {
        return false;
    }

    @Override
    public BookCopy findCopyInStore(Long bookId) {
        return null;
    }

    @Override
    public void confirmOrder(BookCopy copy, Customer customer) {
        if(copy.isAvailable()) {
            copy.setCustomer(customer);
            copy.setAvailable(false);
        }else {
            throw new RuntimeException("no copy is available");
        }
    }

    private Optional<BookCopy> findAvailableCopy(int bookId)
    {
        return null;
    }
}