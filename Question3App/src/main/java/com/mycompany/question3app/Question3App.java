/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.question3app;

import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class Question3App {

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter your name: ");
       String name = scanner.nextLine();
       System.out.println("You entered: " + name);
       System.out.println();
       System.out.println("What is the course you are studying");
       String course_name = scanner.nextLine();
       System.out.println(name + " "+ course_name);
       System.out.println("Please enter your final mark");
       String course_mark_string = scanner.nextLine();
       double course_mark = Double.parseDouble(course_mark_string);
       System.out.println(name + course_name + course_mark);
       
       if (course_mark > 40) {
           System.out.println("You have passed onto the 2nd year of "+ course_name);
       }
       else{
           System.out.println("You have failed");
       }         
    }
}
