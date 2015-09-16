import java.util.Scanner;
public class Class_015 {
	/*
	 15. 寫一程式，讓使用者輸入身高(cm)及體重(kg)，作單位換算輸出身高(英吋)及體重(磅)。(1磅=0.454公斤，1吋=2.54公分)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您的身高(cm)：");
		double h = scn.nextDouble();
		System.out.print("請輸入您的體重(kg)：");
		double w = scn.nextDouble();
		double nh = h/2.54;
		double nw = w/0.454;
		System.out.println("換算後的身高(吋)："+nh);
		System.out.println("換算後的體重(磅)："+nw);
	}

}
