import java.util.Scanner;
public class HW05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�Ĥ@�� A X B ���x�}�C");
		System.out.print("A1�G");
		int a1 = scn.nextInt();
		System.out.print("B1�G");
		int b1 = scn.nextInt();
		int [][] Matrix1 = new int [a1][b1];
		System.out.println("�Ы��ӥ�����k�b�W��U��J�x�}���ȡC");
		for(int i=0;i<a1;i++){
			for(int j=0;j<b1;j++){
				System.out.print("�b["+i+"]["+j+"]����m���ȡG");
				Matrix1[i][j]=scn.nextInt();
			}
		}
		System.out.println("�п�J�ĤG�� A X B ���x�}�C");
		System.out.print("A2�G");
		int a2 = scn.nextInt();
		System.out.print("B2�G");
		int b2 = scn.nextInt();
		int [][] Matrix2 = new int [a2][b2];
		System.out.println("�Ы��ӥ�����k�b�W��U��J�x�}���ȡC");
		for(int i=0;i<a2;i++){
			for(int j=0;j<b2;j++){
				System.out.print("�b["+i+"]["+j+"]����m���ȡG");
				Matrix2[i][j]=scn.nextInt();
			}
		}
		int [][] Matrix3 = new int [a1][b2];
		int x=0,y=0;
		for(int i=0;i<a1;i++){	
			for(int j=0;j<b2;j++){
				x=i;
				for(int k=0;k<b1;k++){
					Matrix3[i][j]=Matrix3[i][j]+(Matrix1[i][k]*Matrix2[k][j]);
					x++;
				}
			}
		}
		System.out.println("A & B �x�}���ۭ����G�p�U�C");
		for(int i=0;i<a1;i++){
			for(int j=0;j<b2;j++){
				System.out.print(Matrix3[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
