package Chapter1;
import java.util.Scanner;
public class isUnique3 {
	public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	System.out.println(checkUnique(str));
    	sc.close();
   
    }    	
    public static boolean checkUnique(String str){

    	for(int i=0; i<str.length()-1;i++){
    		for(int j =i+1; j<str.length();j++) {
    			if(str.charAt(i) == str.charAt(j))
    				return false;
    		}
    	}
    	return true;
    }
}
