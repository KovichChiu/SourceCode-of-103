import java.util.Scanner;
public class HW04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�мg�X�@�궰�X�G");
		String str = scn.nextLine();
		System.out.println(str+"���l���X���浲�G�p�U�C");
		System.out.println("{}");
		P("",str);
	}
	private static void P(String str1,String str2){
		char [] data = str2.toCharArray();
		int len = str2.length();
		String str3 ="";
		String str4 ="";
		for(int j=0;j<len;j++){
			str3 = str1+String.valueOf(data[j]);
			System.out.println("{"+str3+"}");
			if(j==len-1){
				break;
			}
			str4=str2;
			for(int k=0;k<=j;k++){
				str4 = new StringBuffer(str4).deleteCharAt(0).toString();
			}
			P(str3,str4);
		}
	}
}