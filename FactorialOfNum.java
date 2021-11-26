package Programs;
import java.util.Scanner;
public class FactorialOfNum {
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int i,fact=1;
		fact=factorial(n);
		System.out.println("Factorial of "+n+ " is :" + fact);
		
	}
}
