package in_150121;
import java.util.Scanner;
public class a12 {
	/*
	 * 12. 輸入國文, 英文和數學成績, 計算其總分數及每科平均成績
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入國文成績：");
		double C = scn.nextDouble();
		System.out.print("請輸入英文成績：");
		double E = scn.nextDouble();
		System.out.print("請輸入數學成績：");
		double M = scn.nextDouble();
		System.out.print("總分為："+(C+E+M)+"，平均為："+((C+E+M)/3)+"。");
	}
}
