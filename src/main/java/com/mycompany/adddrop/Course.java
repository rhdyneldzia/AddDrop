/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.adddrop;

public class Course {
    String code;
    String name;
    String time;
    char group;
    int seats;
    int courseCredit;

    public Course(String code, String name, String time, char group, int seats, int courseCredit) {
        this.code = code;
        this.name = name;
        this.time = time;
        this.group = group;
        this.seats = seats;
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + time + " " + group + " " + seats + " " + courseCredit;
    }
}
