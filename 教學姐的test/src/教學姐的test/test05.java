package �оǩj��test;
import java.util.Scanner;
import java.util.ArrayList;
public class test05 {

	public static void main(String[] args) {
//		������A1M1F�A�h����1week�A�@����30(30%M  70%F)�A�p���Q�j���Y��10%
//		�p��������������4week
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList <Integer> perWeek = new ArrayList<Integer>();
		int [] Fish = new int [n];
		perWeek.add(0);//�Ĥ@�P�S����
		for(int i=1;i<n;i++){
			System.out.println(i); // ��ܩP��(��0�P����]�����Ⱖ���S����)
			if(i<=5){  //�X�ͫ��5�P�}�l�i�H����
				
				perWeek.add(1); // i�P���Ͳ��q(���:��)
				Fish[i]=30;
			}else{
				perWeek.add(perWeek.get(i-1)+perWeek.get(i-5));
				/*
				 * ��i�쪺�Ͳ��q�O�e��1�P�ƶq+�e��5�P�������ƶq*30
				 * (�����ƶq = 30*0.7 = 21)
				 *      ���e�@�P���Ͳ��q         ��5�P�e���Ӫ��j�i�H�Ͳ������μƥ�*�C�γ��q*�������*�C���ͤU30��     
				 */
				Fish[i]=Fish[i-1]+(perWeek.get(i-5)*21*30);
			}
		}
		int total = 0;
		for(int i=0;i<n;i++ ){
			total = total+Fish[i];
		}
		int alltotal = total*9/10; //���F�̤@�}�l���Ⱖ�A��L������10%  �ҥH*0.9
		
		System.out.print("�@����"+(alltotal+2)+"����");
	}
}
