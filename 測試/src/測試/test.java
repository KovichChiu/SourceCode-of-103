package 測試;

/*★Designer：SUNGO-2004.01。★*/
/*★Program：模擬工程用計算機-四則運算處理程式(v1.0)。★*/
/*★Java VM 版本:1.4.2_01-b06。★*/
/*★開發環境：Borland Jbuilder X 企業版。★*/
/*★程式邏輯說明：請拉到最下面↓↓↓★*/
 
import java.text.DecimalFormat;
import javax.swing.*;
import java.util.*;
import java.awt.*; //import：引入程式中所需要使用到的類別;星號*表示包括以下全部。
import java.awt.event.*;
 
public class test //類別名稱：sungo (注意：類別名稱需與檔名一致才能編譯！)
    extends JFrame { //繼承自JFrame
  private JLabel prompt; //GUI-文字標籤
  private JTextField input; //GUI-輸入文字方塊
  private JTextArea output; //GUI-輸出文字方塊
 
  public test() { //類別名稱：sungo
    super("SUNGO - 模擬工程用計算機<v1.0>"); //★視窗標題所顯示的名稱★
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    prompt = new JLabel("請輸入運算式，並按【Enter】鍵執行："); //★標籤文字★
    c.add(prompt);
    input = new JTextField(25); //設定輸入文字方塊的長度
    input.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { //事件：按下Enter鍵後由此開始執行程式
        String Output_All = "", Output = "", Input = "";
        DecimalFormat preNine = new DecimalFormat("#.#########");
        //宣告了一個DecimalFormat的自訂參考preNine，並以一個DecimalFormat類別的物件初始其值
        //註：("#.#########")此格式的意義為：當浮點變數超過小數點第9位時，自動四捨五入到小數點第9位
        Input = e.getActionCommand(); //由輸入方塊取得字串
        String Input_all = Input;
        int cunter_all = 0; //cunter_all計算陣列索引的位置
        StringTokenizer tokens_all = new StringTokenizer(Input_all); //斷句功能設定宣告(處理tokens_all)
        String m_all[] = new String[Input_all.length() + 1]; //宣告m_all陣列以儲存變數，長度等於輸入字串長度
        while (tokens_all.hasMoreTokens()) {
          m_all[cunter_all] = tokens_all.nextToken("()");
          char charArrayAll[] = m_all[cunter_all].toCharArray(); //將字串轉成字元陣列charArrayAll[]
          int cAll = m_all[cunter_all].length() - 1;
          if (charArrayAll[0] == '+' ||
              charArrayAll[0] == '*' || charArrayAll[0] == '/' ||
              charArrayAll[cAll] == '+' || charArrayAll[cAll] == '-' ||
              charArrayAll[cAll] == '*' || charArrayAll[cAll] == '/'
              ) {
            Output_All += m_all[cunter_all];
          }
          else {
            Output_All += SAll(m_all[cunter_all]);
          }
        }
        String Output1 = "", Output2 = "";
        //Show出截取字元，處理程式區段開始-->
        String Input_show_n = Input;
        String Input_show_m = Input;
        int cunter_show_n = 0, cunter_show_m = 0; //cunter_show_n、cunter_show_m,計算陣列索引的位置
        StringTokenizer tokens_show_n = new StringTokenizer(Input_show_n); //斷句功能設定宣告(處理tokens_show_n)
        StringTokenizer tokens_show_m = new StringTokenizer(Input_show_m); //斷句功能設定宣告(處理tokens_show_m)
        double n_show[] = new double[Input_show_n.length() + 1]; //宣告n_show陣列以儲存變數，長度等於輸入字串長度
        String m_show[] = new String[Input_show_m.length() + 1]; //宣告m_show陣列以儲存變數,m_show[]=字串變數
        while (tokens_show_n.hasMoreTokens()) {
          n_show[cunter_show_n] = Double.parseDouble(tokens_show_n.nextToken(
              "(-/+*)"));
          Output1 += "【" + preNine.format(n_show[cunter_show_n]) + "】"; //"取出所有數字"的字串輸出
          cunter_show_n++;
        }
        while (tokens_show_m.hasMoreTokens()) {
          m_show[cunter_show_m] = tokens_show_m.nextToken("()0123456789.");
          Output2 += "『" + m_show[cunter_show_m] + "』";
          cunter_show_m++;
        }
        //Show出截取字元處理，程式區段結束-->
        Output = SAll(Output_All); //真正的四則運算結果，SAll=副程式
        output.setText("數字鍵：" + Output1 + "\n符號鍵：" + Output2 + "\n☆答案☆：" +
                       Output); //將結果輸出於文字方塊上
      }
    } //對應input.addActionListener(new ActionListener()
    ); //對應input.addActionListener
    c.add(input);
    output = new JTextArea(5, 25); //輸出方塊的大小設定
    output.setEditable(false);
    c.add(new JScrollPane(output));
    setSize(320, 203); //面版大小設定
    show();
    try {
      jbInit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  } //對應public sungo()
 
//副程式：SSubToAdd(String SubToAdd)--用途：負負取正
  public static String SSubToAdd(String SubToAdd) {
    StringBuffer buf7 = new StringBuffer(SubToAdd); //宣告SringBuffer類別來處理字串
    String S7 = "";
    char charArray7[] = SubToAdd.toCharArray(); //將字串轉成字元陣列charArray[]
    int x7 = 0;
    for (int j7 = 0; j7 < SubToAdd.length(); ++j7) {
      if (charArray7[j7] == '-' && charArray7[j7 + 1] == '-') {
        buf7.insert(j7 + x7, '+'); //意義：將--變為+
        buf7.deleteCharAt(j7 + x7 + 1);
        buf7.deleteCharAt(j7 + x7 + 1);
        --x7;
      }
    }
    S7 = buf7.toString();
    return S7;
  }
 
//副程式：SAll(String Input2)--用途：計算字串型態的四則運算(不包括括號)
  public static String SAll(String Input2) {
    DecimalFormat preNine = new DecimalFormat("#.#########");
    String Input_add = ChangeAddStr(Input2); //使用副程式ChangeAddStr
    int cunter_add = 0; //cunter計算陣列索引的位置
    StringTokenizer tokens_add = new StringTokenizer(Input_add); //斷句功能設定宣告(處理Input_add)
    String m_add[] = new String[Input_add.length() + 1]; //宣告m_add陣列以儲存變數,m_add[]=字串變數
    while (tokens_add.hasMoreTokens()) {
      m_add[cunter_add] = tokens_add.nextToken("+");
      cunter_add++;
    }
    double n_add[] = new double[cunter_add + 1]; //宣告n_add陣列以儲存變數,n[]=浮點變數
    for (int z = 0; z < cunter_add; ++z) {
      n_add[z] += Double.parseDouble(SMulDiv(m_add[z]));
    }
    for (int f = 0; f < cunter_add; ++f) {
      n_add[f + 1] += n_add[f];
    }
    return preNine.format(n_add[cunter_add - 1]); //傳回計算結果(字串型態)
  }
 
//副程式：SMulDiv(String Input)--用途：將字串乘法與除法轉換成實際運算
  public static String SMulDiv(String Input) {
    double Result = 0; //Result=最後結果
    DecimalFormat preNine = new DecimalFormat("#.#########");
    if (Input.indexOf('*') != -1 || Input.indexOf('/') != -1) {
      String Input_n = ChangeStr(Input, '-', '+'); //處理Input取變數的負號情況
      String Input_m = DeleteStrHead(Input); //處理Input取運算元的負號情況
      int cunter_n = 0, cunter_m = 0; //cunter計算陣列索引的位置
      double n[] = new double[Input_n.length() + 1]; //宣告n陣列以儲存變數,n[]=Double變數
      String m[] = new String[Input_m.length() + 1]; //宣告m陣列以儲存變數,n[]=字串變數
      StringTokenizer tokens_n = new StringTokenizer(Input_n); //斷句功能設定宣告(處理Input_n)
      StringTokenizer tokens_m = new StringTokenizer(Input_m); //斷句功能設定宣告(處理Input_m)
      while (tokens_n.hasMoreTokens()) {
        n[cunter_n] = Double.parseDouble(tokens_n.nextToken("+/*"));
        n[cunter_n] = n[cunter_n];
        cunter_n++; //此時的cunter_n=所有變數的個數，如為4則表示有n[0~3]，4個要處理的數字
      }
      while (tokens_m.hasMoreTokens()) {
        m[cunter_m] = String.valueOf(tokens_m.nextToken("0123456789."));
        if (m[cunter_m].equals("*+")) {
          m[cunter_m] = "*"; //將負數乘法所造成的截取誤差更正，以取得正確運算元
        }
        if (m[cunter_m].equals("/+")) {
          m[cunter_m] = "/"; //將負數除法所造成的截取誤差更正，以取得正確運算元
        }
        cunter_m++;
      } //此時的cunter_m=運算元的總數，如為3則表示有m[0~2]，3個加減乘除符號
      //運算處理開始-->
      for (int i = 0; i < cunter_m; ++i) {
        if (m[i].equals("*")) {
          n[i + 1] *= n[i];
        }
        else {
          if (m[i].equals("/")) {
            n[i + 1] = n[i] / n[i + 1];
          }
        }
      }
      Result = n[cunter_n - 1]; //運算處理結束<--
    }
    else {
      Result = Double.parseDouble(Input);
    }
    return preNine.format(Result); //傳回計算結果(字串型態)
  }
 
//副程式：ChangeStr(S1=要處理的字串,chOld=要判斷的字元,chAdd=要加上去的字元)
  public static String ChangeStr(String S1, char chOld, char chAdd) {
    StringBuffer buf1 = new StringBuffer(S1); //宣告SringBuffer類別來處理字串
    String S2 = "";
    char charArray1[] = S1.toCharArray(); //將字串轉成字元陣列charArray[]
    int x1 = 0;
    for (int i1 = 0; i1 < S1.length(); i1++) {
      if (charArray1[i1] == chOld) {
        buf1.insert(i1 + x1, chAdd); //意義：如果字串內有'chOld'，就在前面前加上'chAdd'
        ++x1;
      }
    }
    S2 = String.valueOf(buf1); //將Buf轉成String型態存入Input
    return S2;
  }
 
//副程式：DeleteStrHead(S3=要處理的字串)--用途：假如開頭是'-'則刪除它
  public static String DeleteStrHead(String S3) {
    StringBuffer buf2 = new StringBuffer(S3); //宣告SringBuffer類別來處理字串
    String S4 = "";
    char charArray2[] = S3.toCharArray(); //將字串轉成字元陣列
    if (charArray2[0] == '-') {
      buf2.delete(0, 1);
    }
    S4 = buf2.toString(); //將Buf轉成String型態存入Input
    S4 = S4.replace('-', '+'); //將字串內所有的'-'用'+'取代
    return S4;
  }
 
//副程式：ChangeAddStr(S5=要處理的字串)
  public static String ChangeAddStr(String S5) {
    S5 = SSubToAdd(S5);
    StringBuffer buf3 = new StringBuffer(S5); //宣告SringBuffer類別來處理字串
    String S6 = "";
    char charArray3[] = S5.toCharArray(); //將字串轉成字元陣列charArray[]
    int x3 = 0;
    for (int i3 = 0; i3 < S5.length(); i3++) {
      if (charArray3[i3] == '-') {
        buf3.insert(i3 + x3, '+'); //意義：如果字串內有'-'，就在前面前加上'+'
        ++x3;
      }
    }
    StringBuffer buf4 = new StringBuffer(buf3.toString()); //宣告SringBuffer類別來處理字串
    char charArray4[] = buf4.toString().toCharArray(); //將字串轉成字元陣列charArray[]
    int f = 0;
    for (int j3 = 0; j3 < buf4.toString().length(); j3++) {
      if (charArray4[j3] == '*' && charArray4[j3 + 1] == '+') {
        buf4.deleteCharAt(j3 + f + 1); //意義：將*+變為*
        --f;
      }
      if (charArray4[j3] == '/' && charArray4[j3 + 1] == '+') {
        buf4.deleteCharAt(j3 + f + 1); //意義：將*/變為*
        --f;
      }
    }
    S6 = String.valueOf(buf4); //將Buf轉成String型態存入S6
    return S6;
  }
 
//主程式main
  public static void main(String args[]) {
    test app = new test(); //類別名稱：sungo
    app.addWindowListener(
        new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0); //按下視窗關關閉鈕後，程式結束
      }
    }
    );
  }
 
  private void jbInit() throws Exception {
    prompt.setFont(new java.awt.Font("新細明體", 0, 15)); //文字標籤字體設定
    prompt.setForeground(new Color(255, 255, 255)); //文字標籤字型顏色
    input.setBackground(new Color(235, 255, 235)); //輸入方塊背景色
    input.setForeground(new Color(0, 102, 255)); //輸入方塊字型顏色
    output.setBackground(new Color(235, 255, 235)); //輸出方塊背景色
    output.setForeground(new Color(0, 102, 255)); //輸出方塊字型顏色
    this.getContentPane().setBackground(new Color(204, 102, 255)); //★面版底色設定★
    this.setDefaultCloseOperation(HIDE_ON_CLOSE); //隱藏視窗最大化的按鈕
    this.setResizable(false); //改變視窗大小禁能(Disable)
  }
}
 
//㊣程式邏輯說明㊣：
/*
   此程式最主要的觀念，就是字串上的處理。使用者輸入的運算式，妳必須讓程式像人類在作四則運算一
 樣，把結果算出來。也就是要符合先乘除後加減 ，以及括號()優先處理的原則。假如使用者輸入了：
 (0.8+0.7)*(12-2)，妳的一步驟就是先處理0.8+0.7以及-12+2，最後把2個結果乘起來，就是答案

   程式的作法：利用StringTokenizer類別將字串做有意義的分斷。將可取得0.8、0.7、12、『-2』
 四個數字，以及+、*、『+』的運算元。在這裡提供一個觀念：減法就是等於被加數+負加數，例如：5-2
 就是等於 5+(-2)，有這個觀念妳就可以瞭解，為何取出來的數字是『-2』而運算元是『+』，這樣的作
 法就是為了更方便程式的計算！再來只要設計一些邏輯，判斷執行的順序後，即可算出答案！現在就以
 (0.8+0.7)*(12-2)這個運算式來說明它在程式中是如何執行計算的。

 1.判別括號的斷句程序會把它先作下列的分斷：
 0.8+0.7
 *
 12-2

 2.將這3個斷句送入自製副程式SAll()計算。SAll副程式可以計算不含括號的四則運算！要執行SAll時
 ，必須先判別輸入的是不是有效的運算式。所以要在此之前寫一個判斷邏輯，非有效計算暫時不處理，例n 如本運算式斷句*的部分，只有一個運算元前後並無數字可作運算，它即是一個非有效計算。 經過此道順
 序後，得到新字串：1.5*10。

 3.最後只要把作完括號處理的新字串1.5*10再送入SAll()計算，即可得到15這個正確答案。

 */
