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
public class TestEmployee {
    public static void main(String[] args) {
        
        Teacher  t1  = new Teacher();
        CollegeStudent cs = new CollegeStudent();
        t1.setnameOfPerson("Saikiran");
        t1.setDetails(10000, "Java");
        cs.setNameOfStudent("Jaddu");
        cs.setDetails(2, "CSE");
        t1.display();
        cs.display();
        
    }
    
}
class Person
{
    String nameOfPerson;
    void setnameOfPerson(String s)
    {
        nameOfPerson = s ;
    }
    
}

class Student extends Person
{
    String nameOfStudent;
    void setNameOfStudent(String s)
    {
        nameOfStudent = s;
    }
    
}
class Teacher extends Person
{
    int salary;
    String subject;
    void setDetails(int s , String sub)
    {
        salary = s ;
        subject = sub ;
    }
    void display()
    {
        System.out.println(nameOfPerson);
        System.out.println(salary);
        System.out.println(subject);
    }
    
}
class CollegeStudent extends Student
{
    int year;
    String major;
    void setDetails(int y , String m)
    {
        year = y ; 
        major = m ;
    }
    void display()
    {
        System.out.println(nameOfStudent);
        System.out.println(year);
        System.out.println(major);
    }
}