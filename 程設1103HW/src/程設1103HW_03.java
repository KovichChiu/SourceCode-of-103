import java.util.Random;
public class �{�]1103HW_03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [][]a=new int [5][7];
		System.out.println("�U�C���@ 5 X 7 ���üư}�C�G");
		for(int i = 0;i<5;i++){
			for(int j = 0;j<7;j++){
				a[i][j]=ran.nextInt(100)+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("�U�C���W�C�üư}�C�ϦV��X 7 X 5 ���üư}�C�G");
		for(int j = 0;j<5;j++){
			for(int i = 0;i<7;i++){
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
