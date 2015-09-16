import java.util.*;
public class X150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double N = 0.0;
		int A = scn.nextInt();
		N = (double)A/(1.5);
		A=(int)N;
		if(N>A){
			System.out.print(A+1);
		}else{
			System.out.print(A);
		}
	}

}
