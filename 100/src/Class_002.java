import java.util.Scanner;
public class Class_002 {

	/*
	 * 2.��J�@�Ӧr��, �ç⥦�ϦV��X
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		System.out.print("��J�@�Ӧr��, �ڷ|�⥦�ϦV��X�G");
		String a = scn.next();
		char [] b = a.toCharArray();
		int c = a.length();
		for(int i = c-1;i>=0;i--){
			System.out.print(b[i]);
		}
	}

}
