import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr���G");
		String w = scn.next();
		char chr = w.charAt(0);
		int nw = (int)chr;
		if(nw>=65 && nw<=90){
			System.out.println("�o�O�^��j�g!");
		}
		else if(nw>=97 && nw<=102){
			System.out.println("�o�O�^��p�g!");
		}else{
			System.out.println("�o�O��L�r���I");
		}
	}
}
