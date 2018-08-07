package Java_interview_Questions;

import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sandeep Sahu";
		
		//Using String Buffer
		/*StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		System.out.println("Reverse is  : " +str1);*/
		
		//Using String
		
		int lenth=str.length();
		String reverse ="";
		
		System.out.println("Lenth is  "  +lenth);
		
		for( int i=lenth-1;i>=0;i--){
			
			reverse = reverse + str.charAt(i);
			}
		
		System.out.println("Reverse is  "+reverse);

}

}
