import java.util.Scanner;
import java.util.Random;
public class �q�Ʀr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("�o�O�@�Ӥp�C��   �w �q�Ʀr");
		System.out.println("�C���W�h�G�|�Ѷüƨ��X4�줣���ƪ��ơA�æb10�����ѥX���סI");
		int [] num = new int [4];
		int [] gue = new int [4];
		for(int i =0;i<4;i++){
			num[i]=ran.nextInt(9);
			for(int j=0;j<i;j++){
				if(num[i]==num[i-(j+1)]){
					i--;
				}
			}
		}
		int x=0;
		while(x<10){
			System.out.print("\n"+"�п�J4�줣���ƪ��ơG");
			int s = scn.nextInt();
			int a=0,b=0,c,d,e,f;
			c=s/1000;
			d=(s-(c*1000))/100;
			e=(s-(c*1000)-(d*100))/10;
			f=(s-(c*1000)-(d*100)-(e*10));
			gue[0]=c;
			gue[1]=d;
			gue[2]=e;
			gue[3]=f;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(gue[i]==num[j]){
						b++;
						if(gue[i]==num[i]){
							b--;
							a++;
						}
					}
				}
			}
			System.out.print("���G��= "+a+" A "+b+" B ");
			if(a==4){
				System.out.print("\n"+"�z����F�I�а��٭n�~�򪱶�?(Y/N)");
				String z = scn.next();
				if(z.equals("N")){
					break;
				}
			}
			x++;
		}
		System.out.println("\n"+"���n�N��...�z��F�C");
		System.out.print("���T�ѵ����G");
		for(int i=0;i<4;i++){
			System.out.print(num[i]);
		}
		System.out.print("�Э��s�}�l�C���C");
	}
}