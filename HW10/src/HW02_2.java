import java.util.Scanner;
public class HW02_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���ơG");
		int a = scn.nextInt();
		System.out.print("�п�J���ơG");
		int n = scn.nextInt();
		int j=0;
		if(n%2==0){
			j=1;
		}
		System.out.print("���סG \n"+a+"^"+n+" = "+power(a,n,j));
	}
	private static int power(int a,int n,int j){
		if(j==0){
			if(n==1){
				return a;
			}else{
				n=n-1;
				return a*power(a,n,j);
			}
		}else{
			if(n==1){
				return a;
			}else{
				return power(a,n/2,j)*power(a,n/2,j);
			}
		}
	}
}
