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
        
        for(int counter = 1; counter <= 1; counter++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println();
            System.out.println("What is the course you are studying");
            String course_name = scanner.nextLine();
            Student student_info = new Student(name, course_name);
            student_info.display();
            String course_mark = scanner.nextLine();
            double final_mark = Double.parseDouble(course_mark);
            student_info.setMark(final_mark);
            System.out.println(student_info.getGrade());
            System.out.println(student_info.didPass());
            System.out.println(student_info.getName());
            System.out.println(student_info.getCourse_name());
        }
    }
}
