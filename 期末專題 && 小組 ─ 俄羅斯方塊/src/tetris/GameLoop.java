package tetris;

import java.util.Random;

import tetris.box.Box;
import tetris.box.CheckCleanLineThread;
import tetris.box.CleanLineI;
import tetris.box.GameBox;


/**
 * ����C���y�{
 * @author Ray
 *
 */
public class GameLoop implements Runnable,CleanLineI{
    private float fastSec;//�ֲ������
    private float sec;
    private Random rand;
    private GameBox gameBox;
    private boolean isRun;
    private boolean isPause;
    private boolean isGameOver;    //�O�_�C������
    private boolean isClean;    //�ثe�O�_������쩳
    private boolean fastEnable;//true :�ҥΧֲ�
    private ViewDelegate delegate;
    private CheckCleanLineThread checkCleanThread;

    private int flag;            //�ثe�ϥΪ������m
    private String [] styleAry;//�w�����buffer��

    public GameLoop() {
        isRun = true;
        rand = new Random();
        GameLoopInit();
    }

    public void GameLoopInit(){
        flag = 0;
        styleAry = new String[0];
        sec = 0.2f;
        fastSec = 0.1f;
        gameBox = new GameBox();
        fastEnable = false;
        isPause = false;
        isGameOver = false;
        checkCleanThread = new CheckCleanLineThread();
        checkCleanThread.setObj(this);
        checkCleanThread.startThread();
        setBoxList(getRandBox(5));//�]�w�ϥ�5�նüƱƦC����i��C��
        nextCreatBox();
    }

    public void startGame(){
        new Thread(this).start();
    }

    public void stopGame(){
        isRun = false;
    }

