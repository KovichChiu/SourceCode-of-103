import java.util.ArrayList;
import java.util.Scanner;;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請寫出一串數列or字串：");
		String str = scn.next();
		ArrayList arraylist =P("",str);
		System.out.println("將"+str+"排列組合執行結果如下。");
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
