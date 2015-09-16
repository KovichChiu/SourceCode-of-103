import java.util.Scanner;
public class Class_010 {
	/*
	 * 10. 迴文(palindrome)是指從前面讀和從後面讀都相同的一段文字. 請撰寫一個程式讀入一個字串,判斷它是否為迴文。
     *	         例如下列字串都是迴文:12321,AABBCCBBAA
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串文字 我將判斷他是不是迴文：");
		String a = scn.next();
		char[] b = a.toCharArray();
		int c = a.length();
		String e="";
		System.out.println("反向輸出為下：");
		for(int i =c-1;i>=0;i--){	
			e=e+b[i];
		}
		System.out.print(e);
		if(a.equals(e)){
			System.out.print("兩者相同！");
		}else{
			System.out.print("兩者不同！");
		}
	}
}
 //    另解<Sol>：
/*
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("請輸入一串文字 我將判斷他是不是迴文：");
       String str = scn.next();
       String str1 = new StringBuffer(str).reverse().toString();
       if(str.equals(str1)){
        System.out.print("迴文");
       }else{
           System.out.print("不是迴文");
       }
    }
}
*/ 