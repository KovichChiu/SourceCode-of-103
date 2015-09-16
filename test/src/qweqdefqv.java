import java.util.*;
public class qweqdefqv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		int n=1;
		while(n==1){
			int [] sequence = new int [4];
			for(int i=0;i<4;i++){
				sequence[i] = ran.nextInt(4);
				for(int j=i-1;j>=0;j--){
					if(sequence[j]==sequence[i]){
						i--;
						break;
					}
				}
			}
			for(int i=0;i<4;i++){
				System.out.println(sequence[i]);
			}
			n=scn.nextInt();
		}
	}

}
