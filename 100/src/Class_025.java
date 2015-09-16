import java.util.Scanner;
public class Class_025 {

	/*
	 * 25. 讓使用者輸入一合法三角形的三邊長a, b, c(a<=b<=c)，
    	判斷並輸出該三角形為「直角Δ」，「鈍角Δ」，或「銳角Δ」。
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形三邊長：");
		System.out.print("第一邊：");
		double a = scn.nextDouble();
		System.out.print("第二邊：");
		double b = scn.nextDouble();
		System.out.print("第三邊：");
		double c = scn.nextDouble();
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double c2 = Math.pow(c, 2);
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.println("這是三角形！");
		}else{
			System.out.println("這不是三角形：");
		}
		if(a2<b2+c2||b2<a2+c2||c2<a2+b2){
			System.out.print("這是銳角三角形！");
		}
		else if(a2==b2+c2||b2==a2+c2||c2==a2+b2){
			System.out.print("這是直角三角形！");
		}
		else if (a2>b2+c2||b2>a2+c2||c2>a2+b2){
			System.out.print("這是直角三角形！");
		}
	}
}
