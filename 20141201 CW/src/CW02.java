import java.util.Scanner;
public class CW02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӭ^��r���G");
		String str = scn.next();
		char a1 = str.charAt(0);
		int v1 = (int)a1;
		if(v1>=65 && v1<=90){
			v1=v1+32;
			System.out.println("�o�O�p�g�G"+(char)v1);
		}
		else if(v1>=97 && v1<=102){
			v1=v1-32;
			System.out.println("�o�O�j�g�G"+(char)v1);
		}else{
			System.out.println("�o���O�^��I");
		}
	}

}
