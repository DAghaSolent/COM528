/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;

/**
 *
 * @author Danny
 */
public class Undergraduate extends Student {
    public Undergraduate(String nameIn, String course_nameIn, String studentidIn)
    {
        super(nameIn, course_nameIn, studentidIn);
    }
    
    public String getGrade()
    {
        if (this.course_mark >= 70)
        {
            return "First";
        }
        else if (this.course_mark >= 60)
        {
            return "2:1";
        }
        else if (this.course_mark >= 50)
        {
            return "2:2";
        }
        else if (this.course_mark >= 40)
        {
            return "Third";
        }
        else if (this.course_mark >= 0 && this.course_mark < 40)
        {
            return "Fail";
        }
        else
        {
            return "Error!";
        }
    }
}