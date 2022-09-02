package fr.m2i.apicrm.dto;

import fr.m2i.apicrm.model.Customer;

public class OrderDTO {

      private Long id;

      private String type;

      private String label;

      private String numberOfDays;

      private Integer unitPrice;

      private Float totalExcludeTaxe;

      private Float totalWithTaxe;

      private String status;

      private Customer customer;

      public OrderDTO() {
      }

      public OrderDTO(Long id, String type, String label, String numberOfDays, Integer unitPrice, Float totalExcludeTaxe, Float totalWithTaxe, String status, Customer customer) {
            this.id = id;
            this.type = type;
            this.label = label;
            this.numberOfDays = numberOfDays;
            this.unitPrice = unitPrice;
            this.totalExcludeTaxe = totalExcludeTaxe;
            this.totalWithTaxe = totalWithTaxe;
            this.status = status;
            this.customer = customer;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getType() {
            return type;
      }

      public void setType(String type) {
            this.type = type;
      }

      public String getLabel() {
            return label;
      }

      public void setLabel(String label) {
            this.label = label;
      }

      public String getNumberOfDays() {
            return numberOfDays;
      }

      public void setNumberOfDays(String numberOfDays) {
            this.numberOfDays = numberOfDays;
      }

      public Integer getUnitPrice() {
            return unitPrice;
      }

      public void setUnitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
      }

      public Float getTotalExcludeTaxe() {
            return totalExcludeTaxe;
      }

      public void setTotalExcludeTaxe(Float totalExcludeTaxe) {
            this.totalExcludeTaxe = totalExcludeTaxe;
      }

      public Float getTotalWithTaxe() {
            return totalWithTaxe;
      }

      public void setTotalWithTaxe(Float totalWithTaxe) {
            this.totalWithTaxe = totalWithTaxe;
      }

      public String getStatus() {
            return status;
      }

      public void setStatus(String status) {
            this.status = status;
      }

      public Customer getCustomer() {
            return customer;
      }

      public void setCustomer(Customer customer) {
            this.customer = customer;
      }
}