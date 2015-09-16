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
		System.out.println("請輸入身高");
		Hight = scn.next();
	}
	public void setWeight(){
		System.out.println("請輸入體重");
		Weight = scn.next();
	}
	public void setName(){
		System.out.println("請輸入名子");
		Name = scn.next();
	}
	public void setID(){
		System.out.println("請輸入編號");
		ID = scn.next();
	}
	public String Show(){
		return Name+"   "+ID+"\n身高："+Hight+"   "+"體重："+Weight;
	}
}