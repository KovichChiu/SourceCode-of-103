import java.util.Scanner;
public class Class_014 {
	/*
 14. 設計一函數F(w,h),印出寬w,高h如下的數字矩陣。
	(以w=5,h=3為例)
	1  2  3  4  5
	2  4  6  8 10
	3  6  9 12 15
    其中第二行是第一行的兩倍, 第三行是第一行的三倍, 以此類推. 
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入他的寬：");
		int w = scn.nextInt();
		System.out.print("請輸入他的高：");
		int h = scn.nextInt();
		System.out.println("所得結果如下：");
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
}
