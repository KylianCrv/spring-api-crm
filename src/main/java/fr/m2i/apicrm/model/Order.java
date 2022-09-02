package fr.m2i.apicrm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String type;

      private String label;

      @Column(name = "number_of_days")
      private String numberOfDays;

      @Column(name = "unit_price")
      private Integer unitPrice;

      @Column(name = "total_exclude_taxe")
      private Float totalExcludeTaxe;

      @Column(name = "total_with_taxe")
      private Float totalWithTaxe;

      @Enumerated(EnumType.STRING)
      @Column(name = "status", columnDefinition = "ENUM('CANCELED','OPTION','CONFIRMED') NOT NULL")
      private Status status;

      @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "customer_id", nullable = false)
      private Customer customer;

      public Order() {
      }

      public Order(Long id, String type, String label, String numberOfDays, Integer unitPrice, Float totalExcludeTaxe, Float totalWithTaxe, Status status, Customer customer) {
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

      public Status getStatus() {
            return status;
      }

      public void setStatus(Status status) {
            this.status = status;
      }

      public Customer getCustomer() {
            return customer;
      }

      public void setCustomer(Customer customer) {
            this.customer = customer;
      }
}
