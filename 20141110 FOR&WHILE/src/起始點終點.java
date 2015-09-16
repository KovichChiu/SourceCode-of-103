import java.util.Scanner;
public class 起始點終點 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個起始數字以及一個終點數字。");
		System.out.print("請輸入起始數字：");
		int s = scn.nextInt();
		System.out.print("請輸入終點數字：");
		int f = scn.nextInt();
		int num = 0;
		if(f<s){
			for(int i = s;i>=f;i--){
				num+=i;
			}
			System.out.print("累加答案為："+num);
		}
		else if(f>s){
			for(int i = s;i<=f;i++){
				num+=i;
			}
			System.out.print("累加答案為："+num);
		}
	}

}
