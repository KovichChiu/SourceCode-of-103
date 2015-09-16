import java.util.*;

public class eee {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("input1");
		int a = scn.nextInt();
		System.out.print("input");
		int b = scn.nextInt();
		System.out.print("最大公因數" + min(a, b));
	}

	public static int min(int a, int b) {
		if (a % b != 0) {
			return min(b, a % b);
		} else {
			return b;
		}
	}
}