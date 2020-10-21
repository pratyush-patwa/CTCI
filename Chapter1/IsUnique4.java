package Chapter1;
import java.util.Scanner;
public class IsUnique4 {
	public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	str = str.toLowerCase();
    	System.out.println(checkUnique(str));
    	sc.close();
   
    }    	
    public static boolean checkUnique(String str){
    	int checker =0;
    	
   
    	for(int i=0; i<str.length();i++){
		int index = str.charAt(i)-'a';
		
    		if ((checker & (1<< index))>0)
    			return false;
    		
    		checker |= (1<<index);
    	}
    	return true;
    }
}
