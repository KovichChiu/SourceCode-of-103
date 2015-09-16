import java.util.Scanner;
public class CW001 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請先輸入賣家資訊。");
		Seller seller = new Seller(scn.next());
		Item [] item = new Item [4];
		for(int i=0;i<4;i++){
			System.out.println("請先第"+(i+1)+"個輸入商品名稱 欲購買數量。");	
			item[i] = new Item(scn.next(),scn.nextInt());
		}
		System.out.println("===================發票===================");
		seller.Show();
		System.out.println("商品名稱"+"\t"+"單價"+"\t"+"購買數量"+"\t"+"小記");
		for(int i=0;i<4;i++){
			item[i].Show();
		}
		float sum=0;
		for(int i=0;i<4;i++){
			sum+=item[i].getsubtotal();
		}
		System.out.print("總金額  $ "+sum);
	}
}
class Seller{
	Scanner scn = new Scanner(System.in);
	String Seller,SellerAdd,SellerAddArea,SellerAddCity,SellerAddNumber;
	public Seller(String SellerName){
		Seller = SellerName;
		setSellerAdd();
	}
	public void setSellerAdd(){
		System.out.println("請輸入賣家住址(依照住址、地區、城市、郵遞區號輸入)");
		SellerAdd = scn.next();
		SellerAddArea = scn.next();
		SellerAddCity = scn.next();
		SellerAddNumber = scn.next();
	}
	public void Show(){
		System.out.println("賣家:"+Seller+"\n"
						 +SellerAdd+"\n"
						 +SellerAddArea+",  "
						 +SellerAddCity+",  "
						 +SellerAddNumber);
	}
}
class Item{
	Scanner scn = new Scanner(System.in);
	String ItemName;
	float ItemPrice,ItemNumber,subtotal;
	public Item(String IName,int INumber){
		ItemName = IName;
		ItemNumber = INumber;
		setPrice();
	}
	public void setPrice(){
		System.out.println("請輸入該商品單價。");
		ItemPrice = scn.nextFloat();
		setsubtotal();
	}
	public void setsubtotal(){
		subtotal = (float)ItemPrice*(float)ItemNumber;
	}
	public float getsubtotal(){
		return subtotal;
	}
	public void Show(){
		System.out.println(ItemName+"\t"+ItemPrice+"\t"+ItemNumber+"\t"+getsubtotal());
	}
}