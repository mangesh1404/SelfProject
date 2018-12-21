package TestProg;

public class Q1 {
public static void main(String[] args) {
	char i;
	for(i='a';i<='z';i++) {
		System.out.print(i+" ");
		int a= i-32;
		char i1= (char)a;
		System.out.println(i1+" ");
	}
}
}
