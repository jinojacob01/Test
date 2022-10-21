package coreJava;

public class Constructor {
	
	
	public Constructor() {
		System.out.println("Inside default constructor");
	}
	
	public Constructor(String str) {
		System.out.println(str);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor ob = new Constructor();
		Constructor ob1 = new Constructor("Hello");

	}

}
