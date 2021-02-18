package hearth;

import java.util.ArrayList;
import java.util.Scanner;

public class sumRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {-2, 0, 3, -5, 2, -1};
		int n = sc.nextInt();
		for(int loop=0;loop<n;loop++) {
		ArrayList<Integer> al = new ArrayList<Integer>();
			int i= sc.nextInt();
			int j = sc.nextInt();
		if(i>arr.length || j>arr.length) {
			System.out.println("invalid");
		}else {
			for(int k=i;k<=j;k++) {
				al.add(arr[k]);
			}
			int sum =0;
			for(int z=0;z<al.size();z++) {
				sum = sum+al.get(z);
			}
			System.out.println(sum);
			System.out.println(al);
		}
	  }
	}

}
