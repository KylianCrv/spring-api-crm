package fr.m2i.apicrm.dto;

public class CustomerDTO {

      private Long id;

      private String lastname;

      private String firstname;

      private String company;

      private String email;

      private String phone;

      private String adress;

      private String zipCode;

      private String city;

      private String country;

      private String state;

      public CustomerDTO() {

      }

      public CustomerDTO(Long id, String lastname, String firstname, String company, String email, String phone, String adress, String zipCode, String city, String country, String state) {
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

      public String getState() {
            return state;
      }

      public void setState(String state) {
            this.state = state;
      }

}
