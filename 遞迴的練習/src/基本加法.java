import java.util.Scanner;
public class �򥻥[�k {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�̤j�ȡG");
		int v1 = scn.nextInt();
		System.out.println("�`�X="+add(v1));
	}
	public static int add(int a){
		if(a==1){
			return 1;
		}else{
			return a+add(a-1);
		}
	}
}
