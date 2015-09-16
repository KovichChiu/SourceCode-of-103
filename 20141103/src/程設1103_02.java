import java.util.Random;
public class 程設1103_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("電腦產生了 10 X 10 的亂數陣列如下：");
		int[][]a=new int [10][10];
		Random ran = new Random();
		for (int i = 0;i<10;i++){
			for(int j=0;j<10;j++){
				a[i][j] = ran.nextInt(10)+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("轉置後的 10 X 10 亂數陣列如下：");
		for(int i = 0;i<10;i++){
			for(int j =0;j<10;j++){
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
