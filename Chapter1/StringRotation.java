package Chapter1;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.print(checkRotation(str1, str2));
		sc.close();
	}
	public static boolean checkRotation(String str1, String str2) {
		String doubleStr2 = str2+str2;
		return isSubstring(str1 , doubleStr2);
	} 
	public static boolean isSubstring(String subString, String fullString) {
		return fullString.contains(subString);
	}
}
