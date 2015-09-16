import java.util.Scanner;
public class HW03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一正整數：");
		int num = scn.nextInt();
		int sum=1,i=1;
		String str = "";
		while(sum<=num){
			str=str+(String.valueOf(sum)+",");
			sum=sum+(i++);
		}
		pr(str,1);
		int v=1;
		str="";
		while(v<=num){
			for(int j=0;j<v;j++){
				str=str+(String.valueOf(v)+",");
			}
			v++;
		}
		pr(str,2);
	}
	private static void pr(String str,int num){
		String str1=new StringBuffer(str).deleteCharAt(str.length()-1).toString();
		System.out.println("\n數列"+num+"如下：\n"+str1);
	}
}