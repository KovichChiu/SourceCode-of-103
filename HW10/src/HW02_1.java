import java.util.Scanner;
public class HW02_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入底數：");
		int a = scn.nextInt();
		System.out.print("請輸入指數：");
		int n = scn.nextInt();
		System.out.print("答案： \n"+a+"^"+n+" = "+power(a,n));
	}
	private static int power(int a,int n){
		if(n==1){
			return a;
		}else{
			n=n-1;
			return a*power(a,n);
		}
	}
}
