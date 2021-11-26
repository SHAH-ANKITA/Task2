package Programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CalculatePermutationOfNo {
	static int fact(int number)
	{
		int f=1;
		int j=1;
		while(j<=number)
		{
			f=f*j;
			j++;
			
		}
		return f;
		
	}

	public static void main(String[] args) {
 List<Integer>number =new ArrayList<Integer>();
 number.add(12);
 number.add(13);
 number.add(1);
 number.add(6);
 number.add(9);
 int n=number.size();
 int r=3;
 int result;
 result=fact(n)/fact(n-r);
 System.out.println("The permutation of value for the number list is:" +result );
    	}

}
