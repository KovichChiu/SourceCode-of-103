package �оǩj��test;
import java.util.Random;
public class aaaa {
	static int [] a;
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
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
