import java.util.Scanner;
public class Class_002 {

	/*
	 * 2.輸入一個字串, 並把它反向輸出
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		System.out.print("輸入一個字串, 我會把它反向輸出：");
		String a = scn.next();
		char [] b = a.toCharArray();
		int c = a.length();
		for(int i = c-1;i>=0;i--){
			System.out.print(b[i]);
		}
	}

}
