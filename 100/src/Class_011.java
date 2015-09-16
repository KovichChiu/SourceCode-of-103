import java.util.Scanner;
public class Class_011 {
	/*
	 * 11. 輸入兩個整數, 計算其合, 差, 乘積.
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個數：");
		int num1 = scn.nextInt();
		System.out.print("請輸入第二個數：");
		int num2 = scn.nextInt();
		System.out.println("合="+(num1+num2));
		System.out.println("差="+(num1-num2));
		System.out.println("乘積="+(num1*num2));
	}
}
