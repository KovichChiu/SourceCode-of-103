import java.util.Scanner;
public class CW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字元：");
		String str = scn.next();
		char a1 = str.charAt(0);
		int v1 = (int)a1;
		if(v1>=65 && v1<=90){
			System.out.println("這是英文大寫!");
		}
		else if(v1>=97 && v1<=102){
			System.out.println("這是英文小寫!");
		}else{
			System.out.println("這是其他字元！");
		}
	}
}
