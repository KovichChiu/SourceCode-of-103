import java.util.Scanner;
public class JAVA解LOVE {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請問想要看 L O V E 哪一個的解?");
		String word = scn.next();
		if(word.equals("L")){
			System.out.println("L → y=1/x"+"\n");
			double y;
			double i;
			for(i=10.0;i>=0.1;i-=1){
				y=1.0/i;
				System.out.print("當 X = "+i+" 時"+"\t");
				System.out.println("Y="+(float)y);
			}
		}
		else if(word.equals("O")){
			System.out.println("O → x^2+y^2 = 9"+"\n");
			double i,j,a,b;
			for(i=-3;i<=3;i++){
				for(j=3;j>=-3;j--){
					a=Math.pow(i, 2);
					b=Math.pow(j, 2);
					double c =a+b;
					if(c==9.0){
						System.out.print("X="+i+" ");
						System.out.print("Y="+j+"\n"+"\n");
					}
				}
			}
		}
		else if(word.equals("V")){
			System.out.println("V → y=|-2x|");
			double i,z,y;
			for(i=10;i>=-10;i-=1){
				z=(-2*i);
				y=Math.abs(z);
				System.out.print("當 X = "+i+" 時"+"\t");
				System.out.println("Y="+y);
			}
		}
		else if(word.equals("E")){
			System.out.println("E → x=-3|sin y|");
			double i,j,z;
			for(i=0;i<=360;i=i+10.0){
				z=Math.sin(i);
				j=-3*Math.abs(z);
					System.out.print("當 y = "+i+" 度"+"\t");
					System.out.println("X="+j+" ");
			}
		}
	}
}
