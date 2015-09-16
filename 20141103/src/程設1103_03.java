import java.util.Random;
public class 程設1103_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("電腦選好了三個正整數：");
		Random ran = new Random();
		int [] a = new int [3];
		for(int i = 0;i<3;i++){
			a[i]=ran.nextInt(100);
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		int aMax = a[0];
		int aMin = a[0];
		aMax = 0;
		aMin = 100;
		for(int i = 0;i<3;i++){
			
			if(aMax<a[i]){
				aMax = a[i];
			}
			if(aMin>a[i]){
				aMin = a[i];
			}
		}
		System.out.print("MAX="+aMax+"\t"+"MIN="+aMin);
	}

}
