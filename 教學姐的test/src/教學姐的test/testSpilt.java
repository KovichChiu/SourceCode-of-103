package �оǩj��test;
//			20150531 �оǥ�
public class testSpilt {

	public static void main(String[] args) {
		/*
		 * �S��r���e���[�W "\\" �~�|�����T���G�C
		 * ���@���(2�ӥH�W)���ťծɡA��" +"�¥i�H�����F(�pcase5)�C
		 * "|" �O�Ψӹj�}���C
		 * �S��r�ť[�F"\\"����|���ͪť�
		 */
		
		String case1 = "1,2,3,4";
		String case2 = "a b c d";
		String case3 = "1.2.3.4";
		String case4 = "a/b/c/d";
		String case5 = "a b   c d";
		
		String[] datacase1 = case1.split(",");
		String[] datacase2 = case2.split(" ");
		String[] datacase3 = case2.split("\\.");
		String[] datacase4 = case4.split("/");
		String[] datacase5 = case5.split(" +");
		
		System.out.println("case1:");
		for (String s : datacase1) {
			System.out.print(s);
		}
		
		System.out.println("\n\ncase2");
		for (String s : datacase2) {
			System.out.print(s);
		}
		
		System.out.println("\n\ncase3");
		for (String s : datacase3) {
			System.out.print(s);
		}
		
		System.out.println("\n\ncase4");
		for (String s : datacase4) {
			System.out.print(s);
		}
		
		System.out.println("\n\ncase5");
		for (String s : datacase5) {
			System.out.print(s);
		}
	}
}
