import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一串數字：");
		int unint = scn.nextInt();
		String str = String.valueOf(unint);
		int len = str.length();
		char [] data = str.toCharArray();
		String str2 = "";
		for(int i=0;i<len;i++){
			str2+=data[i]+"+";
		}
		String str3 = new StringBuffer(str2).deleteCharAt((2*len)-1).toString();
		System.out.print(str3+"="+rt(unint));
	}
	public static int rt(int n){
		if(n/10==0){
			return n;
		}else{
			return n%10+rt(n/10);
		}
	}
}
