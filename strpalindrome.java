import java.lang.*;
import java.util.*;
public class strpalindrome {
public static void main(String args[]) {
	String str,reverstr="";
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your string:");
	str=sc.nextLine();
	str= str.toLowerCase();
	int strlen = str.length();
	for(int i=(strlen-1); i>=0; --i) {
		reverstr = reverstr + str.charAt(i);
	}
	if(str.equalsIgnoreCase(reverstr))
		System.out.println(str +" string is palindrome");
	
	else 
		System.out.println(str +" String is not palindrome");
}
}
