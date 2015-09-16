import java.util.Random;
public class Class_023 {

	/*
	 * 23. 睹计玻ネ1~100丁タ俱计睹计耞块计いぇ程の程
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int [] a = new int [3];
			int amax = 0;
			int amin = 100;
		for(int i = 0;i<3;i++){
			a[i]=ran.nextInt(100)+1;
			System.out.println(a[i]);
			if(amax<a[i]){
				amax=a[i];
			}
			if(amin>a[i]){
				amin=a[i];
			}
		}
		System.out.print("程"+amin+"\t"+"程"+amax);
	}

}
