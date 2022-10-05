/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.userinputapp;

import java.util.Scanner;
/**
 *
 * @author Danny
 */
public class UserInputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);
        System.out.println("What is your course name");
        String course_name = scanner.nextLine();
        System.out.println(name + " " + course_name);
        System.out.println("Please enter your mark");
        String str = scanner.nextLine();
        double course_mark = Double.parseDouble(str);
        System.out.println(name +" "+ course_name +" "+ course_mark);
    }
}
