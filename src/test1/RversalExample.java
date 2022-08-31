package test1;

public class RversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Clean Delhi Green Delhi";
		String result = "";
		for (int index=str.length()-1 ; index>=0 ; index--) {
			char ch = str.charAt(index);
			result = result +ch;
			
		}
		System.out.println(result);
		
		int num= 567890;
		int res=0;
		while(num>0) {
			int rem = num%10;
			res = res*10 + rem;
			num = num/10;
		}
		System.out.println(res);
	}

}
