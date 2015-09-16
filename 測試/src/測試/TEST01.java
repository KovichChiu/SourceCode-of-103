package ด๚ธี;

import java.util.Random;

public class TEST01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[][] data = new int[4][4];
		int[][] data_code = new int[8][8];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				data[i][j] = ran.nextInt(10)+1;
			}
		}
		int i = 0;
		int j = 0;
		while (i < 4) {
			while (j < 4) {
				if (i - 1 >= 0) {
					data_code[i*2][j*2] = data[i][j] - data[i-1][j];
				}
				if (j - 1 >= 0) {
					data_code[(i*2)+1][j*2] = data[i][j] - data[i][j-1];
				}
				if (i + 1 < 4) {
					data_code[i*2][(j*2)+1] = data[i][j] - data[i+1][j];
				}
				if (j + 1 < 4) {
					data_code[(i*2)+1][(j*2)+1] = data[i][j] - data[i][j+1];
				}
				j++;
			}
			i++;
			j=0;
		}
		for(int h=0;h<4;h++){
			for(int w=0;w<4;w++){
				System.out.print(data[h][w]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int h=0;h<8;h++){
			for(int w=0;w<8;w++){
				System.out.print(data_code[h][w]+"\t");
			}
			System.out.println();
		}
	}
}
