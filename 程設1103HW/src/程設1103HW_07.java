public class 程設1103HW_07 {
	public static void main(String[] args) {
		System.out.println("在下面顯示九九乘法表：");
		for(int i = 1;i<=9;i++){
			System.out.print("\t"+i);
		}
		System.out.println();
		System.out.println("==========================================================================");
		for(int i=1;i<=9;i++){
			System.out.print(i+" |");
			for(int j=1;j<=9;j++){
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}
	}
}