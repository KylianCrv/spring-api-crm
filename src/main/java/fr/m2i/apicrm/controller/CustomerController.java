package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerController {

      private final CustomerService customerService;

      @Autowired
      public CustomerController(CustomerService customerService) {
            this.customerService = customerService;
      }

}
