public class �{�]1103HW_07 {
	public static void main(String[] args) {
		System.out.println("�b�U����ܤE�E���k��G");
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