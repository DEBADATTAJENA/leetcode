package hearth;

import java.util.HashSet;

public class smallestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "stackoverflow";
		String largestOverAll = "";
		String largestTillNow= "";
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0;i<str.length();i++) {
			char c =str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				largestTillNow+=c;
			}else {
				set.clear();
			}
			
			if(largestTillNow.length()>largestOverAll.length()) {
				largestOverAll=largestTillNow;
			}
		}
		
		System.out.println(largestOverAll);
		
	}

}
