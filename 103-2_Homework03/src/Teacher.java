import java.util.ArrayList;
class Teacher extends Person{
	private String Research,Degree;
	ArrayList<Course>course = new ArrayList<Course>();
	public Teacher(String TName){
		super(TName);
		setResearch();
		setDegree();
		setCourse();
	}
	public void setCourse(){
		System.out.println("�п�J�½ҦW��");
		Course C = new Course(scn.next());
		course.add(C);
		System.out.println("�O�_�٦���L�ҵ{?(Y/N)");
		String str = scn.next();
		if(str.equals("y") || str.equals("Y"))
			setCourse();
	}
	public void setResearch(){
		System.out.println("�п�J��s���");
		Research = scn.next();
	}
	public void setDegree(){
		System.out.println("�п�J�Ǧ�");
		Degree = scn.next();
	}
	public void ShowCourse(){
		System.out.println("========== �½Ҹ�� ==========");
		for(int i=1;i<=course.size();i++){
			System.out.println("�w ��"+i+"���� �w");
			System.out.println(course.get(i-1).Show());
			System.out.println("==========================\n");
		}
	}
	public String ShowInf(){
		return "��s���G"+Research+"\t"+"�Ǧ�G"+Degree;
	}
}