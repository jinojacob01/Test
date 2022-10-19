package coreJava;

import java.util.Iterator;

public class MultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0] = 5;
		a[0][1] = 4;
		a[0][2] = 3;
		a[1][0] = 9;
		a[1][1] = 8;
		a[1][2] = 7;
		System.out.println(a[0][2]);
		
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(b[1][1]);
		
		
		for(int row =0;row < 2;row++) {
			
			for(int column = 0; column < 3; column++) {
				System.out.print(a[row][column]);
			}
			System.out.println("");
		}
		
	}

}
