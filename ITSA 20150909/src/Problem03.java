import java.util.Scanner;
public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int [] x = new int [num];
		int [] y = new int [num];
		int [] d = new int [num];
		for(int i=0;i<num;i++){
			x[i] = scn.nextInt();
			y[i] = scn.nextInt();
			d[i] = scn.nextInt();
		}
		int xtmp = 0;
		int ytmp = 0;
		int dtmp = 0;
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(d[i] > d[j]){
					//¥ý´«x
					xtmp = x[i];
					x[i] = x[j];
					x[j] = xtmp;
					//¦A´«y
					ytmp = y[i];
					y[i] = y[j];
					y[j] = ytmp;
					//¦A´«d
					dtmp = d[i];
					d[i] = d[j];
					d[j] = dtmp;
				}
			}
		}
		for(int i=0;i<num;i++){
			System.out.print(x[i]+" ");
			System.out.print(y[i]+" ");
			System.out.println(d[i]);
		}
	}

}
