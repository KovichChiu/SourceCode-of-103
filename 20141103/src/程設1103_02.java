import java.util.Random;
public class �{�]1103_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�q�����ͤF 10 X 10 ���üư}�C�p�U�G");
		int[][]a=new int [10][10];
		Random ran = new Random();
		for (int i = 0;i<10;i++){
			for(int j=0;j<10;j++){
				a[i][j] = ran.nextInt(10)+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("��m�᪺ 10 X 10 �üư}�C�p�U�G");
		for(int i = 0;i<10;i++){
			for(int j =0;j<10;j++){
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
