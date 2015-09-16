package Sign_in;
import java.util.ArrayList;

import Sign_in.Person;

public class Login {
	private ArrayList<Person>player=new ArrayList<Person>();
	public void addNewPlayer(String name1,String id1,String pwd1){
		player.add(new Person(name1, id1, pwd1));
	}
	public void setPWD(String id1,String pwd1){
		Person tmpPlayer=null;
		int num=player.size();
		int i=0;
		boolean flag=true;
		while(i<num && flag){
			if(player.get(i).getID().equals(id1)){
				tmpPlayer=player.get(i);
				flag = false;
				break;
			}
			i++;
		}
		if(!flag){
			tmpPlayer.setPWD(pwd1);
		}
	}
	public boolean testUser(String uID,String uPW){
		int num=player.size();
		int i=0;
		boolean flag=true;
		while(i<num&&flag){
			if(player.get(i).getID().equals(uID)&&player.get(i).getPWD().equals(uPW)){
				flag=false;
			}
			i++;
		}
		if(!flag){
			return true;
		}else{
			return false;
		}
	}
	public boolean verification(String acc, String pass) {
		int num=player.size();
		int i=0;
		boolean flag=false;
		System.out.println("acc:" + acc);
		System.out.println("pass:" + pass);
		while(i<num){
			if(player.get(i).getID().equals(acc) && player.get(i).getPWD().equals(pass)){
				flag = true;
			}
			i++;
		}
		return flag;
	}

}
