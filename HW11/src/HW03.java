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
		System.out.print("�п�J�}�C���סG");
		int num = scn.nextInt();
		int [] data = new int [num];
		System.out.println("�Ƨǫe�p�U�C");
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
