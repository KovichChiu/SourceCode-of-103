import java.util.Scanner;
import java.util.Random;
public class HW03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int all=12;
		System.out.print("�аݷQ�����٬O���(1.����        2.���)�G");
		int take = scn.nextInt();
		while(true){
			if(take==1){
				System.out.println("�ثe���㪺�ƥءG"+all);
				System.out.print("�ФJ�Q����������ƥ�(1~3)�G");
				int Pt = scn.nextInt();
				while(Pt<1||Pt>3){
					System.out.println("��J���~�A�Э��s��J�C");
					System.out.print("�ФJ�Q����������ƥ�(1~3)�G");
					Pt = scn.nextInt();
				}
				int Ct = ran.nextInt(3)+1;
				all=all-Pt;
				if(all<=0){
					System.out.println("�Ѿl������ƥءG0"+"\n"+"���a�ѡI");
					break;
				}else{
					System.out.println("�Ѿl������ƥءG"+all+"\n"+"�~��C���I\n");
				}
				System.out.println("�q���������ơG"+Ct);
				all=all-Ct;
				if(all<=0){
					System.out.println("�Ѿl������ƥءG0"+"\n"+"�q���ѡI");
					break;
				}else{
					System.out.println("�Ѿl������ƥءG"+all+"\n"+"�~��C���I\n");
				}
			}
			if(take==2){
				System.out.println("�ثe���㪺�ƥ�"+all);
				int Ct = ran.nextInt(3)+1;
				System.out.println("�q���������ơG"+Ct);
				all=all-Ct;
				if(all<=0){
					System.out.println("�Ѿl������ƥءG0"+"\n"+"�q���ѡI");
					break;
				}else{
					System.out.println("�Ѿl������ƥءG"+all+"\n"+"�~��C���I\n");
				}
				System.out.print("�ФJ�Q����������ƥ�(1~3)�G");
				int Pt = scn.nextInt();
				while(Pt<1||Pt>3){
					System.out.println("��J���~�A�Э��s��J�C");
					System.out.print("�ФJ�Q����������ƥ�(1~3)�G");
					Pt = scn.nextInt();
				}
				all=all-Pt;
				if(all<=0){
					System.out.println("�Ѿl������ƥءG0"+"\n"+"���a�ѡI");
					break;
				}else{
					System.out.println("�Ѿl������ƥءG"+all+"\n"+"�~��C���I\n");
				}
			}
			if(take<1||take>2){
				System.out.println("��J���~�A�Э��s��J�C");
				System.out.print("�аݷQ�����٬O���(1.����        2.���)�G");
				take = scn.nextInt();
			}
		}
	}
}
