import java.util.Scanner;
public class HW_003 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�զr��A�ڱN�P�_�O�_���j��G");
		String str = scn.next();
		String str1 = new StringBuffer(str).reverse().toString();
		System.out.println("\t"+"\t"+"\t"+"      "+"��");
		System.out.println("\t"+"\t"+"\t"+str1);
		if(str.equals(str1)){
			System.out.print("�o�O�j��I");
		}else{
			System.out.print("�o���O�j��I");
		}
	}
}