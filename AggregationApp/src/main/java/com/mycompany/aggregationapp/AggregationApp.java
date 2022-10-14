/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aggregationapp;
import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class AggregationApp {
    public static void main(String[] args) {
        University solent_university = new University("Solent University");
        String option = " ";
        
        while(!option.equals("4"))
        {
            Scanner scanner = new Scanner(System.in);
            solent_university.displayMenu();
            option = scanner.nextLine();
            
            if(option.equals("1"))
            {
                System.out.println("Please input the student's ID: ");
                String student_id = scanner.nextLine();
                System.out.println("Please enter the student's name: ");
                String student_name = scanner.nextLine();
                System.out.println("Please enter the course the student is attending: ");
                String course_name =  scanner.nextLine();
                Student student = new Undergraduate(student_id, student_name, course_name);
                solent_university.enrolStudent(student);
                System.out.println(student_name + " has been sucessfully enrolled into the system");
                break;
            }
            else if(option.equals("2"))       
            {
                System.out.println("Please input the id of the student you want to search for: ");
                String search_id = scanner.nextLine();
                System.out.println(solent_university.findStudentById(search_id));
                //Student search_student = solent_university.findStudentById(search_id);
                //System.out.println(search_student);
                break;
            }
            else if(option.equals("3"))
            {
                System.out.println("Search by student name");
                break;
            }
           
            
        }
    }
}
