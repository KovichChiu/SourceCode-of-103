import java.util.Scanner;
public class Class_008 {

	/*
	 * 8. 讓使用者輸入一攝氏溫度，輸出相對應的華氏溫度。(F=C*9/5+32)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您要計算的溫度：");
		int a = scn.nextInt();
		System.out.print("請入您要的單位，1)華氏→攝氏    2)攝氏→華氏：");
		int b = scn.nextInt();
		
		if(b==1){
			double c = (a-32)*5/9;
			System.out.print("經換算後的溫度是攝氏"+c+"度。");
		}
		else if(b==2){
			double c = a*9/5+32;
			System.out.print("經換算後的溫度是華氏"+c+"度。");
		}
	}

}
