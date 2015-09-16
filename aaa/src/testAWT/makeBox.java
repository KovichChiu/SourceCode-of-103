package testAWT;
import java.util.Random;
import java.util.ArrayList;
public class makeBox {
	int x;
	int Color;
	turnbox T = new turnbox();
	ArrayList <Integer> arr_i = new ArrayList<Integer>();
	ArrayList <Integer> arr_j = new ArrayList<Integer>();
	private Random ran = new Random();
	
	public makeBox(){
		T = new turnbox();
		arr_i.clear();
		arr_j.clear();
		x = ran.nextInt(7)+1;
		System.out.println("x="+x);
		Color = x;
		chooseBox(x);
	}
	public void chooseBox(int n){
		switch(n){
		case 1:
			for(int i=0;i<4;i++){
				arr_i.add(3+i);
				arr_j.add(0);
			}
			break;
		case 2:
			arr_i.add(3);
			arr_j.add(0);
			for(int i=0;i<3;i++){
				arr_i.add(3+i);
				arr_j.add(1);
			}
			break;
		case 3:
			for(int i=0;i<3;i++){
				arr_i.add(3+i);
				arr_j.add(1);
			}
			arr_i.add(5);
			arr_j.add(0);
			break;
		case 4:
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					arr_i.add(4+j);
					arr_j.add(i);
				}
			}
			break;
		case 5:
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					arr_i.add(3+i+j);
					arr_j.add(i);
				}
			}
			break;
		case 6:
			for(int i=1;i>=0;i--){
				for(int j=0;j<2;j++){
					arr_i.add(4-i+j);
					arr_j.add(i);
				}
			}
			break;
		case 7:
			for(int i=0;i<3;i++){
				arr_i.add(3+i);
				arr_j.add(1);
			}
			arr_i.add(4);
			arr_j.add(0);
			break;
		}
	}
	
	public void turnBox(int []a,int []b,int times){
		switch(times){
		case 0:
			T.turn_1(a, b, x);
			break;
		case 1:
			T.turn_2(a, b, x);
			break;
		case 2:
			T.turn_3(a, b, x);
			break;
		case 3:
			T.turn_4(a, b, x);
			break;
		}
		changeSeat();
	}
	public void changeSeat(){
		arr_i.clear();
		arr_j.clear();
		for(int i=0;i<4;i++){
			arr_i.add(T.iarr.get(i));
			arr_j.add(T.jarr.get(i));
		}
	}
}
