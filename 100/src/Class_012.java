import java.util.Scanner;
public class Class_012 {
	/*
	 * 12. 輸入國文, 英文和數學成績, 計算其總分數及每科平均成績
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入國文科的成績：");
		int ch = scn.nextInt();
		System.out.print("請輸入英文科的成績：");
		int en = scn.nextInt();
		System.out.print("請輸入數學科的成績：");
		int m = scn.nextInt();
		int all = ch+en+m;
		double range = (double)all/3;
		System.out.print("總分："+all+"\t"+"總平均："+range);
	}

}
