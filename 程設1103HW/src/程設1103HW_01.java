import java.util.Random;
public class 程設1103HW_01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [] a = new int [1];
		a[0]=ran.nextInt(1000)+1;
		System.out.println("亂數取出的應付額為"+a[0]+"元，並且以1000元支付。");
		int m = 1000-a[0];
		int fhd,ohd,fd,td,od;
		fhd=m/500;
		ohd=(m-(500*fhd))/100;
		fd=(m-(500*fhd)-(100*ohd))/50;
		td=(m-(500*fhd)-(100*ohd)-(50*fd))/10;
		od=(m-(500*fhd)-(100*ohd)-(50*fd)-(10*td))/1;
		System.out.print("總共該找的金額為："+"\n"+"500元  "+fhd+"張"+"\n"+"100元  "+ohd+"張"+"\n"+" 50元  "+fd+"個"+"\n"+" 10元  "+td+"個"+"\n"+"  1元  "+od+"個。");
	}
}
