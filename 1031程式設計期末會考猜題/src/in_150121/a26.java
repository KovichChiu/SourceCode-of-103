package in_150121;
import java.util.Scanner;
public class a26 {
	/*
	 * 26. 寫一遞迴函數，求m,n兩數的最大公因數gcd,m,n由鍵盤輸入.
	(註:以輾轉相除法,兩數相除後,再以其除數除以餘數,直到餘數為零.)
	(註: gcd(x,y) = gcd(y, x%y); gcd(x,0) = x)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個數：");
		int m = scn.nextInt();
		System.out.print("請輸入第二個數：");
		int n = scn.nextInt();
		System.out.print(m+","+n+"的最大公因數="+gcd(m,n));
	}
	private static int gcd(int m,int n){
		if(m%n==0){
			return n;
		}else{
			return gcd(n,m%n);
		}
	}
}
