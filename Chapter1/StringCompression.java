package Chapter1;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(compressed(str));
		sc.close();
	}
	public static String compressed(String str) {
		
		StringBuilder compressedString = new StringBuilder();
		int countCharSequence =0;
		for(int i=0; i<str.length(); i++) {
			countCharSequence++;
			if(i+1>= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressedString.append(str.charAt(i));
				compressedString.append(countCharSequence);
				countCharSequence=0;
			}
		}
		return compressedString.length()<=str.length() ? compressedString.toString() : str;
	}
}
