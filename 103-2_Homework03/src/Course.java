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
		System.out.println("�п�J�ҵ{�W��");
		Name = scn.next();
	}
	public void setNOP(){
		System.out.println("�п�J��ҤH��");
		NOP = scn.next();
	}
	public void setExp(){
		System.out.println("�п�J���һ���");
		Explanation = scn.next();
	}
	public String Show(){
		return Name+"\t�׽ҤH�ơG"+NOP+"\n�ҵ{�����G"+Explanation;
	}
}