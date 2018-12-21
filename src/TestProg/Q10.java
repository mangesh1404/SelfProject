package TestProg;

public class Q10 {
public static void main(String[] args) {
	int count=1,n=1;
	for(int i=1;i<=6;i++) {
		for(int j=6;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=count;k++) {
			System.out.print(n);
		}
		count=count+2;
		n++;
		System.out.println();
		
	}
}
}
