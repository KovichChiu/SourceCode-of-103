import java.util.Scanner;
public class HW {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Юv�H�ơG");
		int tNum=scn.nextInt();
		Dr [] teacher = new Dr [tNum];
		String [] classname = {"�ҵ{�s���G","�ҵ{�W�١G","�׽ҤH�ơG"};
		for(int i=0;i<tNum;i++){
			System.out.println("�п�J¾�s�B�Юv�m�W�B�½ҼơB�ǰ|�B�Ǩt�C");
			teacher[i] = new Dr(scn.next(),scn.next(),scn.nextInt(),scn.next(),scn.next());
		}
		while(true){
			System.out.print("�п�J���d�ߪ����ءC\n1.�ǰ|�Юv    2.�Ǩt�Юv    3.�S�w�Юv��T �G");
			int X = scn.nextInt();
			if(X==1){
				System.out.println("�п�J���d�ߪ��ǰ|�G");
				String strCo = scn.next();
				for(int i=0;i<tNum;i++){
					if((teacher[i].College).equals(strCo)){
						System.out.print(teacher[i].ID+"\n"
								+teacher[i].Name+"\n"+
								teacher[i].College+"\n"+
								teacher[i].Department);
					}
				}
			}
			if(X==2){
				System.out.println("�п�J���d�ߪ��Ǩt�G");
				String strDe = scn.next();
				for(int i=0;i<tNum;i++){
					if((teacher[i].Department).equals(strDe)){
						System.out.print(teacher[i].ID+"\n"
								+teacher[i].Name+"\n"+
								teacher[i].College+"\n"+
								teacher[i].Department);
					}
				}
			}
			if(X==3){
				System.out.println("�п�J���d�ߪ��Юv�G");
				String strName = scn.next();
				for(int i=0;i<tNum;i++){
					String str [][] = teacher[i].getCourse();
					if((teacher[i].Name).equals(strName)){
						System.out.print("¾�s�G"+teacher[i].ID+"\n�m�W�G"
								+teacher[i].Name+"\n���ݾǰ|�G"+
								teacher[i].College+"\n���ݾǨt�G"+
								teacher[i].Department+"\n");
						for(int j=0;j<teacher[i].Time;j++){
							for(int k=0;k<3;k++){
								System.out.print(classname[k]+str [j][k]+"\t");
							}
							System.out.println();
						}
					}
				}
			}
			System.out.print("�аݬO�_�~��?(Y/N)");
			String jujge = scn.next();
			if(jujge.equals("N"))break;
		}
	}
}
class Dr{
	String ID,Name,College,Department;
	int Time;
	String [][] course;
	public Dr(String tID,String tName,int tTime,String tCollege,String tDepartment){
		ID=tID;
		Name=tName;
		Time=tTime;
		College=tCollege;
		Department=tDepartment;
		course = new String [Time][3];
		setCourse();
	}
	public String[][] getCourse(){
		return course;
	}
	public void setCourse() {
		Scanner scn = new Scanner(System.in);
		int num = course.length;
		for(int i=0;i<num;i++){
			System.out.println("�ШϥΪ̿�J�ҵ{�s���B�ҵ{�W�١B�׽ҤH�ơC");
			course [i][0]=scn.next();
			course [i][1]=scn.next();
			course [i][2]=scn.next();
		}
	}
}