import java.util.Random;
public class Class_023 {

	/*
	 * 23. �üƲ��ͤT��1~100��������ƶüơA�P�_�ÿ�X�T�Ƥ����̤j�Ȥγ̤p�ȡC
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int [] a = new int [3];
			int amax = 0;
			int amin = 100;
		for(int i = 0;i<3;i++){
			a[i]=ran.nextInt(100)+1;
			System.out.println(a[i]);
			if(amax<a[i]){
				amax=a[i];
			}
			if(amin>a[i]){
				amin=a[i];
			}
		}
		System.out.print("�̤p�ȡG"+amin+"\t"+"�̤j�ȡG"+amax);
	}

}
