import java.util.*;
public class test {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		ArrayList<Invoice>Store;
		Store = new ArrayList<Invoice>();
		while(true){
			System.out.println("請輸入店名、電話、地址、傳真。");
			Invoice Inv1 = new Invoice(scn.next(),scn.next(),scn.next(),scn.next());
			Store.add(Inv1);
			System.out.print("是否還有其他發票要開立?(Y/N)");
			String str = scn.next();
			if(str.equals("n") || str.equals("N")){break;}
		}
		float [] data = new float [Store.size()];
		for(int i=0;i<Store.size();i++){
			System.out.println("\n這是第 < "+(i+1)+" > 張發票");
			Store.get(i).ShowStore();
			System.out.println("商品名稱\t商品單價\t購買數量\t小記");
			for(int j=0;j<Store.get(i).Item.size();j++){
				Store.get(i).Item.get(j).Show();
				data[i]+=Store.get(i).Item.get(j).getSubtotal();
			}
			System.out.println("總金額："+data[i]+"\n");
		}
	}
}