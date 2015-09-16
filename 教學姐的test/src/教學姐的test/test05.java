package 教學姐的test;
import java.util.Scanner;
import java.util.ArrayList;
public class test05 {

	public static void main(String[] args) {
//		兩條魚，1M1F，懷孕期1week，一次生30(30%M  70%F)，小魚被大魚吃掉10%
//		小魚到能夠受孕為期4week
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList <Integer> perWeek = new ArrayList<Integer>();
		int [] Fish = new int [n];
		perWeek.add(0);//第一周沒有生
		for(int i=1;i<n;i++){
			System.out.println(i); // 顯示周數(第0周不算因為那兩隻都沒有生)
			if(i<=5){  //出生後第5周開始可以受孕
				
				perWeek.add(1); // i周的生產量(單位:團)
				Fish[i]=30;
			}else{
				perWeek.add(perWeek.get(i-1)+perWeek.get(i-5));
				/*
				 * 弟i位的生產量是前第1周數量+前第5周的母魚數量*30
				 * (母魚數量 = 30*0.7 = 21)
				 *      ↓前一周的生產量         ↓5周前應該長大可以生產的魚團數目*每團魚量*母魚比例*每隻生下30隻     
				 */
				Fish[i]=Fish[i-1]+(perWeek.get(i-5)*21*30);
			}
		}
		int total = 0;
		for(int i=0;i<n;i++ ){
			total = total+Fish[i];
		}
		int alltotal = total*9/10; //除了最一開始的兩隻，其他都有少10%  所以*0.9
		
		System.out.print("共約有"+(alltotal+2)+"隻魚");
	}
}
