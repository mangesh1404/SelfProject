package TestProg;

public class Q6 {
public static void main(String[] args) {
	String str = "java by kiran";
	int count=0,num=0;
	char [] arr = str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		
		 if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
			count++;
		}else {
			num++;
		}
		 if(arr[i]==' ') {
				num--;
			}
	}
	System.out.println("number of vowels in string are "+count+" and consonants are "+num);
}
}
