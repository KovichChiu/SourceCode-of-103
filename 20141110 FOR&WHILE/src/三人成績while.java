
public class 三人成績while {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] n ={"魯夫","喬巴","索隆"};
		String [] o = {"國文","英文","微積分","程式設計","資訊與生活"};
		int [] [] s = {{89,98,97,99,87},
				       {97,89,98,99,87},
				       {97,99,89,98,87}};
		int i = 0;
		System.out.print("\t");
		while(i<5){
			System.out.print(o[i]+"\t");
			i++;
		}
		System.out.println();
		i=0;
		int j = 0;
		while(i<3){
			System.out.print(n[i]+"\t");
			j=0;
			while(j<5){
				System.out.print(s[i][j]+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
					   
	}

}
