package javatask5;

public class Question7 {

	public static void main(String[] args) {
        
        double a = 12.5;
        double b = 7.8;
        double c = 19.3;

        // 2. Find max
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        // 3. Print
        System.out.println("Largest is: " + max);
    }
}