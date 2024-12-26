/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.adddrop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

    

public class AddDropCourses {

    /**
     * System Default Properties
     */
    private static ArrayList<Course> COURSE_LIST = new ArrayList<Course>();
    static Course c1 = new Course("CSE110", "Fundamentals of Programming", "8:00-9:30", 'A', 30, 2);
    static Course c2 = new Course("CSE111", "Fundamentals of Programming Lab", "9:40-11:10", 'A', 45, 4);
    static Course c3 = new Course("CSE220", "Data Structures", "11:20-12:50", 'A', 25, 4);
    static Course c4 = new Course("CSE221", "Data Structures Lab", "2:00-3:30", 'A', 55, 3);
    static Course c5 = new Course("CSE230", "Discrete Mathematics", "3:40-5:10", 'A', 45, 3);
    static Course c6 = new Course("CSE231", "Discrete Mathematics Lab", "5:20-6:50", 'A', 24, 4);
    static Course c7 = new Course("CSE310", "Object Oriented Programming", "8:00-9:30", 'A', 35, 3);
    static Course c8 = new Course("CSE311", "Object Oriented Programming Lab", "9:40-11:10", 'A', 20, 4);
    static Course c9 = new Course("CSE320", "Algorithms", "11:20-12:50", 'A', 40, 4);
    static Course c10 = new Course("CSE321", "Algorithms Lab", "2:00-3:30", 'A', 30, 3);
    static Course c11 = new Course("CSE340", "Operating Systems", "3:40-5:10", 'A', 45, 3);
    private static final int MAX_CL = 6;
    private static final int MAX_CC = 23;
    
    /**
     * User default properties
     */
    private static LinkedList<Course> userSelectedCourses = new LinkedList<Course>();
    private static int userCreditCount = 0;
    private static int userCourseCount = 0;
    

    public static void main(String[] args) {

        initializeCourses();
        System.out.println("********************************");
        System.out.println("Welcome to the Add/Drop System");
        System.out.println("********************************");
        System.out.println("\n");

        System.out.println("Registered Courses: ");
        System.out.println("-------------------");
        System.out.println("Course Code Course Name Time Group Seats Credit");
        displayUserCourses();
        System.out.println("-------------------");

        System.out.println("1. Register for a course\n2. Drop a course\n4. Exit");
        Scanner input = new Scanner(System.in);
        
        // Buat input disini
    }

    /**
     * Register course Method
     */
    public static String registerCourse(Course course) {
        if(userCourseCount >= MAX_CL) {
            return "You have already registered for the maximum number of courses";
        }
        if(userCreditCount >= MAX_CC) {
            return "You have already registered for the maximum number of credits";
        }
        if(userSelectedCourses.contains(course)) {
            return "You have already registered for this course";
        }
        if(course.seats == 0) {
            return "This course is full";
        }
        userSelectedCourses.add(course);
        userCourseCount++;
        userCreditCount += course.courseCredit;
        course.seats--;
        return "Course registered successfully";
    }

    /**
     * Drop course Method
     */
    public static String dropCourse(String courseCode) {
        for(Course course : userSelectedCourses) {
            if(course.code.equals(courseCode)) {
                userSelectedCourses.remove(course);
                userCourseCount--;
                userCreditCount -= course.courseCredit;
                course.seats++;
                return "Course dropped successfully";
            }
        }
        return "You are not registered for this course";
    }

    /**
     * Display user Courses
     */
    public static String displayUserCourses() {
        if(userSelectedCourses.isEmpty()) {
            return "Courses have not been registered yet";
        }
        StringBuilder sb = new StringBuilder();
        for(Course course : userSelectedCourses) {
            sb.append(course.toString()).append("\n");
        }
        return sb.toString();
    }
    

    /**
     * Method ini untuk menambahkan course
     * ke dalam arrayList untuk pertama kali
     */
    public static void initializeCourses() {
        COURSE_LIST.add(c1);
        COURSE_LIST.add(c2);
        COURSE_LIST.add(c3);
        COURSE_LIST.add(c4);
        COURSE_LIST.add(c5);
        COURSE_LIST.add(c6);
        COURSE_LIST.add(c7);
        COURSE_LIST.add(c8);
        COURSE_LIST.add(c9);
        COURSE_LIST.add(c10);
        COURSE_LIST.add(c11);
    }
}
