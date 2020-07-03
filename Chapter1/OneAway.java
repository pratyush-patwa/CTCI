package Chapter1;
import java.util.*;
public class OneAway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =4; 
		while(t>0) {
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.print(checkOneAway(str1, str2));
		t--;
		}
		sc.close();
	}
	public static boolean checkOneAway(String str1,String str2) {
		int n = str1.length();
		int m = str2.length();
		int j =0;
		int countdiff =0;

		if((n>m && n != m+1) || (n<m && n+1 != m))
			return false;
				
		else if(n==m)
			for(int i =0; i<n; i++) {
				if(str1.charAt(i) != str2.charAt(i))
					countdiff++;
			}
		else if(n>m)
			for(int i=0; i<n && i<m ; i++) {
			if(str1.charAt(i) != str2.charAt(j)) // && flag == false)
					countdiff++;
			else
					j++;
			}
		else 
			for(int i=0; i<m && i<n; i++) {
				if(str2.charAt(i) != str1.charAt(j))
					countdiff++;
				else
					j++;
			}
		if(countdiff<=1)
			return true;
		return false;
	}
}
