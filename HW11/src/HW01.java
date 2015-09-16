import java.util.Scanner;
import java.util.Random;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("請輸入陣列長度：");
		int num = scn.nextInt();
		int [] data = new int [num];
		System.out.println("亂數取出的值如下。");
		for(int i=0;i<num;i++){
			data[i]=ran.nextInt(9)+1;
			System.out.print(data[i]+" ");
		}
		System.out.print("\n降冪排列後如下。\n");
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
