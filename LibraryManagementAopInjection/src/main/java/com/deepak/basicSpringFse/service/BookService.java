package com.deepak.basicSpringFse.service;

import com.deepak.basicSpringFse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    private BookRepository repo;

    public BookService(BookRepository repo){
        this.repo  = repo;
    }
    public void setRepo(BookRepository repo) {
        this.repo = repo;
    }
    public int returnToMain(){
        System.out.println("method called");
        int x = repo.goBack();
        return x;
    }

}
