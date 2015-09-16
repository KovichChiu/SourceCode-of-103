import java.util.Scanner;
public class Class_016 {

	/*
	 16. 块タ俱计, 耞ㄤ案.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("叫块计и盢耞琌计临琌案计");
		int num = scn.nextInt();
		if(num==0){
			System.out.print("0ぃ计┪案计");
		}
		else if(num%2==0){
			System.out.print("硂琌案计");
		}
		else if(num%2!=0){
			System.out.print("硂琌计");
		}
	}

}
