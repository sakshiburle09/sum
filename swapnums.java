import java.util.Scanner;
public class swapnum {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		System.out.println("before swapping values:"+num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping values:"+num1+" "+num2);

	}

}
