import java.util.Random;
public class Class_004 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [] a = new int [6];
		int i=0;
		for(i=0;i<6;i++){
			a[i]=ran.nextInt(42)+1;
			for(int j=0;j<i;j++){
				if(a[i]==a[i-(j+1)]){
					i--;
				}
			}
		}
		for(i=0;i<6;i++){
		System.out.print(a[i]+"\t");
		}
	}	
}