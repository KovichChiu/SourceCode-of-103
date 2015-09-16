class YNQuestion implements Complexity{
	private String Q,A1,A2;
	private int Level;
	public YNQuestion(String q,String a1,String a2){
		Q = q; A1 = a1; A2 = a2;
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
		return A1+A2;
	}
}