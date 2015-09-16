import java.util.Random;
public class Class_005 {

	/*
	 *5. 設計一個程式由1~10的亂數隨機產生一10*10的二維陣列，將行列互換輸出(即輸出轉置矩陣)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("以下為一 10X10 的亂數陣列，數值為1~10");
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
