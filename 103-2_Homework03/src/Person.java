import java.util.Scanner;
class Person{
	Scanner scn = new Scanner(System.in);
	private String Name,ID,Hight,Weight;
	public Person(){
		setName();
		setID();
		setHight();
		setWeight();
	}
	public Person(String PName){
		Name = PName;
		setID();
		setHight();
		setWeight();
	}
	public void setHight(){
		System.out.println("�п�J����");
		Hight = scn.next();
	}
	public void setWeight(){
		System.out.println("�п�J�魫");
		Weight = scn.next();
	}
	public void setName(){
		System.out.println("�п�J�W�l");
		Name = scn.next();
	}
	public void setID(){
		System.out.println("�п�J�s��");
		ID = scn.next();
	}
	public String Show(){
		return Name+"   "+ID+"\n�����G"+Hight+"   "+"�魫�G"+Weight;
	}
}