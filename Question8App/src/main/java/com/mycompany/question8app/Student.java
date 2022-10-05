/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question8app;

/**
 *
 * @author Danny
 */
public class Student {
    private String name, course_name;
    private double course_mark;
    
    public Student (String nameIn, String course_nameIn, double course_markIn)
    {
        this.name = nameIn;
        this.course_name =  course_nameIn;
        this.course_mark = course_markIn;
    }
    
    public void display()
    {
        System.out.println("Name: "+ this.name);
        System.out.println("Course Name: "+ this.course_name);
        System.out.println("Course Mark: "+ this.course_mark);
        System.out.println();
    }
}
