package 教學姐的test;
import java.util.Random;
public class aaaa {
	static int [] a;
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Random ran = new Random();
		a = new int [7];
		System.out.println("Alen="+a.length);
		c(0);
		System.out.println("Alen'="+a.length);
	}
	public static void c(int n){
		a = new int [n];
	}
}
