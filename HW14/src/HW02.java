import java.util.Scanner;
import java.util.Random;
public class HW02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("�п�J�}�C���סG");
		int num = scn.nextInt();
		int [] data = new int [num];
		System.out.print("�üư}�C�p�U�C\n");
		for(int i=0;i<num;i++){
			data[i] = ran.nextInt(10)+1;
			System.out.print(data[i]+" ");
		}
		int ssum=0,fsum=0,s=0;
		for(int i=0;i<num;i++){
			ssum=ssum+data[i];
			fsum=0;
			for(int j=num-1;j>=0;j--){
				fsum=fsum+data[j];
				if(ssum==fsum){
					s++;
					System.out.print("\n�H�U����"+s+"�ӫe��q�M�ۦP�C\n�e�q�M�G");
					for(int a=0;a<i;a++){
						System.out.print(data[a]+"+");
					}
					System.out.print(data[i]+"="+ssum+"\n��q�M�G");
					for(int b=num-1;b>j;b--){
						System.out.print(data[b]+"+");
					}
					System.out.println(data[j]+"="+fsum);
				}
			}
		}
	}
}