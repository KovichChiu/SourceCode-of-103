import java.util.Scanner;
public class HW_001 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String [] num = {"01272636","39412201","94586356"};
		System.out.print("�п�J�@�յo�������X�G");
		String a = scn.next();
		int [] q = {0,0,0};
		char [] data = a.toCharArray();
		char [] num1 = num[0].toCharArray();
		char [] num2 = num[1].toCharArray();
		char [] num3 = num[2].toCharArray();
		for(int i =7;i>=0;i--){
			if(num1[i]==data[i]){
				q[0]++;
			}else{
				break;
			}
		}
		for(int i =7;i>=0;i--){
			if(num2[i]==data[i]){
				q[1]++;
			}else{
				break;
			}
		}
		for(int i =7;i>=0;i--){
			if(num3[i]==data[i]){
				q[2]++;
			}else{
				break;
			}
		}
		for(int i=0;i<3;i++){
			System.out.print("��"+(i+1)+"�յo�����X���A");
			switch(q[i]){
			case 0:
				System.out.println("�S�������I");
				break;
			case 1:
				System.out.println("�S�������I");
				break;
			case 2:
				System.out.println("�S�������I!");
				break;
			case 3:
				System.out.println("���F200���I");
				break;
			case 4:
				System.out.println("���F1000���I");
				break;
			case 5:
				System.out.println("���F4000���I");
				break;
			case 6:
				System.out.println("���F10000���I");
				break;
			case 7:
				System.out.println("���F40000���I");
				break;
			case 8:
				System.out.println("���F200000���I");
				break;
			}
		}
	}
}