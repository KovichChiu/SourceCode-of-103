import java.util.Scanner;
public class CW05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個數：");
		int v1 = scn.nextInt();
		System.out.print("請輸入第二個數：");
		int v2 = scn.nextInt();
		double sum =C(v1)/(C(v1-v2)*C(v2));
		System.out.println("答案="+sum);
	}
	private static int C(int s1){
		if(s1==1){
			return 1;
		}else{
			return s1*C(s1-1);
		}
	}

}
