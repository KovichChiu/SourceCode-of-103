import java.util.Random;
public class �@���D������ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int [] guess = new int [6];
		for(int i=0;i<6;i++){
			guess[i] = ran.nextInt(100)+1;
			for(int j=0;j<i;j++){
				if(guess[i]==guess[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<6;i++){
			System.out.print("��"+(i+1)+"�D�G"+guess[i]+"\n");
		}
	}

}
