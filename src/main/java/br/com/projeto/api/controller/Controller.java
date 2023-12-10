package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Customer;
import br.com.projeto.api.repository.CustomerRepository;

@RestController
public class Controller {

    @Autowired
    private CustomerRepository action;

    @PostMapping("/")
    public Customer register(@RequestBody Customer customer){
        return action.save(customer);
    }

    @GetMapping("/")
    public Iterable<Customer> select(){
        return action.findAll();
    }

}
