import java.util.Scanner;
public class Class_024 {

	/*
	 * 24. 讓使用者輸入三角形的三邊長a, b, c(a<=b<=c)，判斷並輸出a, b, c是否為合法三邊長。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形三邊長：");
		System.out.print("第一邊：");
		double a = scn.nextDouble();
		System.out.print("第二邊：");
		double b = scn.nextDouble();
		System.out.print("第三邊：");
		double c = scn.nextDouble();
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.print("這是三角形！");
		}else{
			System.out.print("這不是三角形：");
		}
	}
}
