import java.util.Scanner;
public class Class_010 {
	/*
	 * 10. �j��(palindrome)�O���q�e��Ū�M�q�᭱Ū���ۦP���@�q��r. �м��g�@�ӵ{��Ū�J�@�Ӧr��,�P�_���O�_���j��C
     *	         �Ҧp�U�C�r�곣�O�j��:12321,AABBCCBBAA
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@���r �ڱN�P�_�L�O���O�j��G");
		String a = scn.next();
		char[] b = a.toCharArray();
		int c = a.length();
		String e="";
		System.out.println("�ϦV��X���U�G");
		for(int i =c-1;i>=0;i--){	
			e=e+b[i];
		}
		System.out.print(e);
		if(a.equals(e)){
			System.out.print("��̬ۦP�I");
		}else{
			System.out.print("��̤��P�I");
		}
	}
}
 //    �t��<Sol>�G
/*
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("�п�J�@���r �ڱN�P�_�L�O���O�j��G");
       String str = scn.next();
       String str1 = new StringBuffer(str).reverse().toString();
       if(str.equals(str1)){
        System.out.print("�j��");
       }else{
           System.out.print("���O�j��");
       }
    }
}
*/ 