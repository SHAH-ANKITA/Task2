package Programs;
import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		int a,b,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Number :");
		a=sc.nextInt();
		System.out.println("Enter The Second Number :");
		b=sc.nextInt();
		System.out.println("Enter Your choice 1->Addition , 2->Substraction ,3->multiplication ,4->Division ,5->Modulus \n Enter your Choice :");
        ch=sc.nextInt();
        if(ch==1)
        	System.out.println("addition="+(a+b));
        else if(ch==2)
        	System.out.println("Substraction="+(a-b));
        else if(ch==3)
        	System.out.println("Multilication="+(a*b)); 
        else if(ch==4)
        	System.out.println("Divide="+(a/b));
        else if(ch==5)
        	System.out.println("Modulus="+(a%b));
        else
        	System.out.println("Invalid Input");
	
}

}
