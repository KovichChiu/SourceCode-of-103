import java.util.Scanner;
public class CW03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J����G");
		int len = scn.nextInt();
		System.out.print("�п�J�n�e�{���r�G");
		String str = scn.next();
		square(len,str);
	}
	private static void square(int v1,String s1){
		for(int i=0;i<v1;i++){
			for(int j=0;j<v1;j++){
				System.out.print(s1);
			}
			System.out.println();
		}
	}

}
