import java.util.Scanner;
public class CW001 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�Х���J��a��T�C");
		Seller seller = new Seller(scn.next());
		Item [] item = new Item [4];
		for(int i=0;i<4;i++){
			System.out.println("�Х���"+(i+1)+"�ӿ�J�ӫ~�W�� ���ʶR�ƶq�C");	
			item[i] = new Item(scn.next(),scn.nextInt());
		}
		System.out.println("===================�o��===================");
		seller.Show();
		System.out.println("�ӫ~�W��"+"\t"+"���"+"\t"+"�ʶR�ƶq"+"\t"+"�p�O");
		for(int i=0;i<4;i++){
			item[i].Show();
		}
		float sum=0;
		for(int i=0;i<4;i++){
			sum+=item[i].getsubtotal();
		}
		System.out.print("�`���B  $ "+sum);
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
		System.out.println("�п�J��a��}(�̷Ӧ�}�B�a�ϡB�����B�l���ϸ���J)");
		SellerAdd = scn.next();
		SellerAddArea = scn.next();
		SellerAddCity = scn.next();
		SellerAddNumber = scn.next();
	}
	public void Show(){
		System.out.println("��a:"+Seller+"\n"
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
		System.out.println("�п�J�Ӱӫ~����C");
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