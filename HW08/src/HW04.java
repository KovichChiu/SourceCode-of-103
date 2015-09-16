import java.util.Scanner;
public class HW04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形的三邊長。");
		System.out.print("請輸入三角形的第一邊：");
		int a = scn.nextInt();
		System.out.print("請輸入三角形的第二邊：");
		int b = scn.nextInt();
		System.out.print("請輸入三角形的第三邊：");
		int c = scn.nextInt();
		double a2=Math.pow(a,2);
		double b2=Math.pow(b,2);
		double c2=Math.pow(c,2);
		if(a<(b+c)&&b<(a+c)&&c<(a+b)){
			if(a2==(b2+c2)||b2==(a2+c2)||c2==(a2+b2)){
				System.out.print("這是直角三角形。");
			}
			else if(a2>(b2+c2)||b2>(a2+c2)||c2>(a2+b2)){
				System.out.print("這是鈍角三角形。");
			}else{
				System.out.print("這是銳角三角形。");
			}
		}else{
			System.out.print("不合法的三角形。");
		}
	}

}
