import java.util.*;
public class test {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		ArrayList<Invoice>Store;
		Store = new ArrayList<Invoice>();
		while(true){
			System.out.println("�п�J���W�B�q�ܡB�a�}�B�ǯu�C");
			Invoice Inv1 = new Invoice(scn.next(),scn.next(),scn.next(),scn.next());
			Store.add(Inv1);
			System.out.print("�O�_�٦���L�o���n�}��?(Y/N)");
			String str = scn.next();
			if(str.equals("n") || str.equals("N")){break;}
		}
		float [] data = new float [Store.size()];
		for(int i=0;i<Store.size();i++){
			System.out.println("\n�o�O�� < "+(i+1)+" > �i�o��");
			Store.get(i).ShowStore();
			System.out.println("�ӫ~�W��\t�ӫ~���\t�ʶR�ƶq\t�p�O");
			for(int j=0;j<Store.get(i).Item.size();j++){
				Store.get(i).Item.get(j).Show();
				data[i]+=Store.get(i).Item.get(j).getSubtotal();
			}
			System.out.println("�`���B�G"+data[i]+"\n");
		}
	}
}