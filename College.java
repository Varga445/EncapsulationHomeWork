package com.tomcatintelj;

import java.util.HashMap;

public class College {

 private HashMap<String, Integer> coursesAndPrice = new HashMap<String, Integer>();


    public College() {
        addCoursesAndPrice();
    }

    private void addCoursesAndPrice(){
        coursesAndPrice.put("Math",1000);
        coursesAndPrice.put("ENGLISH",2000);
        coursesAndPrice.put("Music",1000);
    }

    public HashMap<String, Integer> getCoursesAndPrice() {
        return coursesAndPrice;
    }

//    public void setCoursesAndPrice(HashMap<String, Integer> coursesAndPrice) {
//        this.coursesAndPrice = coursesAndPrice;
//    }
}
