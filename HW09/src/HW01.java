import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個值，不含0：");
		int input =scn.nextInt();
		System.out.print("他是一個"+seat(input,0)+"位數的值。");
	}
	public static int seat(int m,int n){
		n++;
		if(m/10==0){
			return n;
		}else{
			return seat(m/10,n);
		}
	}
}
