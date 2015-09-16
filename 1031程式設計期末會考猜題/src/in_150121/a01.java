package in_150121;
import java.util.Scanner;
/*
 * 1. 將一連串數字(每個數字為0~9)輸入, 計算其和. Ex: 輸入 12345, 輸出為 15 (1+2+3+4+5=15)
 */
public class a01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一串數字：");
		String str = scn.next();
		char [] data = str.toCharArray();
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum+=data[i]-'0';
		}
		for(int i=0;i<str.length()-1;i++){
			System.out.print(data[i]+"+");
		}
		System.out.print(data[str.length()-1]+"="+sum);
	}
}
