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

      public static Customer buildCustomer(CustomerDTO dto) {
            if (dto == null) {
                  return null;
            }

            Boolean state = "ACTIF".equals(dto.getState());

            return new Customer(dto.getId(),
                    dto.getLastname(),
                    dto.getFirstname(),
                    dto.getCompany(),
                    dto.getEmail(),
                    dto.getPhone(),
                    dto.getAdress(),
                    dto.getZipCode(),
                    dto.getCity(),
                    dto.getCountry(),
                    state
            );
      }

      public static Customer copy(Customer customer, Customer content) {

            if (customer == null || content == null) {
                  return null;
            }
            if (content.getLastname() != null) {
                  customer.setLastname(content.getLastname());
            }
            if (content.getFirstname() != null) {
                  customer.setFirstname(content.getFirstname());
            }
            if (content.getCompany() != null) {
                  customer.setCompany(content.getCompany());
            }
            if (content.getEmail() != null) {
                  customer.setEmail(content.getEmail());
            }
            if (content.getPhone() != null) {
                  customer.setPhone(content.getPhone());
            }
            if (content.getAdress() != null) {
                  customer.setAdress(content.getAdress());
            }
            if (content.getZipCode() != null) {
                  customer.setZipCode(content.getZipCode());
            }
            if (content.getCity() != null) {
                  customer.setCity(content.getCity());
            }
            if (content.getCountry() != null) {
                  customer.setCountry(content.getCountry());
            }
            if (content.getState() != null) {
                  customer.setState(content.getState());
            }
            return customer;
      }
}
