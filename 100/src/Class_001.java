import java.util.Scanner;
public class Class_001 {
	/*
	 *  1.�N�@�s��Ʀr(�C�ӼƦr��0~9)��J, �p���M. Ex: ��J 12345, ��X�� 15 (1+2+3+4+5=15)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@��1~9���Ʀr�A�ڱN��Ʀr�ӧO��}�ìۥ[�G");
		String a = scn.next();
		char [] b = a.toCharArray();
		int n =0;
		for(int i = 0;i<a.length();i++){
			n=n+b[i]-'0';
			System.out.println(b[i]);
		}			
		System.out.println(n);
	}
}
