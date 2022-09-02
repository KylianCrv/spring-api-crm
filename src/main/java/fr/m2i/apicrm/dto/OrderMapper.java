package fr.m2i.apicrm.dto;

import fr.m2i.apicrm.model.Customer;
import fr.m2i.apicrm.model.Order;
import fr.m2i.apicrm.model.Status;

public class OrderMapper {

      public static OrderDTO buildOrderDTO(Order order) {

            if (order == null) {
                  return new OrderDTO();
            }

            CustomerDTO customerDTO = null;

            if (order.getCustomer() != null) {
                  customerDTO = CustomerMapper.buildCustomerDTO(order.getCustomer());
            }
            String state = null;
            if (order.getStatus() != null) {
                  state = order.getStatus().name();
            }

            return new OrderDTO(
                    order.getId(),
                    order.getType(),
                    order.getLabel(),
                    order.getNumberOfDays(),
                    order.getUnitPrice(),
                    order.getTotalExcludeTaxe(),
                    order.getTotalWithTaxe(),
                    state,
                    customerDTO);
      }

      public static Order buildOrder(OrderDTO dto) {
            if (dto == null) {
                  return null;
            }

            Customer customer = null;

            if (dto.getCustomer() != null && dto.getCustomer().getId() != null) {
                  customer = new Customer();
                  customer.setId(dto.getCustomer().getId());
            }

            Status state = null;

            if (dto.getStatus() != null) {
                  state = Status.valueOf(dto.getStatus());
            }
            return new Order(
                    dto.getId(),
                    dto.getType(),
                    dto.getLabel(),
                    dto.getNumberOfDays(),
                    dto.getUnitPrice(),
                    dto.getTotalExcludeTaxe(),
                    dto.getTotalWithTaxe(),
                    state,
                    customer);
      }

      public static Order copy(Order order, Order content) {

            if (order == null || content == null) {
                  return null;
            }

            if (content.getType() != null) {
                  order.setType(content.getType());
            }

            if (content.getLabel() != null) {
                  order.setLabel(content.getLabel());
            }

            if (content.getCustomer() != null && content.getCustomer().getId() != null) {
                  Customer customer = new Customer();
                  customer.setId(content.getCustomer().getId());
                  order.setCustomer(customer);
            }

            if (content.getNumberOfDays() != null) {
                  order.setNumberOfDays(content.getNumberOfDays());
            }

            if (content.getUnitPrice() != null) {
                  order.setUnitPrice(content.getUnitPrice());
            }

            if (content.getTotalExcludeTaxe() != null) {
                  order.setTotalExcludeTaxe(content.getTotalExcludeTaxe());
            }

            if (content.getTotalWithTaxe() != null) {
                  order.setTotalWithTaxe(content.getTotalWithTaxe());
            }

            if (content.getStatus() != null) {
                  order.setStatus(content.getStatus());
            }

            return order;
      }
}
