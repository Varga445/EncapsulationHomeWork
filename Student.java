package com.tomcatintelj;

import java.util.Random;

public class Student {
    private College college = new College();
    private double funds = 10000;
    private double balance;
    private String lastName;
    private int yearOfBirth;
    private int dayOFBirth;
    private String SSN;
    private String phoneNumber;
    private String city;
    private static final String email = "@edu.com";


    public Student(String SSN, String lastName, int yearOfBirth, int dayOFBirth) {
        this.yearOfBirth = yearOfBirth;
        this.dayOFBirth = dayOFBirth;
        this.SSN = SSN;
        this.lastName = lastName;
        System.out.println("Student Email: " + emailCreator());
        System.out.println("Student ID: " + IDcalculator());
        System.out.println("UserID form = (yearOfBirth + dayOFBirth) + a combination of random 4-digit number between 1000\n" +
                "and 9000, and last 4 of SSN ");
        System.out.println("UserId: " + UserIDform());


    }


    private int IDcalculator() {
        return yearOfBirth + dayOFBirth;

    }

    private String emailCreator() {
        return lastName + email;
    }


    private String SSNform() {
        return SSN.substring(5, 9);
    }

    private int randomNum() {
        int upperbound = 9000;
        int lowerbound = 1000;
        Random random = new Random();
        return random.nextInt(upperbound - lowerbound) + lowerbound;

    }

    private String UserIDform() {
        return IDcalculator() + "" + randomNum() + "" + SSNform();
    }

    private double pay() {
        return funds - college.getCoursesAndPrice().get("ENGLISH");
    }

    public void enroll() {
        if (college.getCoursesAndPrice().containsKey("ENGLISH")) {
            String english = "English";
            System.out.println("Enrolled: " + english);
        }
        // metode care nu vreau sa apartina clasei public
    }


    public double getBalance() {

        balance = pay();
        System.out.println("The cost of the course is " + college.getCoursesAndPrice().get("ENGLISH"));
        System.out.println("The Balance is " + balance);
        return balance;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }
}
