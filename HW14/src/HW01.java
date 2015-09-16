import java.util.Scanner;
public class HW01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] danum = {1,9,8,7,6,5,4,3,2,1};
		System.out.print("請輸入身分證字號：");
		String ID = scn.next();
		char [] data = ID.toCharArray();
		StringBuffer str = new StringBuffer(ID).deleteCharAt(0);
		str = str.deleteCharAt(str.length()-1);
		str = L(data[0]).append(str);
		String str1 = str.toString();
		char [] data1 = str1.toCharArray();
		int sum=0,len=danum.length;
		for(int i=0;i<len;i++){
			String strdata1 = String.valueOf(data1[i]);
			int intdata1 = Integer.valueOf(strdata1);
			sum+=intdata1*danum[i];
		}
		String Ans = String.valueOf(sum);
		int Ans1 = Integer.valueOf(Ans);
		int Ans2 = 10-(Ans1%10);
		String data2 = String.valueOf(data[ID.length()-1]);
		int data3 = Integer.valueOf(data2);
		if(Ans2==data3){
			System.out.print("這是正確的身分證字號。");
		}else{
			System.out.print("這是不正確的身分證字號。");
		}
	}
	private static StringBuffer L(char data) {
		StringBuffer sb = new StringBuffer();
		int num = data-65;
		switch(num){
		case 0:
			sb=sb.append("10");
			break;
		case 1:
			sb=sb.append("11");
			break;
		case 2:
			sb=sb.append("12");
			break;
		case 3:
			sb=sb.append("13");
			break;
		case 4:
			sb=sb.append("14");
			break;
		case 5:
			sb=sb.append("15");
			break;
		case 6:
			sb=sb.append("16");
			break;
		case 7:
			sb=sb.append("17");
			break;
		case 8:
			sb=sb.append("34");
			break;
		case 9:
			sb=sb.append("18");
			break;
		case 10:
			sb=sb.append("19");
			break;
		case 11:
			sb=sb.append("20");
			break;
		case 12:
			sb=sb.append("21");
			break;
		case 13:
			sb=sb.append("22");
			break;
		case 14:
			sb=sb.append("35");
			break;
		case 15:
			sb=sb.append("23");
			break;
		case 16:
			sb=sb.append("24");
			break;
		case 17:
			sb=sb.append("25");
			break;
		case 18:
			sb=sb.append("26");
			break;
		case 19:
			sb=sb.append("27");
			break;
		case 20:
			sb=sb.append("28");
			break;
		case 21:
			sb=sb.append("29");
			break;
		case 22:
			sb=sb.append("30");
			break;
		case 23:
			sb=sb.append("31");
			break;
		case 24:
			sb=sb.append("32");
			break;
		case 25:
			sb=sb.append("33");
			break;
		}
		return sb;
	}
}
