package Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	int num1=0,num2=1,sum=0;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number :");
	int n=sc.nextInt();
	while(sum<n)
	{
		System.out.println(sum);
      num1=num2;
      num2=sum;
      sum=num1+num2;
	}
  }
}
