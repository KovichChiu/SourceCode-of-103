import java.util.Random;
import java.util.Scanner;
public class 比大小 {
	public static void main(String[] args) {
			Random ran = new Random();
			Scanner scn = new Scanner(System.in);
			System.out.println("這是一個小遊戲──比大小");
			System.out.println("遊戲規則：電腦會由亂處產生一個axb，玩家也會取得一個由亂數產生的一個axb，比電腦大者贏。"+"\n");
			while(true){
				int [] a = new int [5];
				int [] b = new int[14];
				int c = ran.nextInt(4)+1;
				int d = ran.nextInt(13)+1;
				for(int i=1;i<5;i++){
					a[i]=ran.nextInt(5)+1;
				}
				for(int i=1;i<14;i++){
					b[i]=ran.nextInt(20)+1;
				}
				int e=a[c]*b[d];
				System.out.print("請問有幾位使用者?");
				int member = scn.nextInt();
				for(int i=1;i<=member;i++){
					System.out.print("您是第         "+i+"\t"+"玩家，這是您抽到的數字：");
					c=ran.nextInt(4)+1;
					d=ran.nextInt(13)+1;
					for(int j=1;j<5;j++){
						a[j]=ran.nextInt(5)+1;
					}
					for(int k=1;k<14;k++){
						b[k]=ran.nextInt(20)+1;
					}
					int z = a[c]*b[d];
					System.out.print(" "+z);
					if(z>e){
						System.out.println("\t"+"恭喜你！贏得了這次的比賽。");					
					}else{
						System.out.println("\t"+"很抱歉！您得到的數字並沒有比較大...");
					}
				}
				System.out.print("請問還要再比一次嗎?(Y/N)");
				String r = scn.next();
				if(r.equals("N")){
					break;
				}
			}
	}
}

