import java.util.Scanner;
public class HW02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@��Ʀr�G");
		String num = scn.next();
		decomp(num);
	}
	private static void decomp(String n){
		char a[]=n.toCharArray();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
