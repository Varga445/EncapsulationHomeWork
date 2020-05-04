package com.tomcatintelj;

public class StudentDataBase {
    private College college = new College();

    public void availableCourses() {
        System.out.println("Available Courses:");
        System.out.println(college.getCoursesAndPrice().keySet());
        System.out.println("Prices: ");
        System.out.println(college.getCoursesAndPrice().values());
        System.out.println("-----------------------------------");
    }


    public void sudentDate() {
        Student s1 = new Student("006723613", "james", 1994, 7);
        s1.enroll();
        s1.getBalance();
        s1.setCity("Boston");
        s1.setPhoneNumber("202-555-0145");
        System.out.println("City: " + s1.getCity());
        System.out.println("Phone Number: " + s1.getPhoneNumber());

    }
}
