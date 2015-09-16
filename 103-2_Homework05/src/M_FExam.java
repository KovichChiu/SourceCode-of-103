import java.util.ArrayList;

class M_FExam extends Exam{
	private ArrayList <Question> QList = new ArrayList <Question>();
	private ArrayList <YNQuestion> YNQList = new ArrayList <YNQuestion>();
	private ArrayList <SelectQuestion> SQList = new ArrayList <SelectQuestion>();
	public void addQ(String q,String a){
		QList.add(new Question(q,a));
	}
	public void setComplexity(int n,int v1){
		QList.get(n).setComplexity(v1);
	}
	public String getQ(int n){
		return QList.get(n).getQ();
	}
	public int getQNum(){
		return QList.size();
	}
	public boolean checkA(int n,String str){
		return str.equals(QList.get(n).getA());
	}
	public void addYNQ(String q,String a1,String a2){
		YNQList.add(new YNQuestion(q,a1,a2));
	}
	public void setYNComplexity(int n,int v1){
		YNQList.get(n).setComplexity(v1);
	}
	public String getYNQ(int n){
		return YNQList.get(n).getQ();
	}
	public String getYNA(int n){
		return YNQList.get(n).getA();
	}
	public int getYNQNum(){
		return YNQList.size();
	}
	public boolean checkYNA(int n,String str){
		YNQList.get(n).getA();
		char [] data = YNQList.get(n).getA().toCharArray();
		String str1 = String.valueOf(data[0]);
		String str2 = String.valueOf(data[1]);
		return str.equals(str1) || str.equals(str2);
	}
	public void addSQ(String q,int a){
		SQList.add(new SelectQuestion(q,a));
	}
	public void setQA(int n,String a,String b,String c,String d){
		SQList.get(n).setSA(a, b, c, d);
	}
	public void setSComplexity(int n,int v1){
		SQList.get(n).setComplexity(v1);
	}
	public String getSQ(int n){
		return SQList.get(n).getQ();
	}
	public int getSQNum(){
		return SQList.size();
	}
	public int getSA(int n){
		return SQList.get(n).getA();
	}
	public String getSAns(int n){
		return SQList.get(n).getAns();
	}
	public void getSQItem(int n){
		SQList.get(n).getQItem();
	}
	public void getSQItemRan(int n,int data []){
		SQList.get(n).getQItemRan(data);
	}
	public boolean checkSA(int n,int i){
		return i==getSA(n);
	}
}