import java.util.Scanner;
import java.util.ArrayList;
public class �p�Ҫ��ӫ~�M�� {
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
			System.out.println("�п�J�ӫ~�W��");
			Project aP = new Project(scn.next());
			List.add(aP);
			System.out.println("�٦��ӫ~��?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){break;}
		}
		System.out.println("�п�J�z����a�W�١C");
		SellerInfor SI = new SellerInfor(scn.next());
		String [] data = new String [List.size()];
		System.out.println("�H�U���ӫ~�M��C"+"\n"+"    �ӫ~�W��                              ���");
		for(int i=0;i<List.size();i++){
			data[i] = List.get(i).Show();
			System.out.println((i+1)+".  "+data[i]);
		}
		int d=0;
		float e=0;
		while(true){
			System.out.println("���~���J�ҭn�ʶR���ӫ~�C(�п�J�N�X)");
			INumber aI = new INumber(scn.nextInt());
			IN.add(aI);
			System.out.println("�аݭn�ʶR�X��?");
			Number aN = new Number(scn.nextInt());
			Num.add(aN);
			float subT = (List.get(IN.get(d).getNum()-1).Price)*(Num.get(d).num);
			e+=subT;
			Total aT = new Total(subT);
			t.add(aT);
			d++;
			System.out.print("�O�_�٦��ӫ~�ݭn�ʶR?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){
				break;
			}
		}
		System.out.println("\n===================�o��===================");
		SI.Show();
		System.out.println("�ӫ~�W��"+"\t"+"���"+"\t"+"�ʶR�ƶq"+"\t"+"�p�O");
		for(int i=0;i<IN.size();i++){
			System.out.println(List.get(IN.get(i).getNum()-1).Name+"\t"+
					 	 	   List.get(IN.get(i).getNum()-1).Price+"\t"+
							   Num.get(i).num+"\t"+
					 	 	   t.get(i).Subtotal);
		}
		
		System.out.println("\n�`���B  $"+e);
	}
}