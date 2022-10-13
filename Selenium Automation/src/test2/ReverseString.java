package test2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String input = sc.next();
		String reversedString = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversedString = reversedString + input.charAt(i);

		}
		System.out.println("Reversed String: " + reversedString);
		sc.close();
	}

}
