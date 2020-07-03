/*Two string are passed as input we have to check whether the strings are permutation of each other or not
 * The Complexity of this solution is O(n log n)*/

package Chapter1;

import java.util.*;


public class CheckPermutation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1.replaceAll(" ", "");
		str2.replaceAll(" ", "");
		
		System.out.print("Permutation : "+checkPermutation(str1, str2));
		
		sc.close();
		}
		//The Below Function will do the task in N log N
		public static boolean checkPermutation(String s1, String s2) {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);	
			Arrays.sort(arr2);
			
			for(int i=0; i<arr1.length; i++) {
				
				if(arr1[i]!=arr2[i]){
					return false;
				}
			}
			return true;
		}

}
