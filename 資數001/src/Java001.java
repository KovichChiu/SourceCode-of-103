 public class Java001 {
	public static void main(String[] args) {
		System.out.println("算式：x^3-x-1=0 , -3<x<3  (1) 求x介於哪兩數之間。(2)求x。");
		System.out.println();
		double x,a,b;
		for(x=-3;x<=3;x++){
			a=Math.pow(x,3);
			b=x;
			System.out.println("f("+(int)x+")="+(int)(a-b-1));
		}
		System.out.println();
		System.out.println("(1)x根介於1與2之間。");
		System.out.println();
		double Z = 1.0/10000000;
		for(x=1;x<=2;x=x+Z){
			double A = Math.pow(x,3)-x-1;
			double B = Math.pow(x+Z,3)-(x+Z)-1;
			if(A*B<0){
				System.out.print("(2)x大約等於="+x);
			}
		}
	}
}