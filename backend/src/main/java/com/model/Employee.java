package com.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Digits(integer = 5, fraction = 0, message = "ID must be a 5-digit number")
    @Column
    private long employeeId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date dateofBirth;
    @Column
    private int lastDigit;
    @Column
    private String emailId;
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
   public int getLastDigit() {
        return lastDigit;
    }
    public void setLastDigit(int lastDigit) {
        this.lastDigit = lastDigit;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public Date getDateofBirth() {
        return dateofBirth;
    }
    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public Employee(long id,
            @NotNull @Digits(integer = 5, fraction = 0, message = "ID must be a 5-digit number") long employeeId,
            String firstName, String lastName, Date dateofBirth, int lastDigit, String emailId) {
        this.id = id;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofBirth = dateofBirth;
        this.lastDigit = lastDigit;
        this.emailId = emailId;
    }
  

    
}
