package Java_interview_Questions;

public class RemovejunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="$#%$ Sandeep 3233 #$";
		
		String str1= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Replace Value is "+str1);

	}

}
