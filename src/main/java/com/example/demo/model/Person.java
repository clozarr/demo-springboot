package com.example.demo.model;


import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idperson")
    private Long idPerson;
    @Column(name="firstname", nullable = false, length=70)
    private String firstName;
    @Column(name="lastname", nullable = false, length=70)
    private String lastName;

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
