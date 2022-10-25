package coreJava;

public class childDemo extends parentDemo{
	
	int a = 5;
	String text = "outside";
	
	public void thisEx() {
		String text = "Inside";
		System.out.println(text);
		System.out.println(this.text);
	}
	
	public childDemo() {
		
		System.out.println("Child constructor");

	}
	
	public void getData() {

//		System.out.println(super.a);
		System.out.println("getData " +a);
//		super.getData();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo ob = new childDemo();
		ob.getData();
		ob.thisEx();
	

	}

}
