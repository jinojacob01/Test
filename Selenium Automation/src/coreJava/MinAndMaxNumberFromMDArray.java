package coreJava;

public class MinAndMaxNumberFromMDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[][] = { { 2, 4, 8 }, { 5, 12, 6 }, { 1, 7, 0 } };
		int min = b[0][0];
		int max = b[0][0];
		int mincolumn = 0;
		int max1 = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (min > b[i][j]) { // min
					min = b[i][j];
					mincolumn = j;
				}

				if (b[i][j] > max) { // max
					max = b[i][j];
				}

			}

		}

		System.out.println("Minimum Value = " + min);
		System.out.println("Maximum Value = " + max);

		for (int k = 0; k < 3; k++) { // max from the min column

			if (max1 < b[k][mincolumn]) {
				max1 = b[k][mincolumn];
			}
		}

		System.out.println("Maximum Value 1 = " + max1);

	}
}