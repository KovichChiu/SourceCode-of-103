import java.util.Scanner;
public class Class_003 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String [] num = {"01272636","39412201","94586356"};
		System.out.print("請輸入一組發票的號碼：");
		String a = scn.next();
		int [] q = {0,0,0};
		char [] data = a.toCharArray();
		char [] num1 = num[0].toCharArray();
		char [] num2 = num[1].toCharArray();
		char [] num3 = num[2].toCharArray();
		for(int i =7;i>=0;i--){
			if(num1[i]==data[i]){
				q[0]++;
			}else{
				break;
			}
		}
		for(int i =7;i>=0;i--){
			if(num2[i]==data[i]){
				q[1]++;
			}else{
				break;
			}
		}
		for(int i =7;i>=0;i--){
			if(num3[i]==data[i]){
				q[2]++;
			}else{
				break;
			}
		}
		for(int i=0;i<3;i++){
			System.out.print("第"+(i+1)+"組發票號碼中，");
			switch(q[i]){
			case 0:
				System.out.println("沒有中獎！");
				break;
			case 1:
				System.out.println("沒有中獎！");
				break;
			case 2:
				System.out.println("沒有中獎！!");
				break;
			case 3:
				System.out.println("中了200元！");
				break;
			case 4:
				System.out.println("中了1000元！");
				break;
			case 5:
				System.out.println("中了4000元！");
				break;
			case 6:
				System.out.println("中了10000元！");
				break;
			case 7:
				System.out.println("中了40000元！");
				break;
			case 8:
				System.out.println("中了200000元！");
				break;
			}
		}
	}
}