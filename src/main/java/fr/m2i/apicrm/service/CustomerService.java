package fr.m2i.apicrm.service;

import fr.m2i.apicrm.exception.NotFoundException;
import fr.m2i.apicrm.model.Customer;
import fr.m2i.apicrm.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

      private final CustomerRepository repo;

      @Autowired
      public CustomerService(CustomerRepository repo) {
            this.repo = repo;
      }

      @Override
      public List<Customer> findAll() {
            return repo.findAll();
      }

      @Override
      public Customer findById(Long id) {
            return repo.findById(id).orElseThrow(() -> new NotFoundException("Customer with id : " + id + " doesn't exist"));

      }

      @Override
      public Customer create(Customer customer) {

            return repo.save(customer);
      }

      @Override
      public Customer update(Long id, Customer customer) {
            return customer;
      }

      @Override
      public void delete(Customer customer) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
}
