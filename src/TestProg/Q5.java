package TestProg;

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
	int i=0,j;
	String[] names= new String[5];
	String temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any five words:");
	for(i=0;i<5;i++) {
		names[i]= sc.nextLine();
	}
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			if(names[j-1].compareTo(names[j])>0) {
				temp= names[j-1];
				names[j-1]=names[j];
				names[j]=temp;
			}}}
	for(int k=1;k<=5;k++){
	System.out.println("Sorted names are"+names[i]);
}
}
}