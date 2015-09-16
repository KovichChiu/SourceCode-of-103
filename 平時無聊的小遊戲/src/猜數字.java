import java.util.Scanner;
import java.util.Random;
public class 猜數字 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("這是一個小遊戲   ─ 猜數字");
		System.out.println("遊戲規則：會由亂數取出4位不重複的數，並在10次內解出答案！");
		int [] num = new int [4];
		int [] gue = new int [4];
		for(int i =0;i<4;i++){
			num[i]=ran.nextInt(9);
			for(int j=0;j<i;j++){
				if(num[i]==num[i-(j+1)]){
					i--;
				}
			}
		}
		int x=0;
		while(x<10){
			System.out.print("\n"+"請輸入4位不重複的數：");
			int s = scn.nextInt();
			int a=0,b=0,c,d,e,f;
			c=s/1000;
			d=(s-(c*1000))/100;
			e=(s-(c*1000)-(d*100))/10;
			f=(s-(c*1000)-(d*100)-(e*10));
			gue[0]=c;
			gue[1]=d;
			gue[2]=e;
			gue[3]=f;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(gue[i]==num[j]){
						b++;
						if(gue[i]==num[i]){
							b--;
							a++;
						}
					}
				}
			}
			System.out.print("結果為= "+a+" A "+b+" B ");
			if(a==4){
				System.out.print("\n"+"您答對了！請問還要繼續玩嗎?(Y/N)");
				String z = scn.next();
				if(z.equals("N")){
					break;
				}
			}
			x++;
		}
		System.out.println("\n"+"不好意思...您輸了。");
		System.out.print("正確解答為：");
		for(int i=0;i<4;i++){
			System.out.print(num[i]);
		}
		System.out.print("請重新開始遊戲。");
	}
}