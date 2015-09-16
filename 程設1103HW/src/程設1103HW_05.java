import java.util.Scanner;
public class 程設1103HW_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個值，這將會是2的指數：");
		int num = scn.nextInt();
		int n =2;
		for(int i = 1;i<num;i++){
			n=n*2;
		}
		System.out.print("經過計算的值="+n);
	}
}