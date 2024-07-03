/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.sql.SQLOutput;

/**
 *
 * @author MoaathAlrajab
 */
public class Senior extends Student {

	//constructor
	public Senior(String name, short age, int credits) {
		super(name, age, credits);
		if (credits < 85) {
			System.out.println(getName() + " is not a senior yet since they have less than 85 credits");
		}
	}



	//override the toString method
	@Override
	public String toString() {
		return "Seniors's name is " + getName() + ", age is " + getAge() + ", gpa is " + getGpa() + '.';
	}

}