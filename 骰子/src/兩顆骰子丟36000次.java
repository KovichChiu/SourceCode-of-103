import java.util.Random;
public class 兩顆骰子丟36000次 {
	public static void main(String[] args) {
		Random ran = new Random();
		int [] s=new int [13];
		int [] all=new int [37];
		int n=0;
		for(int i=0;i<36000;i++){
			int a=ran.nextInt(6)+1;
			int b=ran.nextInt(6)+1;
			n=a+b;
			switch(n){
			case 2:
				s[2]++;
				all[1]++;
				break;
			case 3:
				if(a==1){
					all[2]++;
				}else{
					all[7]++;
				}
				s[3]++;
				break;
			case 4:
				if(a==1){
					all[3]++;
				}
				else if(a==2){
					all[8]++;
				}
				else if(a==3){
					all[13]++;
				}
				s[4]++;
				break;
			case 5:
				if(a==1){
					all[4]++;
				}
				else if(a==2){
					all[9]++;
				}
				else if(a==3){
					all[14]++;
				}
				else if(a==4){
					all[19]++;
				}
				s[5]++;
				break;
			case 6:
				if(a==1){
					all[5]++;
				}
				else if(a==2){
					all[10]++;
				}
				else if(a==3){
					all[15]++;
				}
				else if(a==4){
					all[20]++;
				}
				else if(a==5){
					all[25]++;
				}
				s[6]++;
				break;
			case 7:
				if(a==1){
					all[6]++;
				}
				else if(a==2){
					all[11]++;
				}
				else if(a==3){
					all[16]++;
				}
				else if(a==4){
					all[21]++;
				}
				else if(a==5){
					all[26]++;
				}
				else if(a==6){
					all[31]++;
				}
				s[7]++;
				break;
			case 8:
				if(a==2){
					all[12]++;
				}
				else if(a==3){
					all[17]++;
				}
				else if(a==4){
					all[22]++;
				}
				else if(a==5){
					all[27]++;
				}
				else if(a==6){
					all[32]++;
				}
				s[8]++;
				break;
			case 9:
				if(a==3){
					all[18]++;
				}
				else if(a==4){
					all[23]++;
				}
				else if(a==5){
					all[28]++;
				}
				else if(a==6){
					all[33]++;
				}
				s[9]++;
				break;
			case 10:
				if(a==4){
					all[24]++;
				}
				else if(a==5){
					all[29]++;
				}
				else if(a==6){
					all[34]++;
				}
				s[10]++;
				break;
			case 11:
				if(a==5){
					all[30]++;
				}
				else if(a==6){
					all[35]++;
				}
				s[11]++;
				break;
			case 12:
				all[36]++;
				s[12]++;
				break;
			}
		}
		System.out.println("兩顆骰子在投擲 36000 次中，2 ~ 12 點出現的次數&機率如下。");
		for(int i=2;i<=12;i++){
			double P=0.0;
			P=(s[i]/36000.0)*100.0;
			System.out.print("["+i+"點]="+s[i]+"次    \tP=");
			System.out.printf("%.3f",P);
			System.out.println(" %");
		}
		System.out.println("\n骰子A 與 骰子B 投擲結果如下。");
		System.out.print("\t\t");
		for(int i=1;i<=6;i++){
			System.out.print(i+"\t\t");
		}
		System.out.println("\n\n\n\n\n");
		for(int i=0;i<6;i++){
			System.out.print((i+1)+"\t\t");
			for(int j=1;j<=6;j++){
				System.out.print(all[(i*6)+j]+"\t\t");
			}
			System.out.print("\n\n\n\n");
		}
	}
}
