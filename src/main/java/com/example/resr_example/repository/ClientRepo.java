package com.example.resr_example.repository;

import com.example.resr_example.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo {

    void create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id);

    boolean delete(int id);
}
