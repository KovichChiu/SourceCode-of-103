package tetris.box;

/**
 * �U�ؤ���A�ثe�]�w��7�اΪ��i�]�w
 * @author Ray
 *
 */
public class Box {
    /** 1.���� */
    public final static String STYLE1 = "0,0|0,1|0,2|0,3@0,0|1,0|2,0|3,0";    
    /** 2.��L */
    public final static String STYLE2 = "0,0|1,0|1,1|1,2@0,0|0,1|1,0|2,0@0,0|0,1|0,2|1,2@0,1|1,1|2,0|2,1";
    /** 3.L */
    public final static String STYLE3 = "0,2|1,0|1,1|1,2@0,0|1,0|2,0|2,1@0,0|0,1|0,2|1,0@0,0|0,1|1,1|2,1";
    /** 4.���� */
    public final static String STYLE4 = "0,0|0,1|1,0|1,1";
    /** 5.���{�q */
    public final static String STYLE5 = "0,1|0,2|1,0|1,1@0,0|1,0|1,1|2,1";
    /** 6.T�� */
    public final static String STYLE6 = "0,1|1,0|1,1|1,2@0,1|1,1|1,2|2,1@1,0|1,1|1,2|2,1@0,1|1,0|1,1|2,1";
    /** 7.�ϰ{�q */
    public final static String STYLE7 = "0,0|0,1|1,1|1,2@0,1|1,0|1,1|2,0";

    private final static String [] STYLE_LIST = {STYLE1,STYLE2,STYLE3,STYLE4,STYLE5,STYLE6,STYLE7};

    public int nowX;            //�ثe��x��m
    public int nowY;            //�ثe��y��m

    protected int nowturn;            //�ثe����V
    protected int style;            //����������N�X
    protected int [][][] boxAry;    //�������V�᪺��
    protected int [][] hw;        //�������V�᪺���B�e    

    public Box() {
        BoxBaseInit();
    }

    public void BoxBaseInit(){
        nowturn = 0;
        boxAry = new int[0][0][0];
        style = 1;
        hw = new int[0][0];
    }

    public void resetXY(){
        nowX = 0;
        nowY = 0;
    }

    /**
     * ���wstyle�إߤ������
     * style:
     * 1.����<BR>
     * 2.��L<BR>
     * 3.L <BR>
     * 4.����<BR>
     * 5.���{�q <BR>
     * 6.T��<BR>
     * 7.�ϰ{�q <BR>
     *
     * @param style
     */
    public void setBoxData(int s){
        if(s < 0 || s > STYLE_LIST.length){
            System.out.println("�]�w��������O���s�b");
            return;
        }
        String data = STYLE_LIST[s - 1];
        style = s;
        setStyleData(data);
    }

    /**
     * �]�w�������
     * "[�Ϊ�1]_��,�e@[�Ϊ�2]_��,�e..."<BR>
     * �Ϊ�:�G���}�C��m1|�G���}�C��m1|...<BR>
     * �����榡��"0,0|0,1|0,2|0,3@0,0|1,0|2,0|3,0"<BR>
     * @param data STYLE1 or STYLE2, STYLE3...
     */
    public void setStyleData(String data){
        String [] ary = data.split("[@]");
        boxAry = new int[ary.length][][];
        hw = new int[ary.length][2];

        for(int i = 0; i < ary.length; i++){
            String [] box = ary[i].split("[|]");
            int h = 0;
            int w = 0;

            //��M����U���x�̤j��ƻPy���̤j��ƨӷ�e�P��,�䧹����]�]�w�Ȭ��q0�}�l�A�ݭn�A�N���B�e�U+1
            for(int j = 0; j < box.length; j++){
                String [] bAry = box[j].split("[,]");
                int x = bAry[0].charAt(0) - '0';
                int y = bAry[1].charAt(0) - '0';
                
                if(x > h){
                    h = x;
                }
                if(y > w){
                    w = y;
                }
            }
            h++;
            w++;
            hw[i][0] = h;
            hw[i][1] = w;
            
            boxAry[i] = new int[h][w];

            for(int j = 0; j < box.length; j++){
                String [] bAry = box[j].split("[,]");
                int x = bAry[0].charAt(0) - '0';
                int y = bAry[1].charAt(0) - '0';
                boxAry[i][x][y] = style;
            }
        }
    }

