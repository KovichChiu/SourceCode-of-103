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
		System.out.print("�п�J�@�ӥ|��ơG");
		int num=scn.nextInt();
		String v=Integer.toString(num);
		char [] v1=v.toCharArray();
		if(num/1000==0){
			System.out.print("��J���~�I");
		}else{
			for(int i=0;i<4;i++){
				if(g2[i]==v1[i]){
					a++;
				}
			}
		}
		switch(a){
			case 0:
				System.out.print("�����q���o~");
				break;
			case 1:
				System.out.print("�u�q��1�Ӧr��!");
				break;
			case 2:
				System.out.print("��!�q��2�ӤF!");
				break;
			case 3:
				System.out.print("�ٮt�@�I�I�A�q��3�Ӧr�o!");
				break;
			case 4:
				System.out.print("�����q���o~");
				break;
		}
	}

}
