import java.util.Scanner;
public class HW03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ���ƭȡG");
		int num = scn.nextInt();
		System.out.print("�`�@�O"+re(num,0)+"��ơC");
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
