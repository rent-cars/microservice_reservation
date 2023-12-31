package com.rentcars.reservations.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;


public class Clients {

    private int id;

    private int hello;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String licenseNumber;
    private Date dateObtention;

    public Clients(){}

    public Clients(int id, String firstName, String lastName, Date birthDate, String licenseNumber, Date dateObtention) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.licenseNumber = licenseNumber;
        this.dateObtention = dateObtention;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(Date dateObtention) {
        this.dateObtention = dateObtention;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", dateObtention=" + dateObtention +
                '}';
    }

}
