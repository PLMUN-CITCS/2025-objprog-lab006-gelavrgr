// File Naming Convention: CircleCalculator.java

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt for Radius
        System.out.print("Enter the radius of the circle: ");
        
        // Read Radius Input
        double radius = input.nextDouble();
        
        // Calculate Area
        double area = Math.PI * Math.pow(radius, 2);
        
        // Calculate Circumference
        double circumference = 2 * Math.PI * radius;
        
        // Output Results (Formatted)
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
        
        // Close the Scanner object
        input.close();
    }
}

