package Chapter1;

import java.util.Scanner;

public class CheckPermutation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase().replaceAll("\\s","");
		str2 = str2.toLowerCase().replaceAll("\\s","");

		System.out.print("Permutation : "+checkPermutation(str1, str2));

		sc.close();
	}
		
		public static boolean checkPermutation(String s1, String s2) {
			if(s1.length()!= s2.length()) {
				return false;
			}
			int [] letters = new int[128];
			char [] s_array = s1.toCharArray();
			for(char c: s_array) {
				letters[c]++;
			}
			for(int i=0; i< s2.length(); i++) {
				int c  = (int)s2.charAt(i);
				letters[c]--;
				if(letters[c] < 0)
					return false;
			}
		return true;

	}

}
