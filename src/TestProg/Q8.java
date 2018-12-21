package TestProg;

public class Q8 {
public static void main(String[] args) {
	int i,j,s,count=1;
	for(i=1;i<=6;i++) {
		for(s=5;s>=i;s--) {
			System.out.print(" ");
		}
		for(j=1;j<=count;j++) {
			System.out.print("*");
		}
		count= count+2;
		System.out.println();
	}
}
}
