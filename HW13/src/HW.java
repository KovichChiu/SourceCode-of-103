import java.util.Scanner;
public class HW {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入教師人數：");
		int tNum=scn.nextInt();
		Dr [] teacher = new Dr [tNum];
		String [] classname = {"課程編號：","課程名稱：","修課人數："};
		for(int i=0;i<tNum;i++){
			System.out.println("請輸入職編、教師姓名、授課數、學院、學系。");
			teacher[i] = new Dr(scn.next(),scn.next(),scn.nextInt(),scn.next(),scn.next());
		}
		while(true){
			System.out.print("請輸入欲查詢的項目。\n1.學院教師    2.學系教師    3.特定教師資訊 ：");
			int X = scn.nextInt();
			if(X==1){
				System.out.println("請輸入欲查詢的學院：");
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
				System.out.println("請輸入欲查詢的學系：");
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
				System.out.println("請輸入欲查詢的教師：");
				String strName = scn.next();
				for(int i=0;i<tNum;i++){
					String str [][] = teacher[i].getCourse();
					if((teacher[i].Name).equals(strName)){
						System.out.print("職編："+teacher[i].ID+"\n姓名："
								+teacher[i].Name+"\n所屬學院："+
								teacher[i].College+"\n所屬學系："+
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
			System.out.print("請問是否繼續?(Y/N)");
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
			System.out.println("請使用者輸入課程編號、課程名稱、修課人數。");
			course [i][0]=scn.next();
			course [i][1]=scn.next();
			course [i][2]=scn.next();
		}
	}
}