import java.util.Scanner;
public class Class_006 {
	/*
	 * 6. 輸入一個字元, 判斷是大寫或小寫或是其他字元
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字元：");
		String str = scn.next();
		char str1=str.charAt(0);
		if(str1>=65&&str1<=90){
			System.out.println("大寫");
		}else{
			if(str1>=97&&str1<=122){
				System.out.println("小寫");
			}else{
				System.out.print("其他字元");
			}
		}
	}
}
