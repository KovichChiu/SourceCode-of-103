import java.util.Scanner;
public class HW02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個值：");
		int m=scn.nextInt();
		System.out.print("請輸入第二個值：");
		int n=scn.nextInt();
		System.out.print("以上兩數的最大公因數為"+pub(m,n)+"。");
	}
	public static int pub(int m,int n){
		if(m%n==0){
			return n;
		}else{
			return pub(n,m%n);
		}
	}
}
