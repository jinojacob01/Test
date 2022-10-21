package coreJava;

public class childDemo extends parentDemo{
	
	int a = 5;
	
	public childDemo() {
		
		System.out.println("Child constructor");

	}
	
	public void getData() {

//		System.out.println(super.a);
		System.out.println(a);
//		super.getData();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo ob = new childDemo();
		ob.getData();
	

	}

}
