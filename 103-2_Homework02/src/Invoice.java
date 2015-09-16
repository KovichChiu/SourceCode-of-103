import java.util.ArrayList;
import java.util.Scanner;

class Invoice{
	Scanner scn = new Scanner(System.in);
	ArrayList<Item>item = new ArrayList<Item>();
	String StoreName,StoreAdd,StoreTEL,StoreFAX;
	public Invoice(String name,String add){
		StoreName = name;
		StoreAdd = add;
		setStoreTEL();
		setStoreFAX();
		setItem();
	}
	public void ShowStoreInfo(){
		System.out.println("店名："+StoreName+"\n"+
						   "店址："+StoreAdd+"\n"+
				           "TEL："+StoreTEL+"\n"+
						   "FAX："+StoreFAX+"\n");
		float sum = 0;
		System.out.println("商品名稱\t購買數量\t商品單價\t小記");
		for(int i=0;i<item.size();i++){
			item.get(i).ShowItemInfo();
			sum+=item.get(i).ItemTotal;
		}
		System.out.println("總金額："+sum);
	}
	public void setStoreTEL(){
		StoreTEL = "";
		System.out.println("請輸入電話號碼。");
		StoreTEL = scn.next();
		if(StoreTEL.matches("[0-9]{2}-[0-9]{8}") || StoreTEL.matches("[0-9]{4}-[0-9]{6}")){
		}else{
			System.out.println("輸入錯誤，請重新輸入。");
			setStoreTEL();
		}
	}
	public void setStoreFAX(){
		StoreFAX = "";
		System.out.println("請輸入傳真號碼。");
		StoreFAX = scn.next();
		if(StoreFAX.matches("[0-9]{2}-[0-9]{8}")){
		}else{
			System.out.println("輸入錯誤，請重新輸入。");
			setStoreFAX();
		}
	}
	public void setItem(){
		System.out.println("請輸入商品名稱、購買數量、單價。");
		Item i = new Item(scn.next(),scn.nextInt(),scn.nextFloat());
		item.add(i);
		System.out.println("是否還有其他商品要購買?(Y/N)");
		String str = scn.next();
		if(str.equals("Y") || str.equals("y")){setItem();}
	}
	public void DeleteInvoice(){
		
	}
}