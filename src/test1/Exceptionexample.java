package test1;

public class Exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {'3','4','5'};
		int num =10;
		try {
			//int res=num/0;
			System.out.println(array[2]);	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch the exception");
		}catch(ArithmeticException e) {
			System.out.println("catch the arithamatic exception");
		}finally {
	System.out.println("Inside Finally");	

	}

		System.out.println("After exception code");
		
	}
}
