import java.util.*;
public class �Ѯv_Part1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Teacher>teacher = new ArrayList<Teacher>();
		while(true){
			System.out.println("�п�J�бª��W�l");
			Teacher T = new Teacher(scn.next());
			teacher.add(T);
			System.out.println("�O�_�٦���L�б­n��J?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n"))
				break;
		}
		while(true){
			System.out.println("�H�U���A���ҿ�J���Ҧ���ơC");
			for(int i=1;i<=teacher.size();i++){
				System.out.println("��"+i+"��б�");
				System.out.println(teacher.get(i-1).Show()+"\n"+teacher.get(i-1).ShowInf());
				teacher.get(i-1).ShowCourse();
			}
			System.out.println("�H�U�O�_����?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){
				break;
			}else{
				System.out.println("�аݬO���@��X��?(1.�б³���     2.�½ҳ���)");
				str = scn.next();
				if(str.equals("1")){
					System.out.println("�аݬO�n�W�[�٬O�R���б©O?(1.�W�[     2.�R��)");
					str = scn.next();
					if(str.equals("1")){
						System.out.println("�п�J�бª��W�l");
						Teacher T = new Teacher(scn.next());
						teacher.add(T);
						System.out.println("�W�[����!");
					}else{
						System.out.println("�аݭn�R���ĴX��б�?");
						int n = scn.nextInt();
						teacher.remove(n-1);
						System.out.println("�R������!");
					}
				}else{
					System.out.println("�аݬO���@��бª��Ҧ����~�O?");
					int n = scn.nextInt();
					System.out.println("�H�U���ӱбª��Ҧ���ơC");
					System.out.println(teacher.get(n-1).Show()+"\n"+teacher.get(n-1).ShowInf());
					teacher.get(n-1).ShowCourse();
					System.out.println("�аݬO�n�W�[�B�R���׽ҩάO�б¸�ƭק�?(1.�W�[�½�     2.�R���½�     3.�б¸�ƭק�)");
					str = scn.next();
					if(str.equals("1")){
						teacher.get(n-1).setCourse();						
						System.out.println("�W�[����!");
					}
					else if(str.equals("2")){
						System.out.println("�аݬO�n�R�����@���ҩO?");
						int m = scn.nextInt();
						teacher.get(n-1).course.remove(m-1);
						System.out.println("�R������!");
					}
					else if(str.equals("3")){
						System.out.println("�аݭn�ק�бª��ƻ���?(1.�m�W     2.�s��     3.����     4.�魫     5.��s���     6.�Ǧ�)");
						int m = scn.nextInt();
						if(m==1){
							teacher.get(n-1).setName();
							System.out.println("�]�w����!");
						}
						else if(m==2){
							teacher.get(n-1).setID();
							System.out.println("�]�w����!");
						}
						else if(m==3){
							teacher.get(n-1).setHight();
							System.out.println("�]�w����!");
						}
						else if(m==4){
							teacher.get(n-1).setWeight();
							System.out.println("�]�w����!");
						}
						else if(m==5){
							teacher.get(n-1).setResearch();
							System.out.println("�]�w����!");
						}
						else if(m==6){
							teacher.get(n-1).setDegree();
							System.out.println("�]�w����!");
						}
					}
				}
			}
		}
	}
}