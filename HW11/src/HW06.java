import java.util.Scanner;
public class HW06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個包含空白的字串：");
		String str = scn.nextLine();
		String [] data = str.split(" ");
		int len = data.length;
		for(int i=0;i<len;i++){
			System.out.print(data[i]);
		}
	}
}
