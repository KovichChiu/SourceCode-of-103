package Sign_in;

public class Person {
	private String name,id,pwd;
	public Person(String name1,String id1,String pwd1){
		name=name1;
		id=id1;
		pwd=pwd1;
	}
	public String getName(){
		return name;
	}
		
	public String getID(){
		return id;
	}
	
	public String getPWD(){
		return pwd;
	}
	public void setPWD(String pwd1){
		pwd = pwd1;
	}
}
