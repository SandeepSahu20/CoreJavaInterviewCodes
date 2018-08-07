/**
 * 
 */
package Java_interview_Questions;

/**
 * @author sandeep
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		 int num= 12345;
		 int rev =0;
		 
		 while(num !=0){
			 
			rev=rev*10+num%10; 
			 num=num/10;
			 
		 }
		 
		 System.out.println("Reverse Number is:"+rev);
		 int num1=123456;
		 StringBuffer sb=new StringBuffer(String.valueOf(num1));
		 sb.reverse();
		 System.out.println("StringBuffer Valure is "+sb);

	}

}
