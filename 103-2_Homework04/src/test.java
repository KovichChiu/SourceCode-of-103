import java.util.ArrayList;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList <Student> ();
		while(true){
			System.out.println("請輸入學生名稱、學生編號、身高及體重。");
			Student student = new Student(scn.next(),scn.next());
			st.add(student);
			System.out.println("還有其他學生要輸入嗎?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){break;}
		}
		while(true){
			for(int i=0;i<st.size();i++){
				System.out.println("====這是第"+(i+1)+"位學生的資料====");
				st.get(i).Show();
				st.get(i).ShowCourse();
			}
			System.out.println("以上是否有需要修改?(Y/N)");
			String str = scn.next();
			if(str.equals("n") || str.equals("N")){
				break;
			}else{
				System.out.println("請問是增減學生還是課程(1.增減學生     2.增減課程)");
				int n = scn.nextInt();
				if(n==1){
					System.out.println("請問是增加還是刪除?(1.增加  2.刪除)");
					int m = scn.nextInt();
					if(m==1){
						System.out.println("請輸入學生名稱、學生編號、身高及體重。");
						Student student = new Student(scn.next(),scn.next());
						st.add(student);
					}else{
						System.out.println("刪除哪一位的資料?");
						int num = scn.nextInt();
						st.remove(num-1);
					}
				}else{
					System.out.println("請問是要更動哪位學生的課程?");
					int num = scn.nextInt();
					st.get(num-1).ShowCourse();
					System.out.println("請問是要增加課程還是刪除課程?(1. 增加     2.刪除)");
					int m = scn.nextInt();
					if(m==1){
						System.out.println("請輸入課程名稱、課程編號、學分以及分數。");
						st.get(num-1).addCourse(scn.next(),scn.next(),scn.nextInt(),scn.nextInt());
					}else{
						System.out.println("請問要刪除哪一項?");
						int a = scn.nextInt();
						st.get(num-1).removeCourse(a-1);
					}
				}
			}
		}
	}

}
