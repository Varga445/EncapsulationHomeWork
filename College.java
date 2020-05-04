package com.tomcatintelj;

import java.util.HashMap;

public class College {

 private HashMap<String, Integer> coursesAndPrice = new HashMap<String, Integer>();


    public College() {
        addCoursesAndPrice();
    }

    private void addCoursesAndPrice(){
        coursesAndPrice.put("MATH",1000);
        coursesAndPrice.put("ENGLISH",2000);
        coursesAndPrice.put("MUSIC",1000);
    }

    public HashMap<String, Integer> getCoursesAndPrice() {
        return coursesAndPrice;
    }


}
