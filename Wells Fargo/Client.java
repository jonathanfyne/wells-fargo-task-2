import javax.persistence.*;
package com.example.entities;

@Entity
public class Client {

    @Id
    private Integer clientId;

    @Column(name = "Name of the client") // Name of the client/company
    private String name;

    @Column(name = "Address") // Adress
    private String address;

    @Column(name = "Email") //Email of the company/clieny
    private String email;

    @Column(name = "phone Number")
    private Integer phoneNumber;

    public FinancialAdvisor(String name, String address, String email, Integer phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}