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
			System.out.println("請輸入物品名稱、單價、數量。");
			ItemP Item1 = new ItemP(scn.next(),scn.nextFloat(),scn.nextInt());
			Item.add(Item1);
			System.out.print("是否還有商品?(Y/N)");
			String str = scn.next();
			if(str.equals("n") || str.equals("N")){break;}
		}
	}
	public void checkTel(){
		if(StoreTel.matches("[0-9]{2}-[0-9]{8}")){
		}else{
			System.out.println("電話號碼錯誤，請幢新輸入。");
			setTel(scn.next());
			checkTel();
		}
	}
	public void checkFax(){
		if(StoreFax.matches("[0-9]{2}-[0-9]{8}")){
		}else{
			System.out.println("傳真號碼錯誤，請幢新輸入。");
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
		System.out.println("商店名稱："+StoreName+"\n"+
	                       "商店地址："+StoreAdd+"\n"+
					  	   "商店電話："+StoreTel+"\n"+
	                       "商店傳真："+StoreFax+"\n");
	}
}