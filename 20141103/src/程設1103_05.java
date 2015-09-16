import java.util.Random;
public class 程設1103_05 {

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
			System.out.println("亂數所求的第"+(i+1)+"個西元年："+a[i]);
			if(a[i]%400==0){
				System.out.println("西元"+a[0]+"年是閏年！");
			}
			else if(a[i]%4==0&&a[i]%100!=0){
				System.out.println("西元"+a[i]+"年是閏年！");
			}
			else if(a[i]%4!=0){
				System.out.println("西元"+a[i]+"年不是閏年！");
			}
			else if(a[i]%100==0){
				System.out.println("西元"+a[i]+"年不是閏年！");
			}
			else if(a[i]%4==0){
				System.out.println("西元"+a[i]+"年是閏年！");
			}
		}
	}

}
