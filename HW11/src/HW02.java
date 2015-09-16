import java.util.Scanner;
import java.util.Random;
public class HW02 {
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
		sort(data,0,data.length-1);
		System.out.print("\n�ƦC��p�U�C\n");
		for(int i=0;i<num;i++){
			System.out.print(data[i]+" ");
		}
	}
	private static void sort(int[] data,int left,int right){
		if(left < right){
			int pivot = data[(left+right)/2];
			int i,j,temp;
			i = left-1;
			j = right+1;
			while(true){
				while(data[++i]<pivot);
				while(data[--j]>pivot);
				if(j<=i)break;
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
			sort(data,left,i-1);
			sort(data,j+1,right);
		}
	}
}
