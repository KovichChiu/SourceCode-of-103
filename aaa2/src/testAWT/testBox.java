package testAWT;

import java.util.Random;
import java.util.ArrayList;

public class testBox {
	private Random ran = new Random();
	private int Color;
	private int times = 1;
	private int[][] box = new int[10][20];
	private int [] i_seat = new int [4];
	private int [] j_seat = new int [4];
	ArrayList<Integer> arrRemem = new ArrayList<Integer>();
	private int sametimeClean = 0;
	private int Score = 0;
	private makeBox newBox;
	private boolean gamekeep = true;
	
	public testBox() {
		// *±N 10X20 ªº°}¦CÂk¹s¡C
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				box[i][j] = 0;
			}
		}
	}

	public void setNumber(int i, int j, int n) {
		box[i][j] = n;
	}

	public int getColor(int i, int j) {
		return box[i][j];
	}
	
	public boolean checklimit(){
		boolean jujge = true;
		if(arrRemem.get(5) == 19){
			jujge = false;
		}
		return jujge;
	}
	
	public void checkHor() {
		boolean checkLine;
		for(int i=0;i<4;i++){
			checkLine = true;
			for(int j=0;j<10;j++){
				if(box[j][j_seat[i]]==0){
					checkLine = false;
				}
			}
			if(checkLine){
				sametimeClean++;
				cleanLine(j_seat[i]);
			}
		}
		getScore();
		
	}
	public void getScore(){
		
		int x = 0;
		switch(sametimeClean){
		case 0:
			x = 0;
			break;
		case 1:
			x = 25;
			break;
		case 2:
			x = 40;
			break;
		case 3:
			x = 65;
			break;
		case 4:
			x = 100;
			break;
		}
		Score+=x;
	}
	
	public int returnScore(){
		return Score;
	}

	public void cleanLine(int j) {
		for (int i = 0; i < 10; i++) {
			box[i][j] = 0;
		}
		for(int i=0;i<10;i++){
			int [] data = new int [j];
			for(int h=j-1;h>=0;h--){
				data[h] = box[i][h];
				box[i][h] = 0;
				box[i][h+1] = data[h]; 
			}
		}
	}
	
	public void speceBox(){
		boolean jujge = Downtouch();
		while (jujge) {
			BoxDown();
			jujge = Downtouch();
		}
	}
	
	public boolean gamestop(){
		return gamekeep;
	}
	
	public void MakeNewBox() {
		sametimeClean = 0;
		newBox = new makeBox();
		times = 1;
		Color = newBox.Color;
		gamekeep = true;
		for (int i = 0; i < 4; i++) {
			if (box[newBox.arr_i.get(i)][newBox.arr_j.get(i)] != 0) {
				gamekeep = false;
			}
		}
		if (gamekeep) {
			for (int i = 0; i < 4; i++) {
				i_seat[i] = newBox.arr_i.get(i);
				j_seat[i] = newBox.arr_j.get(i);
			}
			for (int i = 0; i < 4; i++) {
				box[i_seat[i]][j_seat[i]] = Color;
			}
		}
	}
	
	public void turnBox(){
		newBox.turnBox(i_seat, j_seat, times);
		times++;
		if(times == 5){times = 1;}
		for(int i=0;i<4;i++){
			box[i_seat[i]][j_seat[i]] = 0;
			i_seat[i] = newBox.arr_i.get(i);
			j_seat[i] = newBox.arr_j.get(i);
		}
		for(int i=0;i<4;i++){
			box[i_seat[i]][j_seat[i]] = Color;
		}
	}
	
	public void BoxDown(){
		for(int i=0;i<4;i++){
			box[i_seat[i]][j_seat[i]] = 0;
		}
		for(int i=0;i<4;i++){
			j_seat[i]++;
			box[i_seat[i]][j_seat[i]] = Color;
		}
	}
	
	public void BoxRight(){
		for(int i=0;i<4;i++){
			box[i_seat[i]][j_seat[i]] = 0;
		}
		for(int i=0;i<4;i++){
			i_seat[i]++;
			box[i_seat[i]][j_seat[i]] = Color;
		}
	}
	
	public void BoxLeft(){
		for(int i=0;i<4;i++){
			box[i_seat[i]][j_seat[i]] = 0;
		}
		for(int i=0;i<4;i++){
			i_seat[i]--;
			box[i_seat[i]][j_seat[i]] = Color;
		}
	}
	
	public boolean Turntouch(){
		boolean jujge = true;
		
		return jujge;
	}
	
	public boolean Righttouch(){
		boolean jujge = true;
		int min_j = 0;
		for(int i=0;i<4;i++){
			if(min_j<i_seat[i]){
				min_j = i_seat[i];
			}
		}
		for(int i=0;i<4;i++){
			if(min_j == 9){
				jujge = false;
			}
			if(jujge && box[i_seat[i]+1][j_seat[i]]!=0 && box[i_seat[i]+1][j_seat[i]]!=Color){
				jujge = false;
			}
		}
		if(!jujge){
			Color+=7;
			for(int i=0;i<4;i++){
				box[i_seat[i]][j_seat[i]] = Color;
			}
		}
		return jujge;
	}
	
	public boolean Lefttouch() {
		boolean jujge = true;
		int min_j = 9;
		for(int i=0;i<4;i++){
			if(min_j>i_seat[i]){
				min_j = i_seat[i];
			}
		}
		for(int i=0;i<4;i++){
			if(min_j <= 0){
				jujge = false;
			}
			if(jujge && box[i_seat[i]-1][j_seat[i]]!=0 && box[i_seat[i]-1][j_seat[i]]!=Color){
				jujge = false;
			}
		}
		if(!jujge){
			Color+=7;
			for(int i=0;i<4;i++){
				box[i_seat[i]][j_seat[i]] = Color;
			}
		}
		return jujge;
	}
	
	public boolean Downtouch(){
		boolean jujge = true;
		int max_j = 0;
		for(int i=0;i<4;i++){
			if(max_j<j_seat[i]){
				max_j = j_seat[i];
			}
		}
		for(int i=0;i<4;i++){
			if(max_j == 19){
				jujge = false;
			}
			if(jujge && box[i_seat[i]][j_seat[i]+1]!=0 && box[i_seat[i]][j_seat[i]+1]!=Color){
				jujge = false;
			}
		}
		
		return jujge;
	}
	
	public void stopChengeColor(){
		if (Color + 7 <= 14) {
			Color += 7;
		}
		for (int i = 0; i < 4; i++) {
			box[i_seat[i]][j_seat[i]] = Color;
		}
	}
}
