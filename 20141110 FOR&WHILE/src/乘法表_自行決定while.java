import java.util.Scanner;
public class ���k��_�ۦ�M�wwhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Q���ơG");
		int a = scn.nextInt();
		System.out.print("�п�J���ơG");
		int b = scn.nextInt();
		System.out.print("\t");
		int i =1;
		while(i<=a){
			System.out.print(i+"\t");
			i++;
		}		
		System.out.println();
		i=1;
		while(i<=a){
			System.out.print("=========");
			i++;
		}
		System.out.println();
		i=1;
		while(i<=b){
			System.out.print(i+"||"+"\t");
			int j = 1;
			while(j<=a){
				System.out.print(i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
