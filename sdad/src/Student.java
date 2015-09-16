import java.util.ArrayList;

class Student extends Person{
	private ArrayList <Course> courses = new ArrayList <Course> ();
	public Student(String Name ,String ID){
		super(Name,ID);
		while(true){
		System.out.println("請輸入課程名稱、課程編號、學分以及分數。");
		addCourse(scn.next(),scn.next(),scn.nextInt(),scn.nextInt());
		System.out.println("是否還有其他課程要輸入?(Y/N)");
		String str = scn.next();
		if(str.equals("N") || str.equals("n")){break;}
		}
	}
	public void addCourse(String Name,String ID,int Points,int Score){
		Course c = new Course(Name,ID,Points,Score);
		courses.add(c);
	}
	public void removeCourse(int n){
		courses.remove(n);
	}
	public void ShowCourse(){
		System.out.println("================修課資料================");
		for(Course c : courses){
			System.out.println(c.CName+"("+c.CID+")  學分："+c.CPoint+"\t分數："+c.CScore);
		}
		System.out.println("=====================================");
	}
	
	public class Course{
		private String CName,CID;
		private int CPoint,CScore;
		public Course(String Name,String ID,int Point,int Score){
			CName = Name;CID = ID;CPoint = Point;CScore = Score;
		}
		public void setName(String Name){CName = Name;}
		public void setID(String ID){CID = ID;}
		public void setPoint(int Point){CPoint = Point;}
		public void setScore(int Score){CScore = Score;}
		public String getName(){return CName;}
		public String getID(){return CID;}
		public int getPoint(){return CPoint;}
		public int getScore(){return CScore;}
	}
}