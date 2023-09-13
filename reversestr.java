package java_program;
import java.lang.*;
import java.util.*;
public class reversestr {
public static void main(String arsg[]) {
	String str;
	int strlen;
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER A STRING:");
	str=sc.nextLine();
	strlen=str.length();
	String rev=" ";
	for(int i=strlen-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println("revers string is:"+rev);
	
}
}
