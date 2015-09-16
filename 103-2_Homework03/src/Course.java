import java.util.Scanner;
class Course{
	Scanner scn = new Scanner(System.in);
	private String Name,NOP,Explanation;
	public Course(String CName){
		Name = CName;
		setNOP();
		setExp();
	}
	public void setName(){
		System.out.println("請輸入課程名稱");
		Name = scn.next();
	}
	public void setNOP(){
		System.out.println("請輸入選課人數");
		NOP = scn.next();
	}
	public void setExp(){
		System.out.println("請輸入本課說明");
		Explanation = scn.next();
	}
	public String Show(){
		return Name+"\t修課人數："+NOP+"\n課程說明："+Explanation;
	}
}