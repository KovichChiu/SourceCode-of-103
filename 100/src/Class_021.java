import java.util.Random;
import java.util.Scanner;
public class Class_021 {

	/*
	  21. 設計一猜數字遊戲(由1~5之間選擇一亂數，讓使用者猜一次，並顯示結果
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("請1~5之間猜一個數字：");
		int a = scn.nextInt();
		
		int [] r = new int [1];
		r[0]=ran.nextInt(6)+1;
		if(r[0]==a){
			System.out.print("猜對了！");
		}else{
			System.out.print("猜錯了！");
			System.out.print("正確答案為："+r[0]);
		}
	}

}
