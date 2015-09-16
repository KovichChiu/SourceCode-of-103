import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字元：");
		String w = scn.next();
		char chr = w.charAt(0);
		int nw = (int)chr;
		if(nw>=65 && nw<=90){
			System.out.println("這是英文大寫!");
		}
		else if(nw>=97 && nw<=102){
			System.out.println("這是英文小寫!");
		}else{
			System.out.println("這是其他字元！");
		}
	}
}
