package testAWT;

import java.util.ArrayList;

public class turnbox {
	ArrayList<Integer> iarr;
	ArrayList<Integer> jarr;

	public turnbox() {
		iarr = new ArrayList<Integer>();
		jarr = new ArrayList<Integer>();
	}

	public void turn_1(int[] a, int[] b, int n) {
		int d = a[2];
		int f = b[2];
		if (n != 4) {
			iarr.clear();
			jarr.clear();
		}
		switch (n) {
		case 1:
			for (int i = -2; i < 2; i++) {
				iarr.add(i + d);
				jarr.add(f);
			}
			break;
		case 2:
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d + 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f);
			break;
		case 3:
			d = a[1];
			f = b[1];
			iarr.add(d + 1);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d + 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f);
			break;
		case 4:
			break;
		case 5:
			iarr.add(d - 2);
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			break;
		case 6:
			d = a[2];
			f = b[2];
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d - 1);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
		case 7:
			d = a[1];
			f = b[1];
			iarr.add(d);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d + 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f);
			break;
		}
		for(int i=0;i<4;i++){
			if(iarr.get(i)>9 || iarr.get(i)<0 || jarr.get(i)>19 || jarr.get(i)<0){
				iarr.clear();
				jarr.clear();
				break;
			}
		}
	}

	public void turn_2(int[] a, int[] b, int n) {
		int d = a[2];
		int f = b[2];
		if (n != 4) {
			iarr.clear();
			jarr.clear();
		}
		switch (n) {
		case 1:
			for (int i = -2; i < 2; i++) {
				iarr.add(d);
				jarr.add(i + f);
			}
			break;
		case 2:
			iarr.add(d);
			iarr.add(d);
			iarr.add(d - 1);
			iarr.add(d);
			jarr.add(f - 2);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			break;
		case 3:
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d);
			iarr.add(d);
			jarr.add(f - 2);
			jarr.add(f - 2);
			jarr.add(f - 1);
			jarr.add(f);
			break;
		case 4:
			break;
		case 5:
			iarr.add(d);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d - 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		case 6:
			d = a[3];
			f = b[3];
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
		case 7:
			iarr.add(d);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		}
		for(int i=0;i<4;i++){
			if(iarr.get(i)>9 || iarr.get(i)<0 || jarr.get(i)>19 || jarr.get(i)<0){
				iarr.clear();
				jarr.clear();
				break;
			}
		}
	}

	public void turn_3(int[] a, int[] b, int n) {
		int d = a[2];
		int f = b[2];
		if (n != 4) {
			iarr.clear();
			jarr.clear();
		}
		switch (n) {
		case 1:
			for (int i = -2; i < 2; i++) {
				iarr.add(i + d);
				jarr.add(f);
			}
			break;
		case 2:
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d + 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		case 3:
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		case 4:
			break;
		case 5:
			iarr.add(d - 2);
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			break;
		case 6:
			d = a[2];
			f = b[2];
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d - 1);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
		case 7:
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		}
		for(int i=0;i<4;i++){
			if(iarr.get(i)>9 || iarr.get(i)<0 || jarr.get(i)>19 || jarr.get(i)<0){
				iarr.clear();
				jarr.clear();
				break;
			}
		}
	}

	public void turn_4(int[] a, int[] b, int n) {
		int d = a[1];
		int f = b[1];
		if (n != 4) {
			iarr.clear();
			jarr.clear();
		}
		switch (n) {
		case 1:
			d = a[2];
			f = b[2];
			for (int i = -2; i < 2; i++) {
				iarr.add(d);
				jarr.add(i + f);
			}
			break;
		case 2:
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d);
			iarr.add(d);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			jarr.add(f + 2);
			break;
		case 3:
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f + 1);
			jarr.add(f + 1);
			break;
		case 4:
			break;
		case 5:
			d = a[2];
			f = b[2];
			iarr.add(d);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d - 1);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		case 6:
			d = a[2];
			f = b[2];
			iarr.add(d - 1);
			iarr.add(d - 1);
			iarr.add(d);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
		case 7:
			iarr.add(d);
			iarr.add(d);
			iarr.add(d + 1);
			iarr.add(d);
			jarr.add(f - 1);
			jarr.add(f);
			jarr.add(f);
			jarr.add(f + 1);
			break;
		}
		for(int i=0;i<4;i++){
			if(iarr.get(i)>9 || iarr.get(i)<0 || jarr.get(i)>19 || jarr.get(i)<0){
				iarr.clear();
				jarr.clear();
				break;
			}
		}
	}
}
