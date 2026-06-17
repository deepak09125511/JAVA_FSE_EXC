package com.deepak.basicSpringFse.service;

import com.deepak.basicSpringFse.repository.BookRepository;

public class BookService {
    private BookRepository repo;


    public void setRepo(BookRepository repo) {
        this.repo = repo;
    }
    public int returnToMain(){
        System.out.println("method called");
        int x = repo.goBack();
        return x;
    }

}
