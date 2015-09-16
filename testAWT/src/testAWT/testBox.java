package testAWT;
import java.util.Random;
import java.util.ArrayList;
public class testBox {
	private Random ran = new Random();
	private int [] [] box = new int [10] [20] ;
	private ArrayList <Integer> seat = new ArrayList <Integer> ();
	public testBox(){
		//*±N 10X20 ªº°}¦CÂk¹s¡C
		for(int i=0;i<10;i++){
			for(int j=0;j<20;j++){
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
	public boolean checkHor(int j){
		boolean checkLine = true;
		for(int l=0;l<10;l++){
			if(box[l][j]==0){
				checkLine = false;
				break;
			}
		}
		return checkLine;
	}
	public void cleanLine(int j){
		for(int i=0;i<10;i++){
			box[i][j] = 0;
		}
	}
	public int checkBottom(int i){
		boolean jujge = true;
		int j=19;
		while(jujge){
			if(box[i][j] != 0){
				jujge = false;
			}
			j--;
		}
		return j;
	}
	public void MakeNewBox(){
		int color = ran.nextInt(4)+1;
		int a = ran.nextInt(5);
		int b = 4-a;
		seat.add(a);
		seat.add(b);
		int a_i;
		int b_i;
		
		if(b > a){
			b_i = ran.nextInt(10);
			a_i = ran.nextInt(b);
			if(b_i<5){
				for(int i=0;i<b;i++){
					setNumber(b_i+i,1,color);
				}
				for(int i=0;i<a;i++){
					setNumber((b_i+a_i)+i,0,color);
				}
				seat.add(b_i+a_i);
				seat.add(b_i);
			}else{
				for(int i=0;i<b;i++){
					setNumber(b_i-i,1,color);
				}
				for(int i=0;i<a;i++){
					setNumber((b_i+a_i)-i,0,color);
				}
				seat.add((b_i+a_i)-(a-1));
				seat.add(b_i-(b-1));
			}
		}else{
			a_i = ran.nextInt(10);
			b_i = ran.nextInt(a);
			if(a_i<5){
				for(int i=0;i<a;i++){
					setNumber(a_i+i,0,color);
				}
				for(int i=0;i<b;i++){
					setNumber((b_i+a_i)+i,1,color);
				}
				seat.add(a_i);
				seat.add(a_i+b_i);
			}else{
				for(int i=0;i<a;i++){
					setNumber(a_i-i,0,color);
				}
				for(int i=0;i<b;i++){
					setNumber((b_i+a_i)-i,1,color);
				}
				seat.add(a_i-(a-1));
				seat.add(a_i+b_i-(b-1));
			}
		}
		seat.add(color);
		seat.add(0);
		seat.add(1);
	}
	
	public int getColor(int i,int j){
		return box[i][j];
	}
	public int getseat(int i){
		return seat.get(i);
	}
	public void DeleteArrayList(){
		seat.clear();
	}
	public int adda_j(){
		int n = seat.get(5);
		n++;
		seat.remove(5);
		seat.add(4, n);
		return seat.get(5);
	}
	public int addb_j(){
		int n = seat.get(6);
		n++;
		seat.remove(6);
		seat.add(5, n);
		return seat.get(6);
	}
}
