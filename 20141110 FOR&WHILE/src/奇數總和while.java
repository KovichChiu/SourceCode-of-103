
public class 奇數總和while {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int i = 1;
		while(i<=50){
			a=a+(2*i-1);
			i++;
		}
		System.out.print("奇數總和："+a);
	}

}
