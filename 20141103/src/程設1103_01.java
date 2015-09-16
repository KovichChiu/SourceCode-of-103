import java.util.Scanner;
public class 程設1103_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入您要反向輸出的一串文字：");
		String str = scn.next();
		char [] data = str.toCharArray();
		int len = data.length;
		System.out.print("所得字串為：");
		for(int i =len-1;i>=0;i--){
			System.out.print(data[i]);
		}
	}

}
