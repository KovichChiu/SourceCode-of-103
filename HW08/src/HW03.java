import java.util.Scanner;
public class HW03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個正整數值：");
		int num = scn.nextInt();
		System.out.print("總共是"+re(num,0)+"位數。");
	}
	private static int re(int m,int n){
		if(m==0){
			return n;
		}else{
			n=n+1;
			return re(m/10,n);
		}
	}
}
