import java.util.Scanner;
public class �{�]1103_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�z�n�ϦV��X���@���r�G");
		String str = scn.next();
		char [] data = str.toCharArray();
		int len = data.length;
		System.out.print("�ұo�r�ꬰ�G");
		for(int i =len-1;i>=0;i--){
			System.out.print(data[i]);
		}
	}

}
