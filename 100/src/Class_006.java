import java.util.Scanner;
public class Class_006 {
	/*
	 * 6. ��J�@�Ӧr��, �P�_�O�j�g�Τp�g�άO��L�r��
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr���G");
		String str = scn.next();
		char str1=str.charAt(0);
		if(str1>=65&&str1<=90){
			System.out.println("�j�g");
		}else{
			if(str1>=97&&str1<=122){
				System.out.println("�p�g");
			}else{
				System.out.print("��L�r��");
			}
		}
	}
}
