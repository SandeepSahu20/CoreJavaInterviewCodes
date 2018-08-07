package Java_interview_Questions;

import java.util.Arrays;

public class CompareLargestSmalestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]={22,-10,-20,-100,40,444,-100,543,44};
		
		int largest=number[0];
		int smalest=number[0];
		
		for(int i=1;i<number.length;i++){
			if(number[i]>largest){
				largest =number[i];
				
			}
			
			else if (number[i]<smalest){
				smalest =number[i];
				
			}
			
			
		}
		
		System.out.println("All arrey is ::" +Arrays.toString(number));
		System.out.println("Largest Number is ::" +largest);
		System.out.println("Smalest Number is ::" +smalest);

	}

}
