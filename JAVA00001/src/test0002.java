import java.util.Random;
import java.util.Scanner;
public class test0002 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		int g=ran.nextInt(100)+1;
		
		while(true){
			System.out.print("�вq�@�ӭ�:");
			int v1=scn.nextInt();
			if(g==v1){
				System.out.println("���߱z�q��F�I");
				break;
			}else{
				if(g>v1){
					System.out.println("�z�q���ƤӤp�o~");
				}else{
					System.out.println("�z�q���ƤӤj�o~");
				}
			}
		}
	}
}
