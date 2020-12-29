package hearth;

import java.util.Scanner;

public class negativereverseleetcode1 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		 int number = sc.nextInt();
		 long reversed = 0;
		if (number <0 ) {
			number = number *-1;
			while (number !=0) {
				int num = number%10;
				reversed = reversed*10+num;
				number = number/10;
			}
			System.out.println (-1*reversed);
		}else 
		{
			while (number !=0) {
				int num = number%10;
				reversed = reversed*10+num;
				number = number/10;
			}
			System.out.println (reversed);
		}
			
			
	}
}