import java.util.Scanner;
public class test01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӼơA�ڱN�p��䶥�h�G");//5*4*3*2*1..
		int a = scn.nextInt();
		for(int i = a;i>1;i--){
			System.out.print(i+"X");
		}
		System.out.print("1=");
		for(int i=a-1;i>0;i--){
			a=a*i;
		}
		System.out.print(a);
	}
}
