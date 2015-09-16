import java.util.*;
public class 老師_Part1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Teacher>teacher = new ArrayList<Teacher>();
		while(true){
			System.out.println("請輸入教授的名子");
			Teacher T = new Teacher(scn.next());
			teacher.add(T);
			System.out.println("是否還有其他教授要輸入?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n"))
				break;
		}
		while(true){
			System.out.println("以下為你剛剛所輸入的所有資料。");
			for(int i=1;i<=teacher.size();i++){
				System.out.println("第"+i+"位教授");
				System.out.println(teacher.get(i-1).Show()+"\n"+teacher.get(i-1).ShowInf());
				teacher.get(i-1).ShowCourse();
			}
			System.out.println("以下是否有錯?(Y/N)");
			String str = scn.next();
			if(str.equals("N") || str.equals("n")){
				break;
			}else{
				System.out.println("請問是哪一邊出錯?(1.教授部分     2.授課部分)");
				str = scn.next();
				if(str.equals("1")){
					System.out.println("請問是要增加還是刪除教授呢?(1.增加     2.刪除)");
					str = scn.next();
					if(str.equals("1")){
						System.out.println("請輸入教授的名子");
						Teacher T = new Teacher(scn.next());
						teacher.add(T);
						System.out.println("增加完成!");
					}else{
						System.out.println("請問要刪除第幾位教授?");
						int n = scn.nextInt();
						teacher.remove(n-1);
						System.out.println("刪除完成!");
					}
				}else{
					System.out.println("請問是哪一位教授的課有錯誤呢?");
					int n = scn.nextInt();
					System.out.println("以下為該教授的所有資料。");
					System.out.println(teacher.get(n-1).Show()+"\n"+teacher.get(n-1).ShowInf());
					teacher.get(n-1).ShowCourse();
					System.out.println("請問是要增加、刪除修課或是教授資料修改?(1.增加授課     2.刪除授課     3.教授資料修改)");
					str = scn.next();
					if(str.equals("1")){
						teacher.get(n-1).setCourse();						
						System.out.println("增加完成!");
					}
					else if(str.equals("2")){
						System.out.println("請問是要刪除哪一門課呢?");
						int m = scn.nextInt();
						teacher.get(n-1).course.remove(m-1);
						System.out.println("刪除完成!");
					}
					else if(str.equals("3")){
						System.out.println("請問要修改教授的甚麼資料?(1.姓名     2.編號     3.身高     4.體重     5.研究領域     6.學位)");
						int m = scn.nextInt();
						if(m==1){
							teacher.get(n-1).setName();
							System.out.println("設定完成!");
						}
						else if(m==2){
							teacher.get(n-1).setID();
							System.out.println("設定完成!");
						}
						else if(m==3){
							teacher.get(n-1).setHight();
							System.out.println("設定完成!");
						}
						else if(m==4){
							teacher.get(n-1).setWeight();
							System.out.println("設定完成!");
						}
						else if(m==5){
							teacher.get(n-1).setResearch();
							System.out.println("設定完成!");
						}
						else if(m==6){
							teacher.get(n-1).setDegree();
							System.out.println("設定完成!");
						}
					}
				}
			}
		}
	}
}