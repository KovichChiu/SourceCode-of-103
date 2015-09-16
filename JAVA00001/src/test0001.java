import java.util.Scanner;
public class test0001 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個數：");
		int num = scn.nextInt();
		for(int i=1;i<num;i++){
			for(int j=i;j<num;j++){
				double sum=((i+j)*(j-i+1))/2;
				if(sum==num){
					for(int k=i;k<j;k++){
						System.out.print(k+"+");
					}
					System.out.println(j+"="+num);
				}
			}
		}
	}
}
