import java.util.Random;
public class �{�]1103_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int [] a = new int [3];
		int i = 0;
		
		for(i=0;i<3;i++){
			a[i]=ran.nextInt(3000)+1;
			System.out.println("�üƩҨD����"+(i+1)+"�Ӧ褸�~�G"+a[i]);
			if(a[i]%400==0){
				System.out.println("�褸"+a[0]+"�~�O�|�~�I");
			}
			else if(a[i]%4==0&&a[i]%100!=0){
				System.out.println("�褸"+a[i]+"�~�O�|�~�I");
			}
			else if(a[i]%4!=0){
				System.out.println("�褸"+a[i]+"�~���O�|�~�I");
			}
			else if(a[i]%100==0){
				System.out.println("�褸"+a[i]+"�~���O�|�~�I");
			}
			else if(a[i]%4==0){
				System.out.println("�褸"+a[i]+"�~�O�|�~�I");
			}
		}
	}

}
