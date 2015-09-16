public class test0004 {
	public static void main(String[] args) {
		System.out.println("原數\t平方\t立方");
		for(int i=1;i<=10;i++){
			double a=Math.pow(i, 2);
			double b=Math.pow(i, 3);
			System.out.println(i+"\t"+(int)a+"\t"+(int)b);
		}
	}
}
