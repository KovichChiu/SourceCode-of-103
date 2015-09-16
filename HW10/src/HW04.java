import java.util.Scanner;
public class HW04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入 0~9999 的一正整數：");
		int n=scn.nextInt();
		int a=0,b=0,c=0,d=0;
		if(n>=0&&n<=20){
			ET(n);
		}else{
			if(n<=99){
				if(n%10==0){
					ET(n);
				}else{
					a=(n/10)*10;
					b=n%10;
					ET(a);
					System.out.print("-");
					ET(b);
				}
			}
			if(n>=100&&n<=999){
				if(n%100==0){
					a=n/100;
					ET(a);
					ET(100);
				}else{
					a=n/100;
					b=((n%100)/10)*10;
					c=(n%100)%10;
					ET(a);
					ET(100);
					if(n%100<=20){
						ET(n%100);
					}else{
						if(b!=0){
							ET(b);
							if(c!=0){
								System.out.print("-");
								ET(c);
							}
						}else{
							System.out.print(" & ");
							if(c!=0){
								ET(c);
							}
						}
					}
				}
			}
			if(n>=1000&&n<=9999){
				if(n%1000==0){
					a=n/1000;
					ET(a);
					ET(1000);
				}else{
					a=n/1000;
					b=(n%1000)/100;
					c=((n%100)/10)*10;
					d=n%10;
					ET(a);
					ET(1000);
					if(b==0){
						System.out.print(" & ");
					}else{
						ET(b);
						ET(100);
					}
					if(c==0){
						if(b!=0&&d!=0){
							System.out.print(" & ");
						}
					}else{
						ET(c);
					}
					if(d!=0){
						if(c!=0){
							System.out.print("-");
						}
						ET(d);
					}
				}
			}			
		}
	}
	
	private static void ET(int a){
		switch(a){
		case 0:
			System.out.print("Zero");
			break;
		case 1:
			System.out.print("One");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Night");
			break;
		case 10:
			System.out.print("Ten");
			break;
		case 11:
			System.out.print("Eleven");
			break;
		case 12:
			System.out.print("Twelve");
			break;
		case 13:
			System.out.print("Thirteen");
			break;
		case 14:
			System.out.print("Fourteen");
			break;
		case 15:
			System.out.print("Fifteen");
			break;
		case 16:
			System.out.print("Sixteen");
			break;
		case 17:
			System.out.print("Seventeen");
			break;
		case 18:
			System.out.print("Eightteen");
			break;
		case 19:
			System.out.print("Nineteen");
			break;
		case 20:
			System.out.print("Twenty");
			break;
		case 30:
			System.out.print("Thirty");
			break;
		case 40:
			System.out.print("Fourty");
			break;
		case 50:
			System.out.print("Fifty");
			break;
		case 60:
			System.out.print("Sixty");
			break;
		case 70:
			System.out.print("Seventy");
			break;
		case 80:
			System.out.print("Eighty");
			break;
		case 90:
			System.out.print("Nighty");
			break;
		case 100:
			System.out.print(" hundred ");
			break;
		case 1000:
			System.out.print(" Thousand ");
			break;	
		}
	}
}
