import java.util.Random;
import java.util.Scanner;
public class �{�]1103_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("�q���w�g��n�F�@�ӼƦr�A�Цb1~5���q�@�ӼƦr�G");
		int n = scn.nextInt();
		int [] a = new int [1];
		a[0]=ran.nextInt(5)+1;
		if(a[0]<1||a[0]>5){
			System.out.print("�C������...��]�O�z��J���~�I");
		}
		if(a[0]==n){
			System.out.print("���ߵ���F!");
		}else{
			System.out.println("�A���A�F�I");
			System.out.print("���T���׬��G"+a[0]);
		}
	}

}
