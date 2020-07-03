package Chapter1;
import java.util.*;
public class PallindromePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = s.replace(" ", "");
		str = str.toLowerCase();
		int n = str.length();
		char [] alphabet = new char[26];
		for(int i=0; i<n; i++){
			alphabet[str.charAt(i) -'a'] += 1;
		}
		int oddCount =0;
		for(int j: alphabet) {
			if(alphabet[j]%2!=0) {
				oddCount++;
			}
		}	
		if(oddCount ==1 || oddCount ==0) 
			System.out.print("True");
		else
			System.out.print("False");
		
		sc.close();
	}	
}

