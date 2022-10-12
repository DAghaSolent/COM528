/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.question8app;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Danny
 */
public class Question8App {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        for(int counter = 1; counter <= 1; counter++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println();
            System.out.println("What is the course you are studying");
            String course_name = scanner.nextLine();
            Student undergrad_info = new Undergraduate (name, course_name);
            undergrad_info.display();
            System.out.println("What was your final grade");
            String course_mark = scanner.nextLine();
            double final_mark = Double.parseDouble(course_mark);
            undergrad_info.setMark(final_mark);
            //System.out.println(undergrad_info.getGrade());
            //System.out.println(undergrad_info.didPass());
            //System.out.println(undergrad_info.getName());
            //System.out.println(undergrad_info.getCourse_name());
            //System.out.println(undergrad_info.getClass());
            students.add(undergrad_info);
        }
        
       
        for (int counter = 1; counter <= 2; counter ++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name =  scanner.nextLine();
            System.out.println();
            System.out.println("What is the course you are studying: ");
            String course_name = scanner.nextLine();
            Student masters_info = new Masters(name,course_name);
            masters_info.display();
            System.out.println("What was your final mark: ");
            String course_mark = scanner.nextLine();
            double final_mark =  Double.parseDouble(course_mark);
            masters_info.setMark(final_mark);
            //System.out.println(masters_info.getGrade());
            //System.out.println(masters_info.didPass());
            //System.out.println(masters_info.getName());
            //System.out.println(masters_info.getCourse_name());
            //System.out.println(masters_info.getClass());
            students.add(masters_info);
        }
        
        for(int count=0; count<students.size(); count++)
        {
            students.get(count).display();
        }
    }
    

}

