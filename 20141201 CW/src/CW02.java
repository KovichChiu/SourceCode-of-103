import java.util.Scanner;
public class CW02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個英文字元：");
		String str = scn.next();
		char a1 = str.charAt(0);
		int v1 = (int)a1;
		if(v1>=65 && v1<=90){
			v1=v1+32;
			System.out.println("這是小寫："+(char)v1);
		}
		else if(v1>=97 && v1<=102){
			v1=v1-32;
			System.out.println("這是大寫："+(char)v1);
		}else{
			System.out.println("這不是英文！");
		}
	}

}
