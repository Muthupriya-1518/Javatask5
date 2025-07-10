package javatask5;

public class Question1 {

	public static void main(String[] args) {
		
		String original = "level";
		String reversed = "";

		// build reversed string
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed += original.charAt(i);
		}

		// check palindrome
		if (original.equals(reversed)) {
			System.out.println("'" + original + "' is a palindrome.");
		} else {
			System.out.println("'" + original + "' is NOT a palindrome.");
		}
	}
}