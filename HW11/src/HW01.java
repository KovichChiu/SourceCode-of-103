import java.util.Scanner;
import java.util.Random;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("�п�J�}�C���סG");
		int num = scn.nextInt();
		int [] data = new int [num];
		System.out.println("�üƨ��X���Ȧp�U�C");
		for(int i=0;i<num;i++){
			data[i]=ran.nextInt(9)+1;
			System.out.print(data[i]+" ");
		}
		System.out.print("\n�����ƦC��p�U�C\n");
		int j=0;
		for(int i=0;i<num;i++){
			int tmp = data[i];
			for(j=i-1;j>=0;j--){
				if(tmp>=data[j]){
					data[j+1] = data[j];
				}else break;
			}
			data[j+1]=tmp;
		}
		for(int i=0;i<num;i++){
			System.out.print(data[i]+" ");
		}
	}
}
