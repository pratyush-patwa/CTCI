package Chapter1;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print(uRLify(str));
		sc.close();

	}
	public static String uRLify(String str) {
		int countspace =0;
		int n = str.length();
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == ' ') {
				countspace++;
			}
		}
		char [] arr = new char[n+(countspace *3)];
		int j=0;
		for(int k=0; k<n; k++){
			if(str.charAt(k) == ' ') {
				arr[j]   = '%';
				arr[j+1] = '2';
				arr[j+2] = '0';
				j+=3;
			}else {
				arr[j] = str.charAt(k);
				j++;
			}
		}
		String output = new String(arr);
		return output;
	}
}
