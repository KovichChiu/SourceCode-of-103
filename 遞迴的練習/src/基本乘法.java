import java.util.Scanner;
public class �򥻭��k {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�̤j�ȡG");
		int v1 = scn.nextInt();
		System.out.print("�n="+Multiplication(v1));
	}
	public static int Multiplication(int n){
		if(n==1){
			return 1;
		}else{
			return n*Multiplication(n-1);
		}
	}

}
