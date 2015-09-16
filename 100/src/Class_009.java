import java.util.Scanner;
public class Class_009 {
	/*
	 *9. 讓使用者輸入性別與身高，並依據男女不同, 幫她(他)計算並輸出其標準體重 (男：(身高-170)*0.6+62 女：(身高-158)*0.5+52)。
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您的性別：");
		String a = scn.next();
		System.out.print("請輸入您的身高：");
		double b = scn.nextDouble();
		if(a.equals("男")){
			double c = (b-170.0)*0.6+62.0;
			System.out.print("您的標準體重："+c);
		}
		else if(a.equals("女")){
			double c =(b-158)*0.5-52;
			System.out.print("您的標準體重："+c);
		}
	}
}
