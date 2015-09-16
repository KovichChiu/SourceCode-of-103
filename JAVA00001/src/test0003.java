import java.util.Random;
import java.util.Scanner;
public class test0003 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		int a=0;
		int g=ran.nextInt(9999)+1000;
		String g1=Integer.toString(g);
		char [] g2=g1.toCharArray();
		System.out.print("請輸入一個四位數：");
		int num=scn.nextInt();
		String v=Integer.toString(num);
		char [] v1=v.toCharArray();
		if(num/1000==0){
			System.out.print("輸入錯誤！");
		}else{
			for(int i=0;i<4;i++){
				if(g2[i]==v1[i]){
					a++;
				}
			}
		}
		switch(a){
			case 0:
				System.out.print("完全猜錯囉~");
				break;
			case 1:
				System.out.print("只猜對1個字喔!");
				break;
			case 2:
				System.out.print("喔!猜對2個了!");
				break;
			case 3:
				System.out.print("還差一點點，猜對3個字囉!");
				break;
			case 4:
				System.out.print("完全猜對囉~");
				break;
		}
	}

}
