import java.util.Scanner;
public class CW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr���G");
		String str = scn.next();
		char a1 = str.charAt(0);
		int v1 = (int)a1;
		if(v1>=65 && v1<=90){
			System.out.println("�o�O�^��j�g!");
		}
		else if(v1>=97 && v1<=102){
			System.out.println("�o�O�^��p�g!");
		}else{
			System.out.println("�o�O��L�r���I");
		}
	}
}
