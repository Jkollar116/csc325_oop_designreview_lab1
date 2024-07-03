/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Freshman extends Student{
	//constructor
	public Freshman(String name, short age, int credits) {
		super(name, age, credits);
	}
	//override the toString method
	@Override
	public String toString() {
		return "Freshman's name is " + getName() + ", age is " + getAge() + ", gpa is " + getGpa() + '.';
	}
}