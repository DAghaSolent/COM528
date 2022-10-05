/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catapp;

/**
 *
 * @author Danny
 */
public class Cat {
    private String name;
    private int age, weight;
    
    public Cat (String nameIn, int ageIn, int weightIn)
    {
        this.name = nameIn;
        this.age = ageIn;
        this.weight = weightIn;
    }
    
    public void walk()
    {
        this.weight--;
    }
    
    public void eat()
    {
        this.weight++;
    }

    public void display()
    {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Weight: " + this.weight);
    }
}
