import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӭȡA���t0�G");
		int input =scn.nextInt();
		System.out.print("�L�O�@��"+seat(input,0)+"��ƪ��ȡC");
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
