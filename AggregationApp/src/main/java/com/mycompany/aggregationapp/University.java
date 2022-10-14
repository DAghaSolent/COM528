/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Danny
 */
public class University {
    private String name;
    private ArrayList<Student> students;
    
    public University(String nameIn)
    {
        name = nameIn;
        students = new ArrayList<Student>();
    }
    
    public void enrolStudent(Student s)
    {
        students.add(s);
    }
    
    public Student findStudentById(String student_id)
    {
        for(int count=0; count < students.size(); count++)
        {
            Student currentStudent = students.get(count);
            if(currentStudent.getStudent_ID().equals(student_id))
            {
                return currentStudent;
            }
        }
        return null;
    }
    public Student findStudentsByName(String name)
    {
        for(int count=0; count < students.size(); count++)
        {
            Student currentStudent =  students.get(count);
            if (currentStudent.getName().equals(count))
            {
                return currentStudent;
            }
        }
        return null;
    }
    
    public void displayMenu()
    {
        System.out.println("Select an option");
        System.out.println("1. Add a student");
        System.out.println("2. Search for student by ID");
        System.out.println("3. Search for students by name");
        System.out.println("4. Quit");
    }
}