    public void run(){
        while(isRun){
            try {
                if(!isPause && !isGameOver){//�S�����Ȱ��~�i��
                    if(!gameBox.moveDown()){//����w�쩳����,����A���U��
                        isClean = true;
                    }
                    putDelegateCode("repaint", "");
                    //printAry(gameBox.getBoxAry());
                }
                Thread.sleep((int)(1000 * (fastEnable ? fastSec:sec)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        close();
    }

    /**
     * �]�w�w�������style
     * @param boxList
     */
    public void setBoxList(String boxList){
        if(!boxList.equals("")){
            styleAry = boxList.split("[|]");
        }
    }
    
    /**
     * ���on�նüƱƦC���,�Ҧp��1�լ�:"1|5|4|3|2|6|7"
     * @param n
     * @return
     */
    public String getRandBox(int n){
        int [] boxAry = new int[Box.getStyleCount()];
        StringBuffer styleList = new StringBuffer();
        
        //��l�ƥi�ϥΪ����style,�ثe��1~7
        for(int i = 1; i <= boxAry.length; i++){
            boxAry[i - 1] = i;
        }
        
        //�N1~7����üƱƦC��A�ন�r��^��
        for(int i = 0; i < n; i++){
            int [] ary = randBoxAry(boxAry);
            for(int j = 0; j < ary.length; j++){
                if(styleList.length() > 0){
                    styleList.append("|");
                }
                styleList.append(ary[j]);
            }
        }
        
        return styleList.toString();
    }
    
    /**
     * �üƥ��ä���ƦC
     * @param ary
     * @return
     */
    private int [] randBoxAry(int [] ary){
        for(int i = 0; i < ary.length; i++){
            int tmpIndex = rand.nextInt(ary.length);
            int style = ary[tmpIndex];
            ary[tmpIndex] = ary[i];
            ary[i] = style;
        }
        return ary;
    }

    /**
     * ���X�w�����buffer�U�@�Ӥ��
     * @return
     */
    public int nextBox(){
        int style = 0;
        if(flag > styleAry.length - 1){
            flag = 0;
        }
        style = Integer.parseInt(styleAry[flag]);
        flag++;
        return style;
    }

    /**
     * ���X�w�����buffer n�Ӥ��
     * @param n
     * @return
     */
    public String [] getN_box(int n){
        String [] nBox = new String[n];
        int tmpFlag = flag;

        for(int i = 0; i < n; i++){
            if(tmpFlag > styleAry.length - 1){
                tmpFlag = 0;
            }
            nBox[i] = styleAry[tmpFlag];
            tmpFlag++;
        }
        return nBox;
    }

    /**
     * �������U��1��
     */
    public boolean moveDown(){
        return gameBox.moveDown();
    }

    /**
     * ����������1��
     */
    public boolean moveLeft(){
        if(isClean) return false;

        return gameBox.moveLeft();
    }

    /**
     * �������k��1��
     */
    public boolean moveRight(){
        if(isClean) return false;

        return gameBox.moveRight();
    }

    /**
     * ����������1��
     */
    public boolean turnLeft(){
        if(isClean) return false;

        return gameBox.turnLeft();
    }

    /**
     * �������f��1��
     */
    public boolean turnRight(){
        if(isClean) return false;

        return gameBox.turnRight();
    }

    /**
     * �������������w��
     */
    public void quickDown(){
        if(isClean) return;
        gameBox.quickDown();
        isClean = true;
    }


    /**
     * �s�W�U�����,�@���s�W�@��,�P�@��style
     * @param style �s�W�����style
     * @param lineCount �n�s�W�X��U�����
     */
    public void addGarbageBox(int style, int lineCount){
        for(int i = 0; i < lineCount; i++){
            gameBox.addGarbageBox_oneLine(style);
        }
    }

    /**
     * �s�W�U�����,�@���s�W�@��,�P�@��style
     * @param styleList �s�W�����style�C��A�榡��"1|2|3|4|5|6|0|0|2|3"
     */
    public void addGarbageBox_oneLine(String styleList){
        gameBox.addGarbageBox_oneLine(styleList);
    }

    /**
     * �ֳt�U������
     * @param b true:�ҥΧֲ�,false:�����ֲ�
     */
    public void fastDown(boolean b){
        fastEnable = b;
    }

    /**
     * �C���Ȱ�
     */
    public void pause(){
        isPause = true;
    }

    /**
     * �ثe�O�_�Ȱ���
     * @return
     */
    public boolean isPause(){
        return isPause;
    }

    /**
     * �~��C��(�����Ȱ�����ϥ�)
     */
    public void rusme(){
        isPause = false;
    }

    /**
     * �]�wGameOver���A,true:�C������,false:�C��������
     * @param b
     * @return
     */
    public void setGameOver(boolean b){
        isGameOver = b;
    }

    /**
     * ���o�ثe�O�_�C������
     * @return
     */
    public boolean isGameOver(){
        return isGameOver;
    }

    /**
     * �]�w�N�z��
     * @param o
     */
    public void setDelegate(ViewDelegate o){
        delegate = o;
    }

    /**
     * �]�w�ثe����������ݬ��
     * @param s
     */
    public void setSec(float s){
        sec = s;
    }

    /**
     * ���o�ثe����������ݬ��
     * @return
     */
    public float getSec(){
        return sec;
    }

    /**
     * �o�e��Ƶ��N�z��
     * @param code
     * @param data
     */
    public void putDelegateCode(String code, String data){
        if(delegate != null){
            delegate.tetrisEvent(code, data);
        }
    }

    /**
     * ���o�ثe�G���}�C�̡A�|�������ĴX�Ӧ�m�A0~20�ӳ��<BR>
     * �����b������쩳�ɩI�s(�YGameLoop��cleanLine()�Q�����)�A�~�i�o�쥿�T�����׸��
     * @return
     */
    public int getNowBoxIndex(){
        return gameBox.getNowBoxIndex();
    }

    /**
     * ���o�ثe����ӹC���e���i���ʤ���ϰ쪺�G���}�C
     */
    public int [][] getBoxAry(){
        return gameBox.getBoxAry();
    }
    /**
     * �üƲ��ͤ��
     */
    public boolean randCreatBox(){
        int style = rand.nextInt(Box.getStyleCount())+1;
        return gameBox.createBaseObj(style);
    }

    /**
     * �qbuffer������إ�
     * @return
     */
    public boolean nextCreatBox(){
        int style = nextBox();
        return gameBox.createBaseObj(style);
    }
    
    public int [][] createBox(int style){
        return gameBox.createBox(style);
    }

    public void cleanLine() {
        gameBox.addBox();
        putDelegateCode("repaint", "");
        putDelegateCode("boxDown", "");

        //    System.out.println("cleanLine----�Q����-------");

        //���o�i���������
        String lineData = gameBox.getClearLine();

        if(!lineData.equals("")){
            putDelegateCode("willCleanLine", lineData);
            gameBox.clearLine(lineData);//��ڱN�i�����������Ʋ���
            putDelegateCode("cleanLineOK", "");
        }

        putDelegateCode("garbageBox", lineData);


        boolean isOK = nextCreatBox();//�إߤ��
        if(!isOK){//�إߥ���
            isGameOver = true;
            putDelegateCode("repaint", "");
            //printAry(gameBox.getBoxAry());
            putDelegateCode("gameOver", "");
        }
        putDelegateCode("repaint", "");
        putDelegateCode("creatBox", "");
        isClean = false;
        checkCleanThread = new CheckCleanLineThread();
        checkCleanThread.setObj(this);
        checkCleanThread.startThread();
    }

    /**
     * �ثe��������w�w�椤�A�i���ˬd�i�����
     */
    public boolean isClean() {
        return isClean;
    }

    /**
     * �M�ž�ӵe���Ҧ����
     */
    public void clearBox(){
        gameBox.clearBoxAry();
    }

    /**
     * ���ۤv�o���M���������ƥh�����U������A�^�Ǧۤv�ٳѴX�����i�������u<BR>
     * ��method�ȯ����style��9���U�����
     * @param count
     * @return
     */
    public int removeGarbageBox_oneLine(int count){
        return gameBox.removeGarbageBox_oneLine(count);
    }

    /**
     * ���o���������
     * @return
     */
    public int [][] getNowBoxAry(){
        return gameBox.getNowBoxAry();
    }

    /**
     * ���o����������ثe��x�By��m
     * @return
     */
    public int [] getNowBoxXY(){
        return gameBox.getNowBoxXY();
    }

    /**
     * ���o���Y�Ӧ�m�|������
     * @return
     */
    public int getDownY(){
        return gameBox.getDownY();
    }


    public void close(){
        checkCleanThread.stopThread();
        delegate = null;
        rand = null;
        checkCleanThread = null;
        gameBox = null;
        styleAry = null;
    }

    /**
     * isGap��false�� ���o���windex�檺�����A�榡��"1|2|3|4|5||6|7|1|2|3@1|2|3|4|5||6|7|1|2|3@..."<BR>
     * isGap��true�� ���o���windex�檺�����A�榡��"1|2|3|4|5||6|7|1|0|0@1|2|3|4|5||6|7|1|2|0@..."
     *
     * @param lineData �����榡��:17,19,5...
     * @param isGap true ���X���w�Q������Ƹ�ƬO���[�W��������Afalse���X�i�Q����ƬO�[�W�������
     * @return
     */
    public String getLineList(String lineData,boolean isGap){
        return gameBox.getLineList(lineData, isGap);
    }

    //�L�X�}�C
    /*    public void printAry(int [][] tmp){
        //String digit = "��������������������";
        System.out.println("==================");
        for(int i = 0; i < tmp.length; i++){
            System.out.print("|");
            for(int j = 0; j < tmp[i].length; j++){
                if(tmp[i][j] > 0){
                    System.out.print("�f");
                    //System.out.print(digit.charAt(tmp[i][j]));
                }else{
                    System.out.print("�@");
                }
            }
            System.out.println("|");
        }
        System.out.println("==================");
    }*/

    /**
     * @param args
     */
    public static void main(String[] args) {
        GameLoop gl = new GameLoop();
        //gl.startGame();
        gl.setBoxList("1|2|3|4");


        System.out.println("gl.nextBox()"+gl.nextBox());
        System.out.println("gl.nextBox()"+gl.nextBox());

        String [] b = gl.getN_box(3);

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }

}