import java.util.ArrayList;
import java.util.Scanner;
class Invoice{
	Scanner scn = new Scanner(System.in);
	private String StoreName,StoreAdd,StoreTel,StoreFax;
	ArrayList <ItemP> Item = new ArrayList <ItemP> ();
	public Invoice(String Name,String Tel,String Add,String Fax){
		StoreName = Name;StoreTel = Tel;StoreAdd = Add;StoreFax = Fax;
		checkTel();
		checkFax();
		while(true){
			System.out.println("�п�J���~�W�١B����B�ƶq�C");
			ItemP Item1 = new ItemP(scn.next(),scn.nextFloat(),scn.nextInt());
			Item.add(Item1);
			System.out.print("�O�_�٦��ӫ~?(Y/N)");
			String str = scn.next();
			if(str.equals("n") || str.equals("N")){break;}
		}
	}
	public void checkTel(){
		if(StoreTel.matches("[0-9]{2}-[0-9]{8}")){
		}else{
			System.out.println("�q�ܸ��X���~�A�мl�s��J�C");
			setTel(scn.next());
			checkTel();
		}
	}
	public void checkFax(){
		if(StoreFax.matches("[0-9]{2}-[0-9]{8}")){
		}else{
			System.out.println("�ǯu���X���~�A�мl�s��J�C");
			setFax(scn.next());
			checkFax();
		}
	}
	public String getName(){return StoreName;}
	public void setName(String Name){StoreName = Name;}
	
	public String getAdd(){return StoreAdd;}
	public void setAdd(String Add){StoreAdd = Add;}
	
	public String getTel(){return StoreTel;}
	public void setTel(String Tel){StoreTel = Tel;}
	
	public String getFax(){return StoreFax;}
	public void setFax(String Fax){StoreFax = Fax;}
	
	public void ShowStore(){
		System.out.println("�ө��W�١G"+StoreName+"\n"+
	                       "�ө��a�}�G"+StoreAdd+"\n"+
					  	   "�ө��q�ܡG"+StoreTel+"\n"+
	                       "�ө��ǯu�G"+StoreFax+"\n");
	}
}