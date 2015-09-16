import java.util.Scanner;
public class 基本加法 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入最大值：");
		int v1 = scn.nextInt();
		System.out.println("總合="+add(v1));
	}
	public static int add(int a){
		if(a==1){
			return 1;
		}else{
			return a+add(a-1);
		}
	}
}
