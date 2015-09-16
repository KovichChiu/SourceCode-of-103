import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入年分：");
		int year = scn.nextInt();
		System.out.print("請輸入月份：");
		int month = scn.nextInt();
		String[][] data = new String [7][7];
		int ds = (daystart(year)+year)%7;
		int d=0,g=0;
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		for(int k=1;k<=month;k++){
			d=0;
			for(int i=0;i<(ds%7);i++){
				if(k==month){
					System.out.print("\t");
				}
			}
			for(int i=0;i<7;i++){
				for(int j=(ds%7);j<7;j++){
					data[i][j]=String.valueOf(++d);
					if(k==month){
						System.out.print(data[i][j]+"\t");
					}
					if(d==monthday(k,yeardd(year))){
						g=j;
						break;
					}
				}
				ds=0;
				if(d==monthday(k,yeardd(year))){
					ds=g+1;
					break;
				}
				if(k==month){
					System.out.println();
				}
			}
		}
	}
	private static int daystart(int year){
		int count = 0;
		for(int i=1;i<=year;i++){
			if(i%4==0 && i%100!=0 || i%400==0){
				count++;
			}
		}
		return count;
	}
	private static int monthday(int month,int year){
		int count = 0;
		switch(month){
		case 1:
			count=31;
			break;
		case 2:
			count=(28+year);
			break;
		case 3:
			count=31;
			break;
		case 4:
			count=30;
			break;
		case 5:
			count=31;
			break;
		case 6:
			count=30;
			break;
		case 7:
			count=31;
			break;
		case 8:
			count=31;
			break;
		case 9:
			count=30;
			break;
		case 10:
			count=31;
			break;
		case 11:
			count=30;
			break;
		case 12:
			count=31;
			break;
		}
		return count;
	}
	private static int yeardd(int year){
		if(year%4==0 && year%100!=0 || year%400==0){
			return 1;
		}else{
			return 0;
		}
	}
}
