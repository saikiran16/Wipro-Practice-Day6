/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supra.Day6;

/**
 *
 * @author Saikiran
 */
public class Program1 {
    
    public static void main(String[] args) {
        
        // Creating INstance for Animal class
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        
        
        //Creating INstance for Bird class
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
    }
    
    
}
class Animal
{
    void eat()
    {
        System.out.println("This is Eat Method in Animal Class");
    }
    void sleep()
    {
        System.out.println("This is Sleep Method in Animal Class");
    }
}
class Bird
{
    void eat()
    {
        System.out.println("This is Eat Method in Bird Class");
    }
    void sleep()
    {
        System.out.println("This si Sleep Method in Bird Class");
    }
}
    
