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
		System.out.println("請輸入授課名稱");
		Course C = new Course(scn.next());
		course.add(C);
		System.out.println("是否還有其他課程?(Y/N)");
		String str = scn.next();
		if(str.equals("y") || str.equals("Y"))
			setCourse();
	}
	public void setResearch(){
		System.out.println("請輸入研究領域");
		Research = scn.next();
	}
	public void setDegree(){
		System.out.println("請輸入學位");
		Degree = scn.next();
	}
	public void ShowCourse(){
		System.out.println("========== 授課資料 ==========");
		for(int i=1;i<=course.size();i++){
			System.out.println("─ 第"+i+"門課 ─");
			System.out.println(course.get(i-1).Show());
			System.out.println("==========================\n");
		}
	}
	public String ShowInf(){
		return "研究領域："+Research+"\t"+"學位："+Degree;
	}
}