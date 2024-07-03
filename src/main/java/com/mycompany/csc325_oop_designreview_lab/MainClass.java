/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;


/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {



		//Create an object of the student class and set the name, age, and credits of the student.
		Student std1= new Student("James", (short) 20, 30);
		Freshman std2=  new Freshman("James", (short)20, 12); // name, age, credits
	    Senior std3 =  new Senior("John", (short)30, 10);

		//Set the gpa of the student using the scanner and user input and then print the output.
	 	Scanner input = new Scanner(System.in);
		System.out.println("Enter the GPA of James");
		double gpa = input.nextDouble();
		std1.setGpa(gpa);
	 	System.out.println("Enter the GPA of Jack");
		double gpa2 = input.nextDouble();
		std2.setGpa(gpa2);
		System.out.println("Enter the GPA of John");
		double gpa3 = input.nextDouble();
		std3.setGpa(gpa3);


		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());

	}

}

