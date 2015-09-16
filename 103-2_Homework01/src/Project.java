import java.util.Scanner;
class Project{
	Scanner scn = new Scanner(System.in);
	String Name;
	float Price;
	public Project(String PName){
		Name = PName;
		setPrice();
	}
	public void setPrice(){
		System.out.println("請輸入該商品單價。");
		Price = scn.nextFloat();
	}
	public String Show(){
		int l=10,len=Name.length();
		String str = "";
		for(int i=0;i<l-len;i++){
			str+="-";
		}
		return Name+" "+str+" "+Price;
	}
}