import java.util.Scanner;
public class ddd123 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ���ơG");
		int num = scn.nextInt();
		System.out.println("�H�U����ơC"+"\n");
		for(int i=2;i<=num;i++){
			int a=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					a++;
				}
			}
			if(a==0){
				System.out.print(i+" ");
			}
		}
	}
}