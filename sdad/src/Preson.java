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
		System.out.println("�п�J�����G");
		float Hight = scn.nextFloat();
		if(Hight>0){
			PersonHight = Hight;
		}else{
			System.out.println("��J���~�A�Э��s��J�C");
			setHight();
		}
	}
	public void setWeight(){
		System.out.println("�п�J�魫�G");
		float Weight = scn.nextFloat();
		if(Weight>0){
			PersonWeight = Weight;
		}else{
			System.out.println("��J���~�A�Э��s��J�C");
			setWeight();
		}
	}
	public float getHight(){return PersonHight;}
	public float getWeight(){return PersonHight;}
	public void Show(){
		System.out.println(getName()+" (ID�G"+getID()+"), Higet�G"+getHight()+" Weight�G"+getWeight());
	}
}