import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("1.�p��");
		System.out.println("2.������");
		System.out.println("3.������");
		System.out.println("4.������");
		System.out.println("�п�J�Ʀr�ﶵ�C");
		int Choose = scn.nextInt();
		if(Choose == 1){
			int Corrcount=0;
			Quiz q1=new Quiz();
			q1.addQ("interface������H", "����");
			q1.addQ("implement������H","��@");
			q1.setComplexity(0, 1);
			int num = q1.getQNum();
			for(int i=0;i<num;i++){
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(q1.getQ(i));
				String str = scn.next();
				if(q1.checkA(i, str)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
			System.out.println("�`�@����"+Corrcount+"�D��~");
		}
		else if(Choose == 2 || Choose == 3){
			int Corrcount=0;
			M_FExam mf1 = new M_FExam();
			mf1.addQ("interface������H", "����");
			mf1.addQ("implement������H","��@");
			mf1.addYNQ("�P�ѬO���O�ܷ|��?","Y","y");
			mf1.addYNQ("�P�ѬO���O�ӫӪ�?","Y","y");
			mf1.addYNQ("���īܫ�?","N","n");
			mf1.addSQ("�U�C��̬Ogoogle��½Ķ?",0);
			mf1.setQA(0, "���q", "����", "����", "����");
			mf1.setComplexity(0, 1);
			int Qnum = mf1.getQNum();
			System.out.println("²���D�C");
			for(int i=0;i<Qnum;i++){	
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(mf1.getQ(i));
				String str = scn.next();
				if(mf1.checkA(i, str)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
			int YNQnum = mf1.getYNQNum();
			System.out.println("�O�D�D�C");
			for(int i=0;i<YNQnum;i++){	
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(mf1.getYNQ(i));
				String str = scn.next();
				if(mf1.checkYNA(i, str)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
			int SQnum = mf1.getSQNum();
			System.out.println("����D�C");
			for(int i=0;i<SQnum;i++){	
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(mf1.getSQ(i));
				mf1.getSQItem(i);
				int str = scn.nextInt();
				if(mf1.checkSA(i, str-1)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
		}	
		else if(Choose == 4){
			int Corrcount=0;
			M_FExam mf1 = new M_FExam();
			mf1.addQ("interface������H", "����");
			mf1.addQ("implement������H","��@");
			mf1.addYNQ("�P�ѬO���O�ܷ|��?","Y","y");
			mf1.addYNQ("�P�ѬO���O�ӫӪ�?","Y","y");
			mf1.addYNQ("���īܫ�?","N","n");
			mf1.addSQ("�U�C��̬Ogoogle��½Ķ?",0);
			mf1.setQA(0, "���q", "����", "����", "����");
			mf1.addSQ("�U�C��̬Osupport��½Ķ?",0);
			mf1.setQA(1, "���U", "���n", "����", "���}");
			mf1.addSQ("�p�Ҳr�r��?", 0);
			mf1.setQA(2, "�O��", "���O", "�@�I�]��", "������");
			mf1.setComplexity(0, 1);
			int Qnum = mf1.getQNum();
			System.out.println("²���D�C");
			for(int i=0;i<Qnum;i++){	
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(mf1.getQ(i));
				String str = scn.next();
				if(mf1.checkA(i, str)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
			int YNQnum = mf1.getYNQNum();
			System.out.println("�O�D�D�C");
			for(int i=0;i<YNQnum;i++){	
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(mf1.getYNQ(i));
				String str = scn.next();
				if(mf1.checkYNA(i, str)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
			int SQnum = mf1.getSQNum();
			System.out.println("����D�C");
			for(int i=0;i<SQnum;i++){
				int [] sequence = new int [4];
				for(int h=0;h<4;h++){
					sequence[h] = ran.nextInt(4);
					for(int j=h-1;j>=0;j--){
						if(sequence[j]==sequence[h]){
							h--;
							break;
						}
					}
				}
				System.out.print("��"+(i+1)+"�D�G");
				System.out.println(mf1.getSQ(i));
				mf1.getSQItemRan(i,sequence);
				int str = scn.nextInt();
				if(mf1.checkSA(i, str-1)){
					System.out.println("���߱z����F~");
					Corrcount++;
				}else{
					System.out.println("��6~");
				}
			}
		}
	}
}