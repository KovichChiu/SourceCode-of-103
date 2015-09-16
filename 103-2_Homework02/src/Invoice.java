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
		System.out.println("���W�G"+StoreName+"\n"+
						   "���}�G"+StoreAdd+"\n"+
				           "TEL�G"+StoreTEL+"\n"+
						   "FAX�G"+StoreFAX+"\n");
		float sum = 0;
		System.out.println("�ӫ~�W��\t�ʶR�ƶq\t�ӫ~���\t�p�O");
		for(int i=0;i<item.size();i++){
			item.get(i).ShowItemInfo();
			sum+=item.get(i).ItemTotal;
		}
		System.out.println("�`���B�G"+sum);
	}
	public void setStoreTEL(){
		StoreTEL = "";
		System.out.println("�п�J�q�ܸ��X�C");
		StoreTEL = scn.next();
		if(StoreTEL.matches("[0-9]{2}-[0-9]{8}") || StoreTEL.matches("[0-9]{4}-[0-9]{6}")){
		}else{
			System.out.println("��J���~�A�Э��s��J�C");
			setStoreTEL();
		}
	}
	public void setStoreFAX(){
		StoreFAX = "";
		System.out.println("�п�J�ǯu���X�C");
		StoreFAX = scn.next();
		if(StoreFAX.matches("[0-9]{2}-[0-9]{8}")){
		}else{
			System.out.println("��J���~�A�Э��s��J�C");
			setStoreFAX();
		}
	}
	public void setItem(){
		System.out.println("�п�J�ӫ~�W�١B�ʶR�ƶq�B����C");
		Item i = new Item(scn.next(),scn.nextInt(),scn.nextFloat());
		item.add(i);
		System.out.println("�O�_�٦���L�ӫ~�n�ʶR?(Y/N)");
		String str = scn.next();
		if(str.equals("Y") || str.equals("y")){setItem();}
	}
	public void DeleteInvoice(){
		
	}
}