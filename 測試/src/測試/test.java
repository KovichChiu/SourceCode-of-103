package ����;

/*��Designer�GSUNGO-2004.01�C��*/
/*��Program�G�����u�{�έp���-�|�h�B��B�z�{��(v1.0)�C��*/
/*��Java VM ����:1.4.2_01-b06�C��*/
/*���}�o���ҡGBorland Jbuilder X ���~���C��*/
/*���{���޿軡���G�ЩԨ�̤U����������*/
 
import java.text.DecimalFormat;
import javax.swing.*;
import java.util.*;
import java.awt.*; //import�G�ޤJ�{�����һݭn�ϥΨ쪺���O;�P��*��ܥ]�A�H�U�����C
import java.awt.event.*;
 
public class test //���O�W�١Gsungo (�`�N�G���O�W�ٻݻP�ɦW�@�P�~��sĶ�I)
    extends JFrame { //�~�Ӧ�JFrame
  private JLabel prompt; //GUI-��r����
  private JTextField input; //GUI-��J��r���
  private JTextArea output; //GUI-��X��r���
 
  public test() { //���O�W�١Gsungo
    super("SUNGO - �����u�{�έp���<v1.0>"); //���������D����ܪ��W�١�
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    prompt = new JLabel("�п�J�B�⦡�A�ë��iEnter�j�����G"); //�����Ҥ�r��
    c.add(prompt);
    input = new JTextField(25); //�]�w��J��r���������
    input.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { //�ƥ�G���UEnter���Ѧ��}�l����{��
        String Output_All = "", Output = "", Input = "";
        DecimalFormat preNine = new DecimalFormat("#.#########");
        //�ŧi�F�@��DecimalFormat���ۭq�Ѧ�preNine�A�åH�@��DecimalFormat���O�������l���
        //���G("#.#########")���榡���N�q���G��B�I�ܼƶW�L�p���I��9��ɡA�۰ʥ|�ˤ��J��p���I��9��
        Input = e.getActionCommand(); //�ѿ�J������o�r��
        String Input_all = Input;
        int cunter_all = 0; //cunter_all�p��}�C���ު���m
        StringTokenizer tokens_all = new StringTokenizer(Input_all); //�_�y�\��]�w�ŧi(�B�ztokens_all)
        String m_all[] = new String[Input_all.length() + 1]; //�ŧim_all�}�C�H�x�s�ܼơA���׵����J�r�����
        while (tokens_all.hasMoreTokens()) {
          m_all[cunter_all] = tokens_all.nextToken("()");
          char charArrayAll[] = m_all[cunter_all].toCharArray(); //�N�r���ন�r���}�CcharArrayAll[]
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
        //Show�X�I���r���A�B�z�{���Ϭq�}�l-->
        String Input_show_n = Input;
        String Input_show_m = Input;
        int cunter_show_n = 0, cunter_show_m = 0; //cunter_show_n�Bcunter_show_m,�p��}�C���ު���m
        StringTokenizer tokens_show_n = new StringTokenizer(Input_show_n); //�_�y�\��]�w�ŧi(�B�ztokens_show_n)
        StringTokenizer tokens_show_m = new StringTokenizer(Input_show_m); //�_�y�\��]�w�ŧi(�B�ztokens_show_m)
        double n_show[] = new double[Input_show_n.length() + 1]; //�ŧin_show�}�C�H�x�s�ܼơA���׵����J�r�����
        String m_show[] = new String[Input_show_m.length() + 1]; //�ŧim_show�}�C�H�x�s�ܼ�,m_show[]=�r���ܼ�
        while (tokens_show_n.hasMoreTokens()) {
          n_show[cunter_show_n] = Double.parseDouble(tokens_show_n.nextToken(
              "(-/+*)"));
          Output1 += "�i" + preNine.format(n_show[cunter_show_n]) + "�j"; //"���X�Ҧ��Ʀr"���r���X
          cunter_show_n++;
        }
        while (tokens_show_m.hasMoreTokens()) {
          m_show[cunter_show_m] = tokens_show_m.nextToken("()0123456789.");
          Output2 += "�y" + m_show[cunter_show_m] + "�z";
          cunter_show_m++;
        }
        //Show�X�I���r���B�z�A�{���Ϭq����-->
        Output = SAll(Output_All); //�u�����|�h�B�⵲�G�ASAll=�Ƶ{��
        output.setText("�Ʀr��G" + Output1 + "\n�Ÿ���G" + Output2 + "\n�����ס��G" +
                       Output); //�N���G��X���r����W
      }
    } //����input.addActionListener(new ActionListener()
    ); //����input.addActionListener
    c.add(input);
    output = new JTextArea(5, 25); //��X������j�p�]�w
    output.setEditable(false);
    c.add(new JScrollPane(output));
    setSize(320, 203); //�����j�p�]�w
    show();
    try {
      jbInit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  } //����public sungo()
 
//�Ƶ{���GSSubToAdd(String SubToAdd)--�γ~�G�t�t����
  public static String SSubToAdd(String SubToAdd) {
    StringBuffer buf7 = new StringBuffer(SubToAdd); //�ŧiSringBuffer���O�ӳB�z�r��
    String S7 = "";
    char charArray7[] = SubToAdd.toCharArray(); //�N�r���ন�r���}�CcharArray[]
    int x7 = 0;
    for (int j7 = 0; j7 < SubToAdd.length(); ++j7) {
      if (charArray7[j7] == '-' && charArray7[j7 + 1] == '-') {
        buf7.insert(j7 + x7, '+'); //�N�q�G�N--�ܬ�+
        buf7.deleteCharAt(j7 + x7 + 1);
        buf7.deleteCharAt(j7 + x7 + 1);
        --x7;
      }
    }
    S7 = buf7.toString();
    return S7;
  }
 
//�Ƶ{���GSAll(String Input2)--�γ~�G�p��r�ꫬ�A���|�h�B��(���]�A�A��)
  public static String SAll(String Input2) {
    DecimalFormat preNine = new DecimalFormat("#.#########");
    String Input_add = ChangeAddStr(Input2); //�ϥΰƵ{��ChangeAddStr
    int cunter_add = 0; //cunter�p��}�C���ު���m
    StringTokenizer tokens_add = new StringTokenizer(Input_add); //�_�y�\��]�w�ŧi(�B�zInput_add)
    String m_add[] = new String[Input_add.length() + 1]; //�ŧim_add�}�C�H�x�s�ܼ�,m_add[]=�r���ܼ�
    while (tokens_add.hasMoreTokens()) {
      m_add[cunter_add] = tokens_add.nextToken("+");
      cunter_add++;
    }
    double n_add[] = new double[cunter_add + 1]; //�ŧin_add�}�C�H�x�s�ܼ�,n[]=�B�I�ܼ�
    for (int z = 0; z < cunter_add; ++z) {
      n_add[z] += Double.parseDouble(SMulDiv(m_add[z]));
    }
    for (int f = 0; f < cunter_add; ++f) {
      n_add[f + 1] += n_add[f];
    }
    return preNine.format(n_add[cunter_add - 1]); //�Ǧ^�p�⵲�G(�r�ꫬ�A)
  }
 
//�Ƶ{���GSMulDiv(String Input)--�γ~�G�N�r�ꭼ�k�P���k�ഫ����ڹB��
  public static String SMulDiv(String Input) {
    double Result = 0; //Result=�̫ᵲ�G
    DecimalFormat preNine = new DecimalFormat("#.#########");
    if (Input.indexOf('*') != -1 || Input.indexOf('/') != -1) {
      String Input_n = ChangeStr(Input, '-', '+'); //�B�zInput���ܼƪ��t�����p
      String Input_m = DeleteStrHead(Input); //�B�zInput���B�⤸���t�����p
      int cunter_n = 0, cunter_m = 0; //cunter�p��}�C���ު���m
      double n[] = new double[Input_n.length() + 1]; //�ŧin�}�C�H�x�s�ܼ�,n[]=Double�ܼ�
      String m[] = new String[Input_m.length() + 1]; //�ŧim�}�C�H�x�s�ܼ�,n[]=�r���ܼ�
      StringTokenizer tokens_n = new StringTokenizer(Input_n); //�_�y�\��]�w�ŧi(�B�zInput_n)
      StringTokenizer tokens_m = new StringTokenizer(Input_m); //�_�y�\��]�w�ŧi(�B�zInput_m)
      while (tokens_n.hasMoreTokens()) {
        n[cunter_n] = Double.parseDouble(tokens_n.nextToken("+/*"));
        n[cunter_n] = n[cunter_n];
        cunter_n++; //���ɪ�cunter_n=�Ҧ��ܼƪ��ӼơA�p��4�h��ܦ�n[0~3]�A4�ӭn�B�z���Ʀr
      }
      while (tokens_m.hasMoreTokens()) {
        m[cunter_m] = String.valueOf(tokens_m.nextToken("0123456789."));
        if (m[cunter_m].equals("*+")) {
          m[cunter_m] = "*"; //�N�t�ƭ��k�ҳy�����I���~�t�󥿡A�H���o���T�B�⤸
        }
        if (m[cunter_m].equals("/+")) {
          m[cunter_m] = "/"; //�N�t�ư��k�ҳy�����I���~�t�󥿡A�H���o���T�B�⤸
        }
        cunter_m++;
      } //���ɪ�cunter_m=�B�⤸���`�ơA�p��3�h��ܦ�m[0~2]�A3�ӥ[����Ÿ�
      //�B��B�z�}�l-->
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
      Result = n[cunter_n - 1]; //�B��B�z����<--
    }
    else {
      Result = Double.parseDouble(Input);
    }
    return preNine.format(Result); //�Ǧ^�p�⵲�G(�r�ꫬ�A)
  }
 
//�Ƶ{���GChangeStr(S1=�n�B�z���r��,chOld=�n�P�_���r��,chAdd=�n�[�W�h���r��)
  public static String ChangeStr(String S1, char chOld, char chAdd) {
    StringBuffer buf1 = new StringBuffer(S1); //�ŧiSringBuffer���O�ӳB�z�r��
    String S2 = "";
    char charArray1[] = S1.toCharArray(); //�N�r���ন�r���}�CcharArray[]
    int x1 = 0;
    for (int i1 = 0; i1 < S1.length(); i1++) {
      if (charArray1[i1] == chOld) {
        buf1.insert(i1 + x1, chAdd); //�N�q�G�p�G�r�ꤺ��'chOld'�A�N�b�e���e�[�W'chAdd'
        ++x1;
      }
    }
    S2 = String.valueOf(buf1); //�NBuf�নString���A�s�JInput
    return S2;
  }
 
//�Ƶ{���GDeleteStrHead(S3=�n�B�z���r��)--�γ~�G���p�}�Y�O'-'�h�R����
  public static String DeleteStrHead(String S3) {
    StringBuffer buf2 = new StringBuffer(S3); //�ŧiSringBuffer���O�ӳB�z�r��
    String S4 = "";
    char charArray2[] = S3.toCharArray(); //�N�r���ন�r���}�C
    if (charArray2[0] == '-') {
      buf2.delete(0, 1);
    }
    S4 = buf2.toString(); //�NBuf�নString���A�s�JInput
    S4 = S4.replace('-', '+'); //�N�r�ꤺ�Ҧ���'-'��'+'���N
    return S4;
  }
 
//�Ƶ{���GChangeAddStr(S5=�n�B�z���r��)
  public static String ChangeAddStr(String S5) {
    S5 = SSubToAdd(S5);
    StringBuffer buf3 = new StringBuffer(S5); //�ŧiSringBuffer���O�ӳB�z�r��
    String S6 = "";
    char charArray3[] = S5.toCharArray(); //�N�r���ন�r���}�CcharArray[]
    int x3 = 0;
    for (int i3 = 0; i3 < S5.length(); i3++) {
      if (charArray3[i3] == '-') {
        buf3.insert(i3 + x3, '+'); //�N�q�G�p�G�r�ꤺ��'-'�A�N�b�e���e�[�W'+'
        ++x3;
      }
    }
    StringBuffer buf4 = new StringBuffer(buf3.toString()); //�ŧiSringBuffer���O�ӳB�z�r��
    char charArray4[] = buf4.toString().toCharArray(); //�N�r���ন�r���}�CcharArray[]
    int f = 0;
    for (int j3 = 0; j3 < buf4.toString().length(); j3++) {
      if (charArray4[j3] == '*' && charArray4[j3 + 1] == '+') {
        buf4.deleteCharAt(j3 + f + 1); //�N�q�G�N*+�ܬ�*
        --f;
      }
      if (charArray4[j3] == '/' && charArray4[j3 + 1] == '+') {
        buf4.deleteCharAt(j3 + f + 1); //�N�q�G�N*/�ܬ�*
        --f;
      }
    }
    S6 = String.valueOf(buf4); //�NBuf�নString���A�s�JS6
    return S6;
  }
 
//�D�{��main
  public static void main(String args[]) {
    test app = new test(); //���O�W�١Gsungo
    app.addWindowListener(
        new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0); //���U�����������s��A�{������
      }
    }
    );
  }
 
  private void jbInit() throws Exception {
    prompt.setFont(new java.awt.Font("�s�ө���", 0, 15)); //��r���Ҧr��]�w
    prompt.setForeground(new Color(255, 255, 255)); //��r���Ҧr���C��
    input.setBackground(new Color(235, 255, 235)); //��J����I����
    input.setForeground(new Color(0, 102, 255)); //��J����r���C��
    output.setBackground(new Color(235, 255, 235)); //��X����I����
    output.setForeground(new Color(0, 102, 255)); //��X����r���C��
    this.getContentPane().setBackground(new Color(204, 102, 255)); //����������]�w��
    this.setDefaultCloseOperation(HIDE_ON_CLOSE); //���õ����̤j�ƪ����s
    this.setResizable(false); //���ܵ����j�p�T��(Disable)
  }
}
 
//���{���޿軡�����G
/*
   ���{���̥D�n���[���A�N�O�r��W���B�z�C�ϥΪ̿�J���B�⦡�A�p�������{�����H���b�@�|�h�B��@
 �ˡA�⵲�G��X�ӡC�]�N�O�n�ŦX��������[�� �A�H�άA��()�u���B�z����h�C���p�ϥΪ̿�J�F�G
 (0.8+0.7)*(12-2)�A�p���@�B�J�N�O���B�z0.8+0.7�H��-12+2�A�̫��2�ӵ��G���_�ӡA�N�O����

   �{�����@�k�G�Q��StringTokenizer���O�N�r�갵���N�q�����_�C�N�i���o0.8�B0.7�B12�B�y-2�z
 �|�ӼƦr�A�H��+�B*�B�y+�z���B�⤸�C�b�o�̴��Ѥ@���[���G��k�N�O����Q�[��+�t�[�ơA�Ҧp�G5-2
 �N�O���� 5+(-2)�A���o���[���p�N�i�H�A�ѡA������X�Ӫ��Ʀr�O�y-2�z�ӹB�⤸�O�y+�z�A�o�˪��@
 �k�N�O���F���K�{�����p��I�A�ӥu�n�]�p�@���޿�A�P�_���檺���ǫ�A�Y�i��X���סI�{�b�N�H
 (0.8+0.7)*(12-2)�o�ӹB�⦡�ӻ������b�{�����O�p�����p�⪺�C

 1.�P�O�A�����_�y�{�Ƿ|�⥦���@�U�C�����_�G
 0.8+0.7
 *
 12-2

 2.�N�o3���_�y�e�J�ۻs�Ƶ{��SAll()�p��CSAll�Ƶ{���i�H�p�⤣�t�A�����|�h�B��I�n����SAll��
 �A�������P�O��J���O���O���Ī��B�⦡�C�ҥH�n�b�����e�g�@�ӧP�_�޿�A�D���ĭp��Ȯɤ��B�z�A��n �p���B�⦡�_�y*�������A�u���@�ӹB�⤸�e��õL�Ʀr�i�@�B��A���Y�O�@�ӫD���ĭp��C �g�L���D��
 �ǫ�A�o��s�r��G1.5*10�C

 3.�̫�u�n��@���A���B�z���s�r��1.5*10�A�e�JSAll()�p��A�Y�i�o��15�o�ӥ��T���סC

 */
