class Question implements Complexity{
	private String Q,A;
	private int Level;
	public Question(String q, String a){
		Q = q; 
		A = a;
	}
	public void setComplexity(int n){
		Level = n;
	}
	public int getComplexity(){
		return Level;
	}
	public String getQ(){
		return Q;
	}
	public String getA(){
		return A;
	}
}
