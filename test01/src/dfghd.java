import java.io.*;
import java.util.Calendar;

public class dfghd {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int mCalendar[][] = new int[6][7]; /* 宣告月曆陣列 */
		int mWeek = 0, mDays = 0, mMonth = 0, mYear;
		Calendar rightNow = Calendar.getInstance(); /* 產生 月曆元件 */
		String mString;

		System.out.print("Please enter Year: ");
		mYear = Integer.parseInt(in.readLine());
		System.out.print("Please enter Month: ");
		mMonth = Integer.parseInt(in.readLine());
		System.out.println("");
		for (int i = 0; i < 6; i++)
			/* 將月曆陣列歸零 */
			for (int j = 0; j < 7; j++)
				mCalendar[i][j] = 0;

		mMonth--; /* 月份(0-11) */

		if (mMonth == 11) /* 計算一個月有幾天 */
			rightNow.set(mYear + 1, 0, 1);
		else
			rightNow.set(mYear, mMonth + 1, 1);
		rightNow.add(rightNow.DATE, -1);
		mDays = rightNow.get(Calendar.DATE);

		for (int day = 1; day <= mDays; day++) {
			rightNow.set(mYear, mMonth, day); /* 設定 年度,月份(0-11),天數 */
			mCalendar[rightNow.get(Calendar.WEEK_OF_MONTH) - 1][rightNow
					.get(Calendar.DAY_OF_WEEK) - 1] = 1;
		}

		/* 開始列印月曆 */
		System.out.println("列印月份: " + mYear + "/" + (mMonth + 1));
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		mDays = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (mCalendar[i][j] == 1) {
					mString = Integer.toString(100 + (mDays++));
					System.out.print(" " + mString.substring(1, 3) + " ");
				} else
					System.out.print("    ");
			}
			System.out.println("");
		}
	}
}