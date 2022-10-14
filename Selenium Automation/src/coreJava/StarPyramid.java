package coreJava;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1");
		System.out.println("// L pyramid");
		System.out.println("");
		for (int i = 1; i <= 4; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}

			System.out.println("");
		}

		
		System.out.println("");
		System.out.println("2");
		System.out.println("// F pyramid");
		System.out.println("");
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}

			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("3");
		System.out.println("// _| pyramid");
		System.out.println("");

		int i, j;
		int n = 5;
		for (i = 0; i < n; i++) {
			for (j = 2 * (n - i); j > 2; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("");
		System.out.println("4");
		System.out.println("// /\\ pyramid");
		System.out.println("");

		int k, l;
		int m = 6;
		for (k = 1; k <= m; k++) {

//			for (l = m - k; l > 0; l--) {
			for (l = 0; l < (m - k); l++) {
				System.out.print(" ");
			}

			for (l = 0; l < k; l++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
		
		
		System.out.println("");
		System.out.println("5");
		System.out.println("// 7 pyramid");
		System.out.println("");

		int p, q;
		int row = 5;
		for (p = 0; p < row; p++) {

			// spaces
			for (q = 0; q < (p * 2); q++) {
				System.out.print(" ");

			}
			for (q = 0; q <= row - p; q++) {
				System.out.print("* ");
			}

			System.out.println("");
		}

	}

}
