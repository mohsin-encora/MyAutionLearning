package test1;

import java.util.Scanner;

public class TestevenNumber {

	public static void main(String[] args) {
		//int num= 31;
		// Scanner is the class used to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scanner.nextInt();
		//System.out.println(num%2);
		if(num%2==0) {
			System.out.println("Its a even number");
		}else {
			System.out.println("Its an odd number");
		}

	}

}
