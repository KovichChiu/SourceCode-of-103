import java.util.Random;
import java.util.Scanner;
public class 程設1103_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("電腦已經選好了一個數字，請在1~5中猜一個數字：");
		int n = scn.nextInt();
		int [] a = new int [1];
		a[0]=ran.nextInt(5)+1;
		if(a[0]<1||a[0]>5){
			System.out.print("遊戲結束...原因是您輸入錯誤！");
		}
		if(a[0]==n){
			System.out.print("恭喜答對了!");
		}else{
			System.out.println("再接再厲！");
			System.out.print("正確答案為："+a[0]);
		}
	}

}
