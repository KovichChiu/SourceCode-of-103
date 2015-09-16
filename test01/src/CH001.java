import java.util.Scanner;
public class CH001 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("­È");
		int num = scn.nextInt();
		for(int i=1;i<num;i++){
			for(int j=i;j<num;j++){
				double v1 =((i+j)*(j-i+1))/2;
				if(v1==num){
					for(int k=i;k<j;k++){
						System.out.print(k+"+");
					}
					System.out.println(j+"="+num);
				}
			}
		}
	}

}
