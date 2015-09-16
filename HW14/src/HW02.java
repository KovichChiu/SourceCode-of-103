import java.util.Scanner;
import java.util.Random;
public class HW02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("請輸入陣列長度：");
		int num = scn.nextInt();
		int [] data = new int [num];
		System.out.print("亂數陣列如下。\n");
		for(int i=0;i<num;i++){
			data[i] = ran.nextInt(10)+1;
			System.out.print(data[i]+" ");
		}
		int ssum=0,fsum=0,s=0;
		for(int i=0;i<num;i++){
			ssum=ssum+data[i];
			fsum=0;
			for(int j=num-1;j>=0;j--){
				fsum=fsum+data[j];
				if(ssum==fsum){
					s++;
					System.out.print("\n以下為第"+s+"個前後段和相同。\n前段和：");
					for(int a=0;a<i;a++){
						System.out.print(data[a]+"+");
					}
					System.out.print(data[i]+"="+ssum+"\n後段和：");
					for(int b=num-1;b>j;b--){
						System.out.print(data[b]+"+");
					}
					System.out.println(data[j]+"="+fsum);
				}
			}
		}
	}
}