package fr.m2i.apicrm.dto;

import fr.m2i.apicrm.model.Customer;

public class CustomerMapper {

      public static CustomerDTO buildCustomerDTO(Customer customer) {

            if (customer == null) {
                  return new CustomerDTO();
            }
            String state = customer.getState() != null && customer.getState() ? "ACTIF" : "INACTIF";

            return new CustomerDTO(
                    customer.getId(),
                    customer.getLastname(),
                    customer.getFirstname(),
                    customer.getCompany(),
                    customer.getEmail(),
                    customer.getPhone(),
                    customer.getAdress(),
                    customer.getZipCode(),
                    customer.getCity(),
                    customer.getCountry(),
                    state
            );
      }

      public static Customer buildCustomer(CustomerDTO customerDTO) {
            if (customerDTO == null) {
                  return new Customer();
            }

            Boolean state;
            if (customerDTO.getState().equals("ACTIF")) {
                  state = true;
            } else {
                  state = false;
            }

            return new Customer(customerDTO.getId(),
                    customerDTO.getLastname(),
                    customerDTO.getFirstname(),
                    customerDTO.getCompany(),
                    customerDTO.getEmail(),
                    customerDTO.getPhone(),
                    customerDTO.getAdress(),
                    customerDTO.getZipCode(),
                    customerDTO.getCity(),
                    customerDTO.getCountry(),
                    state
            );
      }

      public static Customer copy(Customer customer, Customer content) {

            return null;
      }
}
