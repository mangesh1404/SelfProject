package TestProg;

public class Q11 {
public static void main(String[] args) {
	String str="mangersh";
	int j=0;
	char[] arr1=new char[str.length()-1];
	char[] arr= str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=='r') {
			
		}else {
			arr1[j]=arr[i];
			j++;
		}
	}
	String str1= new String(arr1);
	System.out.println("Replaced String is: "+str1);
}
}
