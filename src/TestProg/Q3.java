package TestProg;

public class Q3 {
public static void main(String[] args) {
	String str= "mangesh";
	int j=0;
	
	char [] arr =str.toCharArray();
	char[] rev= new char[arr.length];
	for(int i=arr.length-1;i>=0;i--) {
		rev[j]=arr[i];
		j++;
		
	}
	String revers  =new String(rev);
	System.out.println(revers);
}
}
