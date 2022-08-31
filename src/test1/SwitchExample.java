package test1;

public class SwitchExample {

	public static void main(String[] args) {
		
		String str ="My Name is Mohsin";
		int count=0;
		int x;
		for (x=0;x<str.length();x++) {
			char ch = str.charAt(x);
			
			switch(ch) {
			case 'a':
			case'e':
			case'i':
			case'o':
			case'u':
				count++;
	
				break;
			
			}
			
		}
		System.out.println("Vowel count is "+count);
	}
/*		String str = "Clean World Green World";
		int count =0;
		
		for(int index=0;index<str.length();index++) {
			
			char ch = str.charAt(index);
			
			switch(ch) {
			
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
						
			}
			
		}
		
		System.out.println("Total vowels are " + count);

	}*/

}


