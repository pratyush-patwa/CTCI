package Chapter1;
import java.util.Scanner;
public class IsUnique {
	public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	str = str.toUpperCase();
    	checkUnique(str);
    	sc.close();
   
    }    	
    public static void checkUnique(String str){
    	boolean isUnique = true;
    	int [] alphabets = new int[26];
   
    	for(int i=0; i<str.length();i++){
		int index = str.charAt(i)-65;
		
    		if (alphabets[index] == 1) {
    			isUnique = false;
    			break;
    		}
    		else
    			alphabets[index] = 1;
    	}
    if(isUnique)  System.out.print("Unique");
    else System.out.print("Not Unique");
    }
}
