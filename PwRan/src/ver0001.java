import java.util.Scanner;
import java.util.Random;
public class ver0001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
//		int n = scn.nextInt();
		int n = 4;
		char [] data = new char[n];
		for(int i=0;i<n;i++){
			int rnd = ran.nextInt(2);
			if(rnd == 0){
				int c = ran.nextInt(26)+65;
				data[i] = (char)c;
			}else{
				int c = ran.nextInt(26)+97;
				data[i] = (char)c;
			}
			System.out.print(data[i]);
		}
	}

}
