import java.util.Scanner;
public class �_�l�I���I {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӱ_�l�Ʀr�H�Τ@�Ӳ��I�Ʀr�C");
		System.out.print("�п�J�_�l�Ʀr�G");
		int s = scn.nextInt();
		System.out.print("�п�J���I�Ʀr�G");
		int f = scn.nextInt();
		int num = 0;
		if(f<s){
			for(int i = s;i>=f;i--){
				num+=i;
			}
			System.out.print("�֥[���׬��G"+num);
		}
		else if(f>s){
			for(int i = s;i<=f;i++){
				num+=i;
			}
			System.out.print("�֥[���׬��G"+num);
		}
	}

}
