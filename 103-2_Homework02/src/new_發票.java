import java.util.*;
public class new_發票 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Invoice>invoice = new ArrayList<Invoice>();
		while(true){
			System.out.println("請輸入賣家店名、店家地址。");
			Invoice inv = new Invoice(scn.next(),scn.next());
			invoice.add(inv);
			System.out.println("是否還有發票要開立?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){break;}
		}
		System.out.println("以下為您開立的所有發票");
		System.out.println("============================\n");
		for(int i=0;i<invoice.size();i++){
			System.out.println("=========這是第"+(i+1)+"張發票=========");
			invoice.get(i).ShowStoreInfo();
		}
		System.out.println("============================\n");
		while(true){
			System.out.println("是否查詢或刪除發票?(Y/N)");
			String str1 = scn.next();
			if(str1.equals("Y") || str1.equals("y")){
				System.out.println("請問是要刪除還是查詢呢?(1--刪除/2--查詢)");
				int str2 = scn.nextInt();
				if(str2==1){
					System.out.println("請問刪除哪一張發票?");
					int str3 = scn.nextInt();
					invoice.remove(str3-1);
				}else{
					System.out.println("請問查詢哪一張發票?");
					int str4 = scn.nextInt();
					invoice.get(str4-1).ShowStoreInfo();
					while(true){
						System.out.println("請問刪除哪一項商品?");
						int str5 = scn.nextInt();
						invoice.get(str4-1).item.remove(str5-1);
						System.out.println("是否還有其他商品要刪除?(Y/N)");
						String str6 = scn.next();
						if(str6.equals("N") || str6.equals("n")){break;}
					}
				}
			}else{break;}
			System.out.println("以下為您開立的所有發票");
			System.out.println("============================");
			for(int i=0;i<invoice.size();i++){
				System.out.println("=========這是第"+(i+1)+"張發票=========");
				invoice.get(i).ShowStoreInfo();
			}
			System.out.println("============================\n");
		}
		System.out.println("以下為您最後開立的所有發票");
		System.out.println("============================");
		for(int i=0;i<invoice.size();i++){
			System.out.println("=========這是第"+(i+1)+"張發票=========");
			invoice.get(i).ShowStoreInfo();
		}
		System.out.println("============================\n");
	}
}