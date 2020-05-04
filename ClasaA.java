package com.tomcatintelj;

public class ClasaA {

    private String firstName;
    private String lastName;

    public ClasaA(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ClasaA{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
