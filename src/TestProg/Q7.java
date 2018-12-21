package TestProg;

import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any String");
	String str =sc.nextLine();
	char[] arr=str.toCharArray();
	int a= arr.length;
	for(int i=0;i<=a;i++) {
		for(int j=a;j>=i;j--){
			System.out.print(" ");
		}
		for(int j=0;j<i;j++){
	System.out.print(" "+arr[j]);
		}
			System.out.println();
}
}}
