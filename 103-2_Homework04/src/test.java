import java.util.ArrayList;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList <Student> ();
		while(true){
			System.out.println("�п�J�ǥͦW�١B�ǥͽs���B�������魫�C");
			Student student = new Student(scn.next(),scn.next());
			st.add(student);
			System.out.println("�٦���L�ǥͭn��J��?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){break;}
		}
		while(true){
			for(int i=0;i<st.size();i++){
				System.out.println("====�o�O��"+(i+1)+"��ǥͪ����====");
				st.get(i).Show();
				st.get(i).ShowCourse();
			}
			System.out.println("�H�W�O�_���ݭn�ק�?(Y/N)");
			String str = scn.next();
			if(str.equals("n") || str.equals("N")){
				break;
			}else{
				System.out.println("�аݬO�W��ǥ��٬O�ҵ{(1.�W��ǥ�     2.�W��ҵ{)");
				int n = scn.nextInt();
				if(n==1){
					System.out.println("�аݬO�W�[�٬O�R��?(1.�W�[  2.�R��)");
					int m = scn.nextInt();
					if(m==1){
						System.out.println("�п�J�ǥͦW�١B�ǥͽs���B�������魫�C");
						Student student = new Student(scn.next(),scn.next());
						st.add(student);
					}else{
						System.out.println("�R�����@�쪺���?");
						int num = scn.nextInt();
						st.remove(num-1);
					}
				}else{
					System.out.println("�аݬO�n��ʭ���ǥͪ��ҵ{?");
					int num = scn.nextInt();
					st.get(num-1).ShowCourse();
					System.out.println("�аݬO�n�W�[�ҵ{�٬O�R���ҵ{?(1. �W�[     2.�R��)");
					int m = scn.nextInt();
					if(m==1){
						System.out.println("�п�J�ҵ{�W�١B�ҵ{�s���B�Ǥ��H�Τ��ơC");
						st.get(num-1).addCourse(scn.next(),scn.next(),scn.nextInt(),scn.nextInt());
					}else{
						System.out.println("�аݭn�R�����@��?");
						int a = scn.nextInt();
						st.get(num-1).removeCourse(a-1);
					}
				}
			}
		}
	}

}
