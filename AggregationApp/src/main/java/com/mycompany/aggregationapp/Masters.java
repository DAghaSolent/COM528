/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;

/**
 *
 * @author Danny
 */
public class Masters extends Student {
    public Masters(String nameIn, String course_nameIn)
    {
        super (nameIn, course_nameIn);
    }
    
    public String getGrade()
    {
        if (this.course_mark >= 70)
        {
            return "Distinction";
        }
        else if (this.course_mark >= 60)
        {
            return "Merit";
        }
        else if (this.course_mark >= 40)
        {
            return "Pass";
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
