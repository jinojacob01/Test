package coreJava;

public class NestedLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=4;i++) {
			
			System.out.println("i before entering innner loop =" +i);
			
			
			for(int j=0;j<i;j++) {
				System.out.println("j AFTER entering innner loop =" +j);

				
			}

			
			System.out.println("i AFTER entering innner loop =" +i);
	}


	}


	}
