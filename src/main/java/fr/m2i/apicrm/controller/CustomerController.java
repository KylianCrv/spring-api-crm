package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.dto.CustomerDTO;
import fr.m2i.apicrm.dto.CustomerMapper;
import fr.m2i.apicrm.exception.NotFoundException;
import fr.m2i.apicrm.service.CustomerService;
import fr.m2i.apicrm.model.Customer;
import fr.m2i.apicrm.response.ErrorResponseEntity;

import fr.m2i.apicrm.service.ICustomerService;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {

      private final ICustomerService customerService;

      @Autowired
      public CustomerController(ICustomerService customerService) {
            this.customerService = customerService;
      }

      @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
      public ResponseEntity<Object> getAllCustomers() {
            List<Customer> customers = customerService.findAll();
            List<CustomerDTO> dtos = new ArrayList();

            for (Customer customer : customers) {
                  CustomerDTO dto = CustomerMapper.buildCustomerDTO(customer);
                  dtos.add(dto);
            }
            return ResponseEntity.status(HttpStatus.OK).body(dtos);
      }

      @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
      public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id) {

            try {

                  Long customerId = Long.parseLong(id);
                  Customer founded = customerService.findById(customerId);
                  CustomerDTO dto = CustomerMapper.buildCustomerDTO(founded);

                  return ResponseEntity.status(HttpStatus.OK).body(dto);

            } catch (NumberFormatException ne) {
                  return ErrorResponseEntity.build("the parameter id is not valid", 400, "/v1/customer/" + id, HttpStatus.MULTI_STATUS);
            } catch (NotFoundException nfe) {
                  return ErrorResponseEntity.build("Customer not found", 404, "/v1/customer/" + id, HttpStatus.NOT_FOUND);
            } catch (Exception e) {
                  return ErrorResponseEntity.build("An error occured", 500, "/v1/customer/" + id, HttpStatus.INTERNAL_SERVER_ERROR);
            }
      }

      @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
      public ResponseEntity<Object> createCustomer(@RequestBody CustomerDTO customerDTO) {
            Customer customer = customerService.create(CustomerMapper.buildCustomer(customerDTO));

            return ResponseEntity.status(HttpStatus.CREATED).body(customer);
      }
}
