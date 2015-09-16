import java.util.Scanner;
import java.util.Random;
public class 終極密碼 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("這是一個小遊戲   ─ 終極密碼");
		while(true){
			System.out.print("請輸入最小值：");
			int min = scn.nextInt();
			System.out.print("請輸入最大值：");
			int max = scn.nextInt();
			int r = ran.nextInt(max-min+1)+min;
			while(true){
				System.out.println("\n"+min+" ~ "+max+"\n");
				System.out.print("請猜一個在範圍中的值：");
				int g = scn.nextInt();
				if(g==r){
					System.out.println("唉呀！被你猜到了！");
					break;
				}
				else if(g>max||g<min){
					System.out.println("輸入錯誤囉~請重新輸入喔!");
				}
				else if(g>min&&g<r){
				min=g;
				}
				else if(g<max&&g>r){
				max = g;
				}
			}
			System.out.print("請問還要繼續嗎?(Y/N)");
			String x = scn.next();
			if(x.equals("N")||x.equals("n")){
				break;
			}
		}
		System.out.print("謝謝您的使用！");
	}
}
