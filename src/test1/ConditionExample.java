package test1;

public class ConditionExample {

	public static void main(String[] args) {
		// if my age is greater than 18 or less than 18
		int age = 17;
		if (age >= 18) {
			System.out.println("I am eligible for voting");

		} else if(age==17) {
			System.out.println("Sorry try again next year");
		}
		else {
			System.out.println("I am not eligible for voting");
		}

	}

}
