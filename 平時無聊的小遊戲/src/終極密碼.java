import java.util.Scanner;
import java.util.Random;
public class �׷��K�X {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("�o�O�@�Ӥp�C��   �w �׷��K�X");
		while(true){
			System.out.print("�п�J�̤p�ȡG");
			int min = scn.nextInt();
			System.out.print("�п�J�̤j�ȡG");
			int max = scn.nextInt();
			int r = ran.nextInt(max-min+1)+min;
			while(true){
				System.out.println("\n"+min+" ~ "+max+"\n");
				System.out.print("�вq�@�Ӧb�d�򤤪��ȡG");
				int g = scn.nextInt();
				if(g==r){
					System.out.println("���r�I�Q�A�q��F�I");
					break;
				}
				else if(g>max||g<min){
					System.out.println("��J���~�o~�Э��s��J��!");
				}
				else if(g>min&&g<r){
				min=g;
				}
				else if(g<max&&g>r){
				max = g;
				}
			}
			System.out.print("�а��٭n�~���?(Y/N)");
			String x = scn.next();
			if(x.equals("N")||x.equals("n")){
				break;
			}
		}
		System.out.print("���±z���ϥΡI");
	}
}
