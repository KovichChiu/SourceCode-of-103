import java.util.ArrayList;

class Quiz extends Exam{
	private ArrayList <Question> QList = new ArrayList <Question>();
	public void addQ(String question,String answer){
		QList.add(new Question(question,answer));
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
}
