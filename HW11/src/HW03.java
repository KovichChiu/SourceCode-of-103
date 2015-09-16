import java.util.Random;
import java.util.Scanner;
public class HW03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列長度：");
		int num = scn.nextInt();
		int [] data = new int [num];
		System.out.println("排序前如下。");
		for(int i=0;i<data.length;i++){
			data[i]=ran.nextInt(10)+1;
			System.out.print(data[i]+" ");
		}
		System.out.println();
		for(int i=0;i<data.length;i+=2){
			if(data[i]){
				
			}
		}
	}

}
