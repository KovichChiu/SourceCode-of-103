package test_期末專題;

public class testBox {
	private int [] [] box = new int [20] [10] ;
	public testBox(){
		//*將 20X10 的陣列歸零。
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				box[i][j] = 0;
			}
		}
	}
	public void setNumber(int i,int j,int n){
		box[i][j] = n;
	}
	public int getNumber(int i,int j){
		return box[i][j];
	}
	public boolean checkHor(int i,int j){
		boolean checkLine = true;
		for(int l=0;l<10;l++){
			if(box[i][l]==0){
				checkLine = false;
				break;
			}
		}
		return checkLine;
	}
	public void cleanLine(int i){
		for(int j=0;j<10;j++){
			box[i][j] = 0;
		}
	}
}
