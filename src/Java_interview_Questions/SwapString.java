package Java_interview_Questions;

public class SwapString {
	
	public static void main(String args[]){
		
		String a="Hello";
		String b="World";
		
		 a=a+b;
		System.out.println(a);
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}

}
