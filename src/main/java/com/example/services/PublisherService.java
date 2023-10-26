package com.example.services;

import com.example.db.Entity.Publisher;

import java.util.List;

public interface PublisherService {

    Publisher savePublisher(Publisher publisher);

    List<Publisher> getAllPublisher();

    Publisher getPublisher(int id);

    void removePublisher(int id);
}
