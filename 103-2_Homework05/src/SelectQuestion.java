class SelectQuestion implements Complexity{
	private String Q,data [] = new String [4];
	int A;
	private int Level;
	public SelectQuestion(String q,int a){
		Q = q; A = a;
	}
	public void setSA(String a,String b,String c,String d){
		data[0]=a;
		data[1]=b;
		data[2]=c;
		data[3]=d;
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
	public int getA(){
		return A;
	}
	public String getAns(){
		return data[A];
	}
	public void getQItem(){
		for(int i=0;i<4;i++){
			System.out.println((i+1)+".  "+data[i]);
		}
	}
	public void getQItemRan(int [] dat){
		for(int i=0;i<data.length;i++){
			if(data[A].equals(data[dat[i]])){
				A=i;
				break;
			}
		}
		for(int i=0;i<data.length;i++){
			System.out.println((i+1)+".  "+data[dat[i]]);
		}
	}
}