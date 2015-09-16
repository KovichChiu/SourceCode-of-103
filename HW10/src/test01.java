import java.util.Scanner;
public class test01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("");
		String str = scn.nextLine();
		String [] str1 = str.split(" ");
		int len = str1.length;
		//for(int x=1;x<=len;x++){
			for(int i=1;i<=len;i++){
				int j=0;
				String str2 ="",strc ="";
				
				do{
					strc = String.valueOf(str1[j]);
					System.out.print(strc);
					for(int k=j+1;k<len;k++){
						System.out.print(str1[k]);
					}
					j++;
				}while(j<i);
				System.out.println();
			//}
		}
	}

}
