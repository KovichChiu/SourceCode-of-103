import java.util.ArrayList;
public class test {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		ArrayList <String> str = new ArrayList<String>();
		str.add("1");
		str.add("2");
		String str3="";
		str.clear();
		for(int i=0;i<str.size();i++){
			str3+=str.get(i);
		}
		System.out.println(str3);
	}

}
