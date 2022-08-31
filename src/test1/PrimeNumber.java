package test1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			int remainder = num % index;
			if (remainder == 0) {
				System.out.println("Number is not prime number");
				flag = false;
				break;
			}

		}
		if (flag) {
System.out.println("Its a prime number");
		}
	}

}
