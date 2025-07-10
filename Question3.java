package javatask5;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        int counter = 1;          // this will go 1, 2, 3, … sequentially

        // for each row i from 1 to n
        for (int i = 1; i <= n; i++) {
            // print i numbers in this row
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println(); // move to next line
        }
    }
}