import java.util.Scanner;
public class Class_001 {
	/*
	 *  1.將一連串數字(每個數字為0~9)輸入, 計算其和. Ex: 輸入 12345, 輸出為 15 (1+2+3+4+5=15)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一串1~9的數字，我將把數字個別拆開並相加：");
		String a = scn.next();
		char [] b = a.toCharArray();
		int n =0;
		for(int i = 0;i<a.length();i++){
			n=n+b[i]-'0';
			System.out.println(b[i]);
		}			
		System.out.println(n);
	}
}
