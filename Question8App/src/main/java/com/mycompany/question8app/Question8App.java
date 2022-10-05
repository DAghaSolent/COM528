/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.question8app;
import java.util.Scanner;
/**
 *
 * @author Danny
 */
public class Question8App {

    public static void main(String[] args) {
        
        for(int counter = 1; counter <= 5; counter++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println();
            System.out.println("What is the course you are studying");
            String course_name = scanner.nextLine();
            System.out.println("Please enter your final mark");
            String course_mark_string = scanner.nextLine();
            double course_mark = Double.parseDouble(course_mark_string);
            Student student_info = new Student(name, course_name,course_mark);
            student_info.display();
        }
    }
}
