import java.util.Scanner;
import java.util.ArrayList;
public class 小夫的商品專賣 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList <Project> List ;
		List = new ArrayList<Project>();
		ArrayList <Total> t;
		t = new ArrayList<Total>();
		ArrayList <Number> Num;
		Num = new ArrayList<Number>();
		ArrayList <INumber> IN;
		IN = new ArrayList<INumber>();
		while(true){
			System.out.println("請輸入商品名稱");
			Project aP = new Project(scn.next());
			List.add(aP);
			System.out.println("還有商品嗎?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){break;}
		}
		System.out.println("請輸入您的賣家名稱。");
		SellerInfor SI = new SellerInfor(scn.next());
		String [] data = new String [List.size()];
		System.out.println("以下為商品清單。"+"\n"+"    商品名稱                              單價");
		for(int i=0;i<List.size();i++){
			data[i] = List.get(i).Show();
			System.out.println((i+1)+".  "+data[i]);
		}
		int d=0;
		float e=0;
		while(true){
			System.out.println("請繼續輸入所要購買的商品。(請輸入代碼)");
			INumber aI = new INumber(scn.nextInt());
			IN.add(aI);
			System.out.println("請問要購買幾份?");
			Number aN = new Number(scn.nextInt());
			Num.add(aN);
			float subT = (List.get(IN.get(d).getNum()-1).Price)*(Num.get(d).num);
			e+=subT;
			Total aT = new Total(subT);
			t.add(aT);
			d++;
			System.out.print("是否還有商品需要購買?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){
				break;
			}
		}
		System.out.println("\n===================發票===================");
		SI.Show();
		System.out.println("商品名稱"+"\t"+"單價"+"\t"+"購買數量"+"\t"+"小記");
		for(int i=0;i<IN.size();i++){
			System.out.println(List.get(IN.get(i).getNum()-1).Name+"\t"+
					 	 	   List.get(IN.get(i).getNum()-1).Price+"\t"+
							   Num.get(i).num+"\t"+
					 	 	   t.get(i).Subtotal);
		}
		
		System.out.println("\n總金額  $"+e);
	}
}