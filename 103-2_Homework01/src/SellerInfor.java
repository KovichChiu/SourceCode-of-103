import java.util.Scanner;

class SellerInfor{
	Scanner scn = new Scanner(System.in);
	String Name,Tel,Add,AddArea,AddCity,AddNum;
	public SellerInfor(String SName){
		Name = SName;
		setAdd();
		System.out.println("�H�U���z�ҿ�J���Ӯa�a�}�C");
		Show();
		while(true){
			System.out.print("�O�_���T?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){
				System.out.println("�Э��s��J�C"+"\n");
				setAdd();
			}else break;
		}
	}
	public void setAdd(){
		System.out.println("�Ш̧ǿ�J��a�l���ϸ��B�Ҧb�����B�Ҧb�a�ϡB�ө���m�C(�ХH�ťդ��j)");
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