import java.util.*;
public class Ten_to_Other {
	public static void main(String[] args) {
		ArrayList r = new ArrayList();
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入N(數字)/M(進制)。");
		System.out.print("N:");
		int n = scn.nextInt();
		System.out.print("M:");
		int m = scn.nextInt();
		if(m<=10){
			System.out.println(deal(Hex_9(n,m)));
		}else{
			System.out.println(deal(Hex_10(n,m)));
		}
	}
	public static ArrayList Hex_9(int n,int m){ //10進制以下的
		ArrayList a = new ArrayList();
		if(n<m){
			a.add(n);
			return a;
		}else{
			a.add(n%m);
			a.add(Hex_9(n/m,m));
			return a;
		}
	}
	
	public static String deal(ArrayList s){  //文字轉換
		String str = String.valueOf(s);
		String str3 = new StringBuffer(str).reverse().toString();
		char [] str2 = str3.toCharArray();
		int len2 = str2.length;
		String str5 = "";
		for(int j=0;j<len2;j++){
			String str4 = String.valueOf(str2[j]);
			if(str4.equals("[") || str4.equals("]") || str4.equals(",") || str4.equals(" ")){
				continue;
			}else{
				str5 = str5+str4;
			}
		}
		return str5;
	}
	public static ArrayList Hex_10(int n,int m){  //11進制以上的
		ArrayList a = new ArrayList();
		if(n<m){
			if(n>=10){
				a.add(Hex_10_En(n));
			}else{
				a.add(n);
			}
			return a;
		}else{
			if(n%m>=10){
				a.add(Hex_10_En(n%m));
			}else{
				a.add(n%m);
			}
			a.add(Hex_10(n/m,m));
			return a;
		}
		
	}
	public static String Hex_10_En(int n){  //11以上的數字
		String a = "";
		switch(n){
		case 10:
			a = "A";
			break;
		case 11:
			a = "B";
			break;
		case 12:
			a = "C";
			break;
		case 13:
			a = "D";
			break;
		case 14:
			a = "E";
			break;
		case 15:
			a = "F";
			break;
		}
		return a;
	}
}
	