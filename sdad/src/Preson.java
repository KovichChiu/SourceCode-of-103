import java.util.Scanner;

class Person{
	Scanner scn = new Scanner(System.in);
	private String PName,PID;
	private float PersonHight,PersonWeight;
	public Person(String Name,String ID){
		PName = Name;PID = ID;
		setHight();
		setWeight();
	}
	public void setName(String Name){PName = Name;}
	public String getName(){return PName;}
	public void setID(String ID){PID = ID;}
	public String getID(){return PID;}
	public void setHight(){
		System.out.println("請輸入身高：");
		float Hight = scn.nextFloat();
		if(Hight>0){
			PersonHight = Hight;
		}else{
			System.out.println("輸入錯誤，請重新輸入。");
			setHight();
		}
	}
	public void setWeight(){
		System.out.println("請輸入體重：");
		float Weight = scn.nextFloat();
		if(Weight>0){
			PersonWeight = Weight;
		}else{
			System.out.println("輸入錯誤，請重新輸入。");
			setWeight();
		}
	}
	public float getHight(){return PersonHight;}
	public float getWeight(){return PersonHight;}
	public void Show(){
		System.out.println(getName()+" (ID："+getID()+"), Higet："+getHight()+" Weight："+getWeight());
	}
}