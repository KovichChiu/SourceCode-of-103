import java.util.Random;
import java.util.Scanner;
public class test0002 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		int g=ran.nextInt(100)+1;
		
		while(true){
			System.out.print("請猜一個值:");
			int v1=scn.nextInt();
			if(g==v1){
				System.out.println("恭喜您猜對了！");
				break;
			}else{
				if(g>v1){
					System.out.println("您猜的數太小囉~");
				}else{
					System.out.println("您猜的數太大囉~");
				}
			}
		}
	}
}
