 public class Java001 {
	public static void main(String[] args) {
		System.out.println("�⦡�Gx^3-x-1=0 , -3<x<3  (1) �Dx�������Ƥ����C(2)�Dx�C");
		System.out.println();
		double x,a,b;
		for(x=-3;x<=3;x++){
			a=Math.pow(x,3);
			b=x;
			System.out.println("f("+(int)x+")="+(int)(a-b-1));
		}
		System.out.println();
		System.out.println("(1)x�ڤ���1�P2�����C");
		System.out.println();
		double Z = 1.0/10000000;
		for(x=1;x<=2;x=x+Z){
			double A = Math.pow(x,3)-x-1;
			double B = Math.pow(x+Z,3)-(x+Z)-1;
			if(A*B<0){
				System.out.print("(2)x�j������="+x);
			}
		}
	}
}