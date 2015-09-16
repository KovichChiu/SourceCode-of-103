import java.util.Scanner;
public class HW03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一正整數：");
		int n =scn.nextInt();
		int [][] chr = new int[n][n];
		int x=1,y=1,num=1;
		for(int i=0;i<n;i++){
			x=i;
			y=0;
			do{
				chr[x][y]=num;
				x--; y++;
				num++;
			}while(x>=0 && y<n);
		}
		for(int i=1;i<n;i++){
			y=i;
			x=n-1;
			do{
				chr[x][y]=num;
				x--; y++;
				num++;
			}while(x>=1 && y<n);
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(chr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
