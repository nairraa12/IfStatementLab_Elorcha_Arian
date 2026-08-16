/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author user
 */
 import java.util.Scanner;

public class IfStatementLab {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);  
       
       //Problem 1
       System.out.println("Enter your age: ");
       int age = input.nextInt(); 
       if (age < 13) {
           System.out.println("You are a child.");
    } else if (age <= 19) {
           System.out.println("You are a teenager.");
    } else {
           System.out.println("You are an adult.");
    }
       
       //Problem 2
       System.out.println("Enter today's Temperature in Celsius: "); 
       double temperature = input.nextDouble(); 
       if (temperature < 0) {
           System.out.println("Freezing Point.");
    } else if (temperature <= 25) {
           System.out.println("Normal Weather.");
    } else {
           System.out.println("Hot Weather.");
    } 

       //Problem 3
       System.out.println("Enter your Test Score: ");
       int score = input.nextInt();
       if (score >= 90){
          System.out.println("Excellent");
    }  else if (score >=75) {
          System.out.println("Good");
    }  else {
          System.out.println("Needs Improvement");
    }
       
       //Problem 4
       System.out.println("Enter the radius of the circle: ");
       double radius = input.nextDouble();
       if (radius <=0){
          System.out.println("Invalid Radius");
       } else { 
           double area = Math.PI * radius * radius;
           double circumference = 2 * Math.PI * radius;
           
          System.out.println("Area: " + area);
          System.out.println("Circuference: " + circumference);  
       }
       
      
       //Problem 5
      System.out.println("Enter an Integer");
      int number = input.nextInt();
      if (number % 2 == 0){
          System.out.println("The number is even");
      } else {
          System.out.println("The number is odd");
      }
    }
}
