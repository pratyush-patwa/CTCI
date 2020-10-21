package Chapter1;
import java.util.Scanner;
public class isUnique2 {
	public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	str = str.toUpperCase();
    	System.out.println(checkUnique(str));
    	sc.close();
   
    }    	
    public static boolean checkUnique(String str){
    
    	boolean [] alphabets = new boolean[26];
   
    	for(int i=0; i<str.length();i++){
		int index = str.charAt(i)-65;
		
    		if (alphabets[index])
    			return false;
    		else
    			alphabets[index] = true;
    	}
    	return true;
    }
}