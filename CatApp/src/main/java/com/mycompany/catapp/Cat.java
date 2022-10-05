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
        if(this.weight <= 5)
        {
            System.out.println("Can't Walk any further.. the poor cat will be starved ");
        }
        else
        {
            this.weight--;
        }
    }
    
    public void eat(int amount)
    {
        if(this.weight >= 20)
        {
            System.out.println("Cat treadmill time for" + this.name);
        }
        else
        {
            this.weight+= amount;
        }
    }

    public void display()
    {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Weight: " + this.weight);
    }
}
