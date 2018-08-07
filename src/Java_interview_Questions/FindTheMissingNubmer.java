package Java_interview_Questions;

public class FindTheMissingNubmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,5};
		//Sum= 1+2+3+4+5=15
		//Sum1= 1+2+3+5=11
		//Missing =Sum1-Sum=4
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			
	}
		System.out.println("Sum is :"+sum);
		
		int sum1=0;
		for(int j=0;j<=5;j++){
			
			sum1=sum1+j;
			
			
		}
		System.out.println("Sum1 is : "+sum1);
		
		
		int missing =sum1-sum;
        System.out.println("Missing Number is : "+missing);
	}

}
