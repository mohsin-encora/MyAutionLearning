package test1;

public class Datatype {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		int sum = num1 + num2;
		int mul = num1 * num2;
		double div = (double) num1 / num2;
		System.out.println("Sum of two number is: " + sum + " Multiplication of these is : " + mul);
		System.out.println("Multiplication is " + mul);
		System.out.println(div);
		String str1 = "test this statement";
		System.out.println(str1);
		System.out.println("length of string is " + str1.length());
		char ch1 = str1.charAt(0);
		System.out.println(ch1);
		char chn = str1.charAt(str1.length() - 1);
		System.out.println(chn);

//Uppercase and lower case 
System.out.println(str1.toUpperCase());
System.out.println(str1.toLowerCase());



	}

}
