package test1;

public class VowelCheck {

	public static void main(String[] args) {
		String str ="Mohsin Khan";
		char[] array = {'a','e','i','o','u'};
	
		
		int count =0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			char ch1 = array[index];
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			
		}
System.out.println("Vowel count is "+count);
}

}
