import java.util.Scanner;

class SellerInfor{
	Scanner scn = new Scanner(System.in);
	String Name,Tel,Add,AddArea,AddCity,AddNum;
	public SellerInfor(String SName){
		Name = SName;
		setAdd();
		System.out.println("以下為您所輸入的商家地址。");
		Show();
		while(true){
			System.out.print("是否正確?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){
				System.out.println("請重新輸入。"+"\n");
				setAdd();
			}else break;
		}
	}
	public void setAdd(){
		System.out.println("請依序輸入賣家郵遞區號、所在城市、所在地區、商店位置。(請以空白分隔)");
		AddNum = scn.next();
		AddCity = scn.next();
		AddArea = scn.next();
		Add = scn.next();
	}
	public void Show(){
		System.out.println(Name+"\n"+
						   Add+"\n"+
				           AddArea+"  "+
						   AddCity+"  "+
				           AddNum+"\n");
	}
}