
public class �T�H���Zwhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] n ={"�|��","���","����"};
		String [] o = {"���","�^��","�L�n��","�{���]�p","��T�P�ͬ�"};
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
