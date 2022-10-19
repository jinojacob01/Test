package coreJava;

public class FunctionOverloading {
	
	
	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(int a,int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading obj = new FunctionOverloading();
		obj.getData(10);
		obj.getData("Hello");
		obj.getData(11,22);

	}

}
