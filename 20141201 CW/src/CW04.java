import java.util.Scanner;
public class CW04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���סG");
		int h = scn.nextInt();
		System.out.print("�п�J�e�סG");
		int w = scn.nextInt();
		asd(h,w);
	}
	private static void asd(int s1,int s2){
		for(int i=1;i<=s1;i++){
			for(int j=1;j<=s2;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
