import java.util.*;
public class new_�o�� {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Invoice>invoice = new ArrayList<Invoice>();
		while(true){
			System.out.println("�п�J��a���W�B���a�a�}�C");
			Invoice inv = new Invoice(scn.next(),scn.next());
			invoice.add(inv);
			System.out.println("�O�_�٦��o���n�}��?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){break;}
		}
		System.out.println("�H�U���z�}�ߪ��Ҧ��o��");
		System.out.println("============================\n");
		for(int i=0;i<invoice.size();i++){
			System.out.println("=========�o�O��"+(i+1)+"�i�o��=========");
			invoice.get(i).ShowStoreInfo();
		}
		System.out.println("============================\n");
		while(true){
			System.out.println("�O�_�d�ߩΧR���o��?(Y/N)");
			String str1 = scn.next();
			if(str1.equals("Y") || str1.equals("y")){
				System.out.println("�аݬO�n�R���٬O�d�ߩO?(1--�R��/2--�d��)");
				int str2 = scn.nextInt();
				if(str2==1){
					System.out.println("�аݧR�����@�i�o��?");
					int str3 = scn.nextInt();
					invoice.remove(str3-1);
				}else{
					System.out.println("�аݬd�߭��@�i�o��?");
					int str4 = scn.nextInt();
					invoice.get(str4-1).ShowStoreInfo();
					while(true){
						System.out.println("�аݧR�����@���ӫ~?");
						int str5 = scn.nextInt();
						invoice.get(str4-1).item.remove(str5-1);
						System.out.println("�O�_�٦���L�ӫ~�n�R��?(Y/N)");
						String str6 = scn.next();
						if(str6.equals("N") || str6.equals("n")){break;}
					}
				}
			}else{break;}
			System.out.println("�H�U���z�}�ߪ��Ҧ��o��");
			System.out.println("============================");
			for(int i=0;i<invoice.size();i++){
				System.out.println("=========�o�O��"+(i+1)+"�i�o��=========");
				invoice.get(i).ShowStoreInfo();
			}
			System.out.println("============================\n");
		}
		System.out.println("�H�U���z�̫�}�ߪ��Ҧ��o��");
		System.out.println("============================");
		for(int i=0;i<invoice.size();i++){
			System.out.println("=========�o�O��"+(i+1)+"�i�o��=========");
			invoice.get(i).ShowStoreInfo();
		}
		System.out.println("============================\n");
	}
}