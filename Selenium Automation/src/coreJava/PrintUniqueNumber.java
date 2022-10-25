package coreJava;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 5, 5, 5, 6, 4, 9, 6, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;

			if (!al.contains(arr[i])) {
				al.add(arr[i]);
				k++;

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						k++;
					}

				}
				System.out.println("Value = " + arr[i]);
				System.out.println("Count = " + k);

				if (k == 1) {
					System.out.println("Unique Number = " + arr[i]);
				}
			}

		}

	}

}
