public class 奇數總和 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1;i<=50;i++){
			a=a+(2*i-1);
		}
		System.out.print("奇數總和："+a);
	}
}
