import java.util.Scanner;
public class HW04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӼƭȡG");
		int num = scn.nextInt();
		System.out.print(num+"�H�U����Ʀp�U�C\n\n");
		for(int i=2;i<=num;i++){
			boolean jujge = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					jujge=false;
				}
			}
			if(jujge){
				System.out.println(i);
			}
		}
	}
}
