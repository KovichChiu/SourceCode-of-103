import java.util.Scanner;
public class Class_016 {

	/*
	 16. ��J�@�����, �P�_��_��.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӼơA�ڱN�P�_�L�O�_���٬O���ơG");
		int num = scn.nextInt();
		if(num==0){
			System.out.print("0�����_�Ʃΰ��ơI");
		}
		else if(num%2==0){
			System.out.print("�o�O���ơI");
		}
		else if(num%2!=0){
			System.out.print("�o�O�_�ơI");
		}
	}

}
