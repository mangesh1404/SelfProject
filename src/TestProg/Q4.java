package TestProg;

public class Q4 {
public static void main(String[] args) {
	String str ="mangesh";
	char old = 'a';
	char rel = 'b';
	char[] arr= str.toCharArray();
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==old) {
			arr[i]=rel;
		}
		
	}
	String str1 = new String(arr);
	System.out.println(str1);
}
}
