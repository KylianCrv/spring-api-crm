package fr.m2i.apicrm.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String lastname;

      private String firstname;

      private String company;

      private String email;

      private String phone;

      private String adress;

      @Column(name = "zip_code")
      private String zipCode;

      private String city;

      private String country;

      @Column(columnDefinition = "TINYINT (1) DEFAULT 1")
      private Boolean state;

//      @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//      private List<Order> orders;
      public Customer() {
      }

      public Customer(Long id, String lastname, String firstname, String company, String email, String phone, String adress, String zipCode, String city, String country, Boolean state) {
            this.id = id;
            this.lastname = lastname;
            this.firstname = firstname;
            this.company = company;
            this.email = email;
            this.phone = phone;
            this.adress = adress;
            this.zipCode = zipCode;
            this.city = city;
            this.country = country;
            this.state = state;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getLastname() {
            return lastname;
      }

      public void setLastname(String lastname) {
            this.lastname = lastname;
      }

      public String getFirstname() {
            return firstname;
      }

      public void setFirstname(String firstname) {
            this.firstname = firstname;
      }

      public String getCompany() {
            return company;
      }

      public void setCompany(String company) {
            this.company = company;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getPhone() {
            return phone;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }

      public String getAdress() {
            return adress;
      }

      public void setAdress(String adress) {
            this.adress = adress;
      }

      public String getZipCode() {
            return zipCode;
      }

      public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
      }

      public String getCity() {
            return city;
      }

      public void setCity(String city) {
            this.city = city;
      }

      public String getCountry() {
            return country;
      }

      public void setCountry(String country) {
            this.country = country;
      }

      public Boolean getState() {
            return state;
      }

      public void setState(Boolean state) {
            this.state = state;
      }
//
//      public List<Order> getOrders() {
//            return orders;
//      }
//
//      public void setOrders(List<Order> orders) {
//            this.orders = orders;
//      }

      @Override
      public String toString() {
            return "Customer{" + "id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", company=" + company + ", email=" + email + ", phone=" + phone + ", adress=" + adress + ", zipCode=" + zipCode + ", city=" + city + ", country=" + country + ", state=" + state + '}';
      }

}