    public int getStyle(){
        return style;
    }

    /**
     * ���o�ثe���X�ؤ������
     * @return
     */
    public static int getStyleCount(){
        return STYLE_LIST.length;
    }

    /**
     * �]�w�ثe��V
     * @param n
     */
    public void setTurn(int n){
        nowturn = n;
    }

    /**
     * ���o�ثe��V
     * @return
     */
    public int getTurn(){
        return nowturn;
    }

    public int nextTurn(int n){
        int tmpTurn = nowturn;

        tmpTurn += n;
        if(tmpTurn < 0){
            tmpTurn = getTrunKind() - 1;
        }

        tmpTurn %= getTrunKind();

        return tmpTurn;
    }

    /**
     * �f�ɰw��V
     */
    public void turnLeft(){
        nowturn--;
        if(nowturn < 0){
            nowturn = getTrunKind() - 1;
        }
    }

    /**
     * ���ɰw��V
     *
     */
    public void turnRight(){
        nowturn++;
        nowturn %= getTrunKind();
    }

    /**
     * ���o������X����V
     * @return
     */
    public int getTrunKind(){
        return boxAry.length;
    }

    /**
     * ���o���w��V���e
     * @param n
     * @return
     */
    public int getWight(int n){
        if(n >=0 && n < hw.length){
            return hw[n][1];
        }
        return 0;
    }

    /**
     * ���o�ثe��V���e
     * @return
     */
    public int getNowTurnWight(){
        return getWight(nowturn);
    }

    /**
     * ���o���w��V����
     * @param n
     * @return
     */
    public int getHeight(int n){
        if(n >=0 && n < hw.length){
            return hw[n][0];
        }
        return 0;
    }

    /**
     * ���o�ثe��V����
     * @return
     */
    public int getNowTurnHeight(){
        return getHeight(nowturn);
    }

    /**
     * ���o�ثe����Ϊ�
     * @return
     */
    public int [][] getNowturnBoxAry(){
        return getBoxAry(nowturn);
    }
    
    /**
     * ���o�ثe����Ϊ�
     * @return
     */
    public String getNowturnBoxStyleStr(){
        return getBoxStyleStr(nowturn);
    }

    /**
     * ���o���w��V������Ϊ�
     * @param index
     * @return
     */
    public int [][] getBoxAry(int index){
        if(index >=0 && index < boxAry.length){
            return boxAry[index];
        }
        return null;
    }

    /**
     * ���o���w��V������Ϊ�(�H�r��榡)�A�Ҧp:"[�Ϊ�1]_��,�e@[�Ϊ�2]_��,�e
     * @param index
     * @return
     */
    public String getBoxStyleStr(int index){
        //System.out.println("�ثe��V"+index);
        if(index >=0 && index < boxAry.length){
            String data = STYLE_LIST[style - 1];
            String [] ary = data.split("[@]");
            return ary[index];
        }
        return "";
    }

    /**
     * ����x�X��Ay�X��,�ñN�ª���m�O�U
     * @param x
     * @param y
     */
    public void move(int x,int y){
        nowY += y;
        nowX += x;
    }

    /**
     * �L�X���w��V����
     * @param index
     */
    public void printBox(int index){
        int tmp [][] = boxAry[index];

        for(int i = 0; i < tmp.length; i++){
            for(int j = 0; j < tmp[i].length; j++){
                if(tmp[i][j] > 0){
                    System.out.print("�f");
                }else{
                    System.out.print("�@");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printNowturnBox(){
        printBox(nowturn);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Box box = new Box();
        box.setBoxData(3);

        for(int i = 0; i < 50; i++){

            box.turnLeft();
            printAry(box.getNowturnBoxAry());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO �۰ʲ��� catch �϶�
                e.printStackTrace();
            }
        }

        /*for(int style = 1; style <= BoxBase.getStyleCount(); style++){
            BoxBase box = new BoxBase();
            box.setBoxData(style);
            for(int i = 0; i < box.getTrunKind(); i++){
                box.printBox(i);
            }
        }*/
    }
    


    //���եΡA�L�X�}�C
    public static void printAry(int [][] tmp){
        for(int i = 0; i < tmp.length; i++){
            for(int j = 0; j < tmp[i].length; j++){
                if(tmp[i][j] == 1){
                    System.out.print("�f");
                }else{
                    System.out.print("�@");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
