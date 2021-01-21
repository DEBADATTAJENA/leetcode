package hearth;

import java.util.ArrayList;


public class squareAndSortedArray {

	public static void main(String[] args) {
		
	      int [] arr = {-3,0,4,-1,2};
	      int square = 0;
	      int temp = 0;
	      ArrayList<Integer> al = new ArrayList<>(arr.length);
	      
	     for (int i = 0 ; i <arr.length;i++) {
	    	 square  = arr[i]*arr[i];
	     
	     al.add(square);
	     }
	   Integer[] sarr = new Integer[al.size()];
	   sarr = al.toArray(sarr);
	  
	    	for(int i=0;i<sarr.length;i++) {
	    		for(int j =i+1;j<sarr.length;j++) {
	    			if(sarr[i]>sarr[j]) {
	    				temp = sarr[i];
	    				sarr[i]=sarr[j];
	    				sarr[j] = temp;
	    			}
	    		}
	    		System.out.print(sarr[i]+", ");
	    		
	    		
	    	}
	     
	     }
}