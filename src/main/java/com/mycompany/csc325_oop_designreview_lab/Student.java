/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    public Student(String name, short age, int credits) {
        super(name, age);
        this.gpa = gpa;

    }
    //get method for address
    @Override
    public String getAddress() {
        return null;
    }
    //set method for address
    @Override
    public void setAddress(String address) {

    }

    private double gpa;
    //get method for gpa
    public double getGpa() {
        return gpa;
    }
    //set method for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }




    //toString method
    @Override
    public String toString() {
        return "Students name is " + getName() + ", age is " + getAge() + ", gpa is " + gpa + '.';
    }
	

}
