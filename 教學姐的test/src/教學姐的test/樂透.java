package 教學姐的test;
import java.util.Random;
public class 樂透 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int [] data = new int [6];
		for(int i=0;i<6;i++){
			data[i] = ran.nextInt(42)+1;
			for(int j=i-1;j>=0;j--){
				if(data[i] == data[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<6;i++){
			System.out.println(data[i]);
		}
	}
}
