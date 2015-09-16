package 教學姐的test;
//			20150531 教學用
public class testSpilt {

	public static void main(String[] args) {
		/*
		 * 特殊字元前面加上 "\\" 才會有正確結果。
		 * 當有一整串(2個以上)的空白時，用" +"舊可以拿掉了(如case5)。
		 * "|" 是用來隔開的。
		 * 特殊字符加了"\\"之後會產生空白
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
