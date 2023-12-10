package br.com.projeto.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long >{
    
}
