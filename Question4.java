package javatask5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		sc.close();

		// Loop over each row i
		for (int i = 1; i <= n; i++) {
			// Loop over each column j
			for (int j = 1; j <= n; j++) {
				// Print a star when j == i (left arm)
				// or j == (n - i + 1) (right arm), else space
				if (j == i || j == (n - i + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Move to next line
			System.out.println();
		}
	}
}