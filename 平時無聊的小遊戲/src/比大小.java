import java.util.Random;
import java.util.Scanner;
public class ��j�p {
	public static void main(String[] args) {
			Random ran = new Random();
			Scanner scn = new Scanner(System.in);
			System.out.println("�o�O�@�Ӥp�C���w�w��j�p");
			System.out.println("�C���W�h�G�q���|�ѶóB���ͤ@��axb�A���a�]�|���o�@�ӥѶüƲ��ͪ��@��axb�A��q���j��Ĺ�C"+"\n");
			while(true){
				int [] a = new int [5];
				int [] b = new int[14];
				int c = ran.nextInt(4)+1;
				int d = ran.nextInt(13)+1;
				for(int i=1;i<5;i++){
					a[i]=ran.nextInt(5)+1;
				}
				for(int i=1;i<14;i++){
					b[i]=ran.nextInt(20)+1;
				}
				int e=a[c]*b[d];
				System.out.print("�аݦ��X��ϥΪ�?");
				int member = scn.nextInt();
				for(int i=1;i<=member;i++){
					System.out.print("�z�O��         "+i+"\t"+"���a�A�o�O�z��쪺�Ʀr�G");
					c=ran.nextInt(4)+1;
					d=ran.nextInt(13)+1;
					for(int j=1;j<5;j++){
						a[j]=ran.nextInt(5)+1;
					}
					for(int k=1;k<14;k++){
						b[k]=ran.nextInt(20)+1;
					}
					int z = a[c]*b[d];
					System.out.print(" "+z);
					if(z>e){
						System.out.println("\t"+"���ߧA�IĹ�o�F�o�������ɡC");					
					}else{
						System.out.println("\t"+"�ܩ�p�I�z�o�쪺�Ʀr�èS������j...");
					}
				}
				System.out.print("�а��٭n�A��@����?(Y/N)");
				String r = scn.next();
				if(r.equals("N")){
					break;
				}
			}
	}
}

