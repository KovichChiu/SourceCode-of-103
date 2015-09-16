import java.util.Scanner;
public class 基本乘法 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入最大值：");
		int v1 = scn.nextInt();
		System.out.print("積="+Multiplication(v1));
	}
	public static int Multiplication(int n){
		if(n==1){
			return 1;
		}else{
			return n*Multiplication(n-1);
		}
	}

}
