import java.util.*;
public class hw05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("imput1:");
		int a = scn.nextInt();
		System.out.print("imput2:");
		int b =scn.nextInt();
		System.out.print("最小公倍數=:"+min(a,b));
	}
	public static int max(int a,int b){
		if(b==0){  //a=5 b=0
			return a;
		}else{
			return max(b,a%b);//5,0
		}
	}
	public static int min(int a,int b){
		return	(a*b)/max(a,b);
	}
}
a b c      ( a b )=x      x c   