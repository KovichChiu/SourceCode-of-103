import java.util.Random;
public class �{�]1103HW_02 {
	public static void main(String[] args) {
		Random ran=new Random();
		int [] a=new int [1];
		a[0]=ran.nextInt(1000)+1;
		String str = String.valueOf(a[0]);
		char [] data = str.toCharArray();
		int len = data.length;
		if(len==4){
		System.out.print(data[0]+"�d"+"��");
		}
		if(len==3){
			System.out.print(data[0]+"��"+data[1]+"�B"+data[2]+"��");
		}
		if(len==2){
			System.out.print(data[0]+"�B"+data[1]+"��");
		}
		if(len==1){
			System.out.print(data[0]+"��");
		}
	}

}
