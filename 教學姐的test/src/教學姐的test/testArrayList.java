package �оǩj��test;
import java.util.ArrayList;
public class testArrayList {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		ArrayList <String> data = new ArrayList<String>();
		data.add("a");
		data.add("b");
		data.add("c");
		data.add(1,"c");
		data.remove(2);
		for(String a : data){
			System.out.print(a);
		}
		for(int i=0;i<data.size();i++){
			System.out.print(data.get(i));
		}
	}

}
