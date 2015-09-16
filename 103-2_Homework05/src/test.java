import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("1.小考");
		System.out.println("2.期中考");
		System.out.println("3.期末考");
		System.out.println("4.模擬考");
		System.out.println("請輸入數字選項。");
		int Choose = scn.nextInt();
		if(Choose == 1){
			int Corrcount=0;
			Quiz q1=new Quiz();
			q1.addQ("interface的中文？", "介面");
			q1.addQ("implement的中文？","實作");
			q1.setComplexity(0, 1);
			int num = q1.getQNum();
			for(int i=0;i<num;i++){
				System.out.print("第"+(i+1)+"題：");
				System.out.println(q1.getQ(i));
				String str = scn.next();
				if(q1.checkA(i, str)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
			System.out.println("總共答對"+Corrcount+"題唷~");
		}
		else if(Choose == 2 || Choose == 3){
			int Corrcount=0;
			M_FExam mf1 = new M_FExam();
			mf1.addQ("interface的中文？", "介面");
			mf1.addQ("implement的中文？","實作");
			mf1.addYNQ("周老是不是很會教?","Y","y");
			mf1.addYNQ("周老是不是帥帥的?","Y","y");
			mf1.addYNQ("屁孩很帥?","N","n");
			mf1.addSQ("下列何者是google的翻譯?",0);
			mf1.setQA(0, "谷歌", "谷葛", "谷狗", "谷豬");
			mf1.setComplexity(0, 1);
			int Qnum = mf1.getQNum();
			System.out.println("簡答題。");
			for(int i=0;i<Qnum;i++){	
				System.out.print("第"+(i+1)+"題：");
				System.out.println(mf1.getQ(i));
				String str = scn.next();
				if(mf1.checkA(i, str)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
			int YNQnum = mf1.getYNQNum();
			System.out.println("是非題。");
			for(int i=0;i<YNQnum;i++){	
				System.out.print("第"+(i+1)+"題：");
				System.out.println(mf1.getYNQ(i));
				String str = scn.next();
				if(mf1.checkYNA(i, str)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
			int SQnum = mf1.getSQNum();
			System.out.println("選擇題。");
			for(int i=0;i<SQnum;i++){	
				System.out.print("第"+(i+1)+"題：");
				System.out.println(mf1.getSQ(i));
				mf1.getSQItem(i);
				int str = scn.nextInt();
				if(mf1.checkSA(i, str-1)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
		}	
		else if(Choose == 4){
			int Corrcount=0;
			M_FExam mf1 = new M_FExam();
			mf1.addQ("interface的中文？", "介面");
			mf1.addQ("implement的中文？","實作");
			mf1.addYNQ("周老是不是很會教?","Y","y");
			mf1.addYNQ("周老是不是帥帥的?","Y","y");
			mf1.addYNQ("屁孩很帥?","N","n");
			mf1.addSQ("下列何者是google的翻譯?",0);
			mf1.setQA(0, "谷歌", "谷葛", "谷狗", "谷豬");
			mf1.addSQ("下列何者是support的翻譯?",0);
			mf1.setQA(1, "輔助", "重要", "完美", "善良");
			mf1.addSQ("小夫猛猛的?", 0);
			mf1.setQA(2, "是的", "不是", "一點也不", "完全不");
			mf1.setComplexity(0, 1);
			int Qnum = mf1.getQNum();
			System.out.println("簡答題。");
			for(int i=0;i<Qnum;i++){	
				System.out.print("第"+(i+1)+"題：");
				System.out.println(mf1.getQ(i));
				String str = scn.next();
				if(mf1.checkA(i, str)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
			int YNQnum = mf1.getYNQNum();
			System.out.println("是非題。");
			for(int i=0;i<YNQnum;i++){	
				System.out.print("第"+(i+1)+"題：");
				System.out.println(mf1.getYNQ(i));
				String str = scn.next();
				if(mf1.checkYNA(i, str)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
			int SQnum = mf1.getSQNum();
			System.out.println("選擇題。");
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
				System.out.print("第"+(i+1)+"題：");
				System.out.println(mf1.getSQ(i));
				mf1.getSQItemRan(i,sequence);
				int str = scn.nextInt();
				if(mf1.checkSA(i, str-1)){
					System.out.println("恭喜您答對了~");
					Corrcount++;
				}else{
					System.out.println("錯6~");
				}
			}
		}
	}
}