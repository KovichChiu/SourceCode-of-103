import java.util.Scanner;
import java.math.BigInteger;
public class HW02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JA�ȡG");
		String a = scn.next();
		System.out.print("�п�JB�ȡG");
		String b = scn.next();
		BigInteger Ba = new BigInteger(a);
		BigInteger Bb = new BigInteger(b);
		System.out.print("�аݭp���k�G 1)+  2)*  �G");
		int c = scn.nextInt();
		if(c==1){
			System.out.println(a+" + "+b+" = "+Ba.add(Bb));
		}
		if(c==2){
			System.out.println(a+" X "+b+" = "+Ba.multiply(Bb));
		}
	}
}
