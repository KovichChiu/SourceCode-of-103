import java.util.ArrayList;
import java.util.Scanner;;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�мg�X�@��ƦCor�r��G");
		String str = scn.next();
		ArrayList arraylist =P("",str);
		System.out.println("�N"+str+"�ƦC�զX���浲�G�p�U�C");
		System.out.print(arraylist);
	}
	private static ArrayList P(String stg,String str){
		ArrayList arl = new ArrayList();
		if(str.length()==1){
			arl.add(stg+str);
		}else{
			for(int i=0;i<str.length();i++){
				String f = stg+str.charAt(i);
				StringBuffer fsb = new StringBuffer(str);
				arl.addAll(P(f,fsb.deleteCharAt(i).toString()));
			}
		}
		return arl;
	}
}
