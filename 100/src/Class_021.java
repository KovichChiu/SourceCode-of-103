import java.util.Random;
import java.util.Scanner;
public class Class_021 {

	/*
	  21. �]�p�@�q�Ʀr�C��(��1~5������ܤ@�üơA���ϥΪ̲q�@���A����ܵ��G
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("��1~5�����q�@�ӼƦr�G");
		int a = scn.nextInt();
		
		int [] r = new int [1];
		r[0]=ran.nextInt(6)+1;
		if(r[0]==a){
			System.out.print("�q��F�I");
		}else{
			System.out.print("�q���F�I");
			System.out.print("���T���׬��G"+r[0]);
		}
	}

}
