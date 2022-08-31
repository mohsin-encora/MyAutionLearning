package test1;

public class ArrayExample {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 ,60};
		
		//Find length of array
		System.out.println("Length of array " + array1.length);
		
		//Find any element from position from the array
		System.out.println(array1[1]);
		
		//Find the last number from array 
		System.out.println(array1[array1.length-1]);
		
		//Create a string array
		String[] stringarray = {"abc","def","ghi"};
		
		//Convert string to array
		String str1 = "test this statement";
		String[] array11 = str1.split(" ");
		System.out.println(array11[0]);
	}

}

