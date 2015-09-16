package ±Ð¾Ç©jªºtest;
import java.util.Scanner;
public class practice02_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int n = scn.nextInt();
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.print("="+sum);
	}

}
