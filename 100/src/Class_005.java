import java.util.Random;
public class Class_005 {

	/*
	 *5. �]�p�@�ӵ{����1~10���ü��H�����ͤ@10*10���G���}�C�A�N��C������X(�Y��X��m�x�})
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�H�U���@ 10X10 ���üư}�C�A�ƭȬ�1~10");
		int[][]a = new int [10][10];
		Random ran = new Random();
		for(int i=0;i<10;i++){
			for(int j = 0;j<10;j++){
				a[i][j]=ran.nextInt(10);
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
