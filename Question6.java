package javatask5;

import java.util.Scanner;

public class Question6 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Month (1–12): ");
	        int month = sc.nextInt();
	        System.out.print("Rent per day: ");
	        double rate = sc.nextDouble();
	        System.out.print("Days stayed: ");
	        int days = sc.nextInt();
	        sc.close();

	        // Determine if month is peak (20% extra) or not
	        double multiplier;
	        switch (month) {
	            case 4: case 5: case 6:      // April, May, June
	            case 11: case 12:            // November, December
	                multiplier = 1.2;        // 20% higher
	                break;
	            default:
	                multiplier = 1.0;        // normal rate
	        }

	        // Calculate total and print with 2 decimals
	        double total = rate * days * multiplier;
	        System.out.printf("%.2f%n", total);
	    }
	}