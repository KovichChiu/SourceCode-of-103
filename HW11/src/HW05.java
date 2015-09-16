import java.util.Scanner;
public class HW05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入第一個 A X B 的矩陣。");
		System.out.print("A1：");
		int a1 = scn.nextInt();
		System.out.print("B1：");
		int b1 = scn.nextInt();
		int [][] Matrix1 = new int [a1][b1];
		System.out.println("請按照先左到右在上到下輸入矩陣的值。");
		for(int i=0;i<a1;i++){
			for(int j=0;j<b1;j++){
				System.out.print("在["+i+"]["+j+"]的位置的值：");
				Matrix1[i][j]=scn.nextInt();
			}
		}
		System.out.println("請輸入第二個 A X B 的矩陣。");
		System.out.print("A2：");
		int a2 = scn.nextInt();
		System.out.print("B2：");
		int b2 = scn.nextInt();
		int [][] Matrix2 = new int [a2][b2];
		System.out.println("請按照先左到右在上到下輸入矩陣的值。");
		for(int i=0;i<a2;i++){
			for(int j=0;j<b2;j++){
				System.out.print("在["+i+"]["+j+"]的位置的值：");
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
		System.out.println("A & B 矩陣的相乘結果如下。");
		for(int i=0;i<a1;i++){
			for(int j=0;j<b2;j++){
				System.out.print(Matrix3[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
