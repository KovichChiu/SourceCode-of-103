package in_150121;
import java.util.Scanner;
/*
 * 1. �N�@�s��Ʀr(�C�ӼƦr��0~9)��J, �p���M. Ex: ��J 12345, ��X�� 15 (1+2+3+4+5=15)
 */
public class a01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@��Ʀr�G");
		String str = scn.next();
		char [] data = str.toCharArray();
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum+=data[i]-'0';
		}
		for(int i=0;i<str.length()-1;i++){
			System.out.print(data[i]+"+");
		}
		System.out.print(data[str.length()-1]+"="+sum);
	}
}
