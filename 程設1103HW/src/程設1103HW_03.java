import java.util.Random;
public class 程設1103HW_03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [][]a=new int [5][7];
		System.out.println("下列為一 5 X 7 的亂數陣列：");
		for(int i = 0;i<5;i++){
			for(int j = 0;j<7;j++){
				a[i][j]=ran.nextInt(100)+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("下列為上列亂數陣列反向輸出 7 X 5 的亂數陣列：");
		for(int j = 0;j<5;j++){
			for(int i = 0;i<7;i++){
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
