import java.util.*;
public class hw02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("imput1:");
		int a = scn.nextInt();
		System.out.print("imput2:");
		int b =scn.nextInt();
		System.out.print("imput3:");
		int c =scn.nextInt();
		System.out.print(".... = "+max(max(a,b),c));
	}
	public static int max(int a,int b){
		if(b==0){  //a=5 b=0
			return a;
		}else{
			return max(b,a%b);//5,0
		}
	}
}
