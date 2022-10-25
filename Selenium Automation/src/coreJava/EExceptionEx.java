package coreJava;

public class EExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =7;
		int b = 0;
		try {
//			int c = a/b;
//			System.out.println(c);
			
			int arr[] = new int[3];
			System.out.println(arr[5]);
		}
		catch (ArithmeticException e) {
			System.out.println("I got an ArithmeticException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I got an ArrayIndexOutOfBoundsException");
		}
		
		catch (Exception e) {
			System.out.println("I got an exception");
		}



	}

}
