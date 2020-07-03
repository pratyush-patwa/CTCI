/*Two string are passed as input we have to check whether the strings are permutation of each other or not
 * The Complexity of this solution is O(n)*/

package Chapter1;

import java.util.*;

public class ChecKPermutation {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	
	str1.replaceAll(" ", "");
	str2.replaceAll(" ", "");
	
	System.out.print("Permutation : "+checkPermutation(str1, str2));
	
	sc.close();
	}
	
	public static boolean checkPermutation(String s1, String s2) {
		if(s1.length()!= s2.length()) {
			return false;
		}
		char []arr1 = new char[26];
		char []arr2 = new char[26];
		for(int i=0; i<s1.length(); i++) {
			arr1[s1.charAt(i)-'a'] +=1;
		}
		for(int j=0; j<s2.length(); j++) {
			arr2[s2.charAt(j)-'a'] +=1;
		}
		
		for(int k=0; k<26; k++) {
			if(arr1[k] != arr2[k])
				return false;
		}
		return true;
	}
}
