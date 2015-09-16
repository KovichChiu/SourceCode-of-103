import java.util.Scanner;
import java.util.Random;
public class HW03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int all=12;
		System.out.print("請問想先取還是後取(1.先取        2.後取)：");
		int take = scn.nextInt();
		while(true){
			if(take==1){
				System.out.println("目前火柴的數目："+all);
				System.out.print("請入想取走的火柴數目(1~3)：");
				int Pt = scn.nextInt();
				while(Pt<1||Pt>3){
					System.out.println("輸入錯誤，請重新輸入。");
					System.out.print("請入想取走的火柴數目(1~3)：");
					Pt = scn.nextInt();
				}
				int Ct = ran.nextInt(3)+1;
				all=all-Pt;
				if(all<=0){
					System.out.println("剩餘的火柴數目：0"+"\n"+"玩家敗！");
					break;
				}else{
					System.out.println("剩餘的火柴數目："+all+"\n"+"繼續遊戲！\n");
				}
				System.out.println("電腦取走的數："+Ct);
				all=all-Ct;
				if(all<=0){
					System.out.println("剩餘的火柴數目：0"+"\n"+"電腦敗！");
					break;
				}else{
					System.out.println("剩餘的火柴數目："+all+"\n"+"繼續遊戲！\n");
				}
			}
			if(take==2){
				System.out.println("目前火柴的數目"+all);
				int Ct = ran.nextInt(3)+1;
				System.out.println("電腦取走的數："+Ct);
				all=all-Ct;
				if(all<=0){
					System.out.println("剩餘的火柴數目：0"+"\n"+"電腦敗！");
					break;
				}else{
					System.out.println("剩餘的火柴數目："+all+"\n"+"繼續遊戲！\n");
				}
				System.out.print("請入想取走的火柴數目(1~3)：");
				int Pt = scn.nextInt();
				while(Pt<1||Pt>3){
					System.out.println("輸入錯誤，請重新輸入。");
					System.out.print("請入想取走的火柴數目(1~3)：");
					Pt = scn.nextInt();
				}
				all=all-Pt;
				if(all<=0){
					System.out.println("剩餘的火柴數目：0"+"\n"+"玩家敗！");
					break;
				}else{
					System.out.println("剩餘的火柴數目："+all+"\n"+"繼續遊戲！\n");
				}
			}
			if(take<1||take>2){
				System.out.println("輸入錯誤，請重新輸入。");
				System.out.print("請問想先取還是後取(1.先取        2.後取)：");
				take = scn.nextInt();
			}
		}
	}
}
