/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;
/**
 *
 * @author Danny
 */
public  abstract class Student {
    protected String name, course_name, studentid;
    protected double course_mark;
    
    public Student (String nameIn, String course_nameIn, String studentidIn )
    {
        this.name = nameIn;
        this.course_name =  course_nameIn;
        this.course_mark = 0;
        this.studentid = studentidIn;
    }
    
    public void display()
    {
        System.out.println("Name: "+ this.name);
        System.out.println("Course Name: "+ this.course_name);
        System.out.println();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getCourse_name()
    {
        return this.course_name;            
    }
    
    public double getCourse_mark()
    {
        return this.course_mark;
    }
    
    public String getStudent_ID()
    {
        return this.studentid;
    }
    
    
    
    public void setMark(double newMark)
    {
        if (newMark >= 0 && newMark <= 100)
        {
            this.course_mark = newMark;
            System.out.println("New course_mark has been updated to " + course_mark);
        }
        else
        {
            System.out.println("You have inputted an incorrect value");
        }
    }
    
    public abstract String getGrade();
    
    
    public boolean didPass()
    {
        //boolean twoIsGreaterThanThree = 2>3;
         //boolean twoIsGreaterThanOne = 2>1;
        
        // return this.course_mark >= 40 ? true:false;
        // This is a far effiecent way of stating a booleon
        if(this.course_mark >= 40)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
