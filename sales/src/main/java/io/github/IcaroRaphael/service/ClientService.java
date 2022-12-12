package io.github.IcaroRaphael.service;

import io.github.IcaroRaphael.model.Client;
import io.github.IcaroRaphael.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository repository;

    @Autowired
    public ClientService (ClientRepository repository){
        this.repository = repository;
    }

    public void salveClient(Client client){
        validateClient(client);
        this.repository.save(client);
    }

    public void validateClient(Client client){
        //Aplica validações
    }
}
