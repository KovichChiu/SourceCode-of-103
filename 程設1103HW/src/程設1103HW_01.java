import java.util.Random;
public class �{�]1103HW_01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [] a = new int [1];
		a[0]=ran.nextInt(1000)+1;
		System.out.println("�üƨ��X�����I�B��"+a[0]+"���A�åB�H1000����I�C");
		int m = 1000-a[0];
		int fhd,ohd,fd,td,od;
		fhd=m/500;
		ohd=(m-(500*fhd))/100;
		fd=(m-(500*fhd)-(100*ohd))/50;
		td=(m-(500*fhd)-(100*ohd)-(50*fd))/10;
		od=(m-(500*fhd)-(100*ohd)-(50*fd)-(10*td))/1;
		System.out.print("�`�@�ӧ䪺���B���G"+"\n"+"500��  "+fhd+"�i"+"\n"+"100��  "+ohd+"�i"+"\n"+" 50��  "+fd+"��"+"\n"+" 10��  "+td+"��"+"\n"+"  1��  "+od+"�ӡC");
	}
}
