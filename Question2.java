package javatask5;

import java.util.Scanner;

public class Question2 {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to reverse: ");
	        String input = sc.nextLine();
	        String reversed = "";
	        
	        // reverse via loop
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }
	        
	        System.out.println("Reversed string: " + reversed);
	        sc.close();
	    }
	}