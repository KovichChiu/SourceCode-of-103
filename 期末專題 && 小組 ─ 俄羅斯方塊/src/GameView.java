import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;

import tetris.GameLoop;
import tetris.ViewDelegate;

/**
 * �����O�u���e���B�z�A����������ʹB��A�Ҧ�GameLoop���O��Ĳ�o���ƥ�|�q�������O��tetrisEvent() method
 * @author �N�L�� Ray
 *
 */
public class GameView extends JComponent implements ViewDelegate{
    private int NEXT_BOX_COUNT = 3;                    //�U���n�X�{������i��ܭӼ�
    private int [][][] boxBuffer;                    //�U���n�X�{�����style
    private int VIEW_MODE = 1;                        //�e�����
    private int BOX_START_X = 62 * VIEW_MODE;        //�����������l��mx
    private int BOX_START_Y = 79 * VIEW_MODE;        //�����������l��my
    private int FRAME_W = 350 * VIEW_MODE;            //�C���e���e
    private int FRAME_H = 480 * VIEW_MODE;            //�C���e����
    private int BOX_IMG_W = 19 * VIEW_MODE;            //�C�Ӥ����e
    private int BOX_IMG_H = 19 * VIEW_MODE;            //�C�Ӥ���氪
    private int ALPHA = 125;                                //���v�z����0~250
    private long score;
    private Color [] color = {null
            ,new Color(0,255,255,250)
            ,new Color(0,0,255,250)
            ,new Color(0,255,0,250)
            ,new Color(255,0,0,250)
            ,new Color(255,255,0,250)
            ,new Color(255,0,255,250)
            ,new Color(50,100,150,250)};
    private Color [] colorAlpha = {null
            ,new Color(0,255,255,ALPHA)
            ,new Color(0,0,255,ALPHA)
            ,new Color(0,255,0,ALPHA)
            ,new Color(255,0,0,ALPHA)
            ,new Color(255,255,0,ALPHA)
            ,new Color(255,0,255,ALPHA)
            ,new Color(50,100,150,ALPHA)};

    private GameLoop tetrisGame;                    //�C���޿�(�L�e��)

    public GameView(){
    }

    public void GameViewInit(){
        //�إ߹C���޿�
        tetrisGame = new GameLoop();

        //�]�w�ϥ�GameView�N�z�C���޿�i��e����ø��
        tetrisGame.setDelegate(this);

        //�]�w���������Ƭ�0.5��
        tetrisGame.setSec(0.5f);

        //�]�w�U���n�X�{�����style�ӼƬ����3��
        boxBuffer = getBufBox(tetrisGame, NEXT_BOX_COUNT);
        

        //�ҰʹC���޿�����
        tetrisGame.startGame();

        //�]�w�e���j�p
        setSize(FRAME_W,FRAME_H);
    }

    //������L�ƥ�
    public void keyCode(int code){
        if(tetrisGame.isGameOver()){
            return;
        }
        if(!tetrisGame.isPause()){
            switch(code){
            case KeyEvent.VK_UP://�W,������
                tetrisGame.turnRight();
                break;
            case KeyEvent.VK_DOWN://�U,�U�����
                tetrisGame.moveDown();
                break;
            case KeyEvent.VK_LEFT://��,�������
                tetrisGame.moveLeft();
                break;
            case KeyEvent.VK_RIGHT://�k,�k�����
                tetrisGame.moveRight();
                break;
            case KeyEvent.VK_SPACE://�ť���,�ֳt�������
                tetrisGame.quickDown();
                break;
            case KeyEvent.VK_S://S��,�Ȱ�
                tetrisGame.pause();
                break;
            default:
            }
        }else{
            if(code == KeyEvent.VK_R){//R��,�^��C���~��
                tetrisGame.rusme();;
            }
        }

        //�C�����F��L�N�N�e����ø
        repaint();
    }

//    ���w�İ�ø��
    public void paintComponent(Graphics g){
        Image bufferImg = createImage(FRAME_W, FRAME_H);//�s�ؤ@�iimage����
        Graphics buffImg = bufferImg.getGraphics();//�qimage�̨��X�@�i�e��

        //���Ӱ}�C�n�e���ϡA�e��Ȧs���e���W�h(�Y�ᴺ)
        int [][] boxAry = tetrisGame.getBoxAry();
        showBacegroundBox(boxAry, buffImg);

        //�e�����������
        int [] xy = tetrisGame.getNowBoxXY();
        int [][] box = tetrisGame.getNowBoxAry();
        showDownBox(xy, box, buffImg);

//        �e�k��U���n�X�{�����
        showBufferBox(boxBuffer, buffImg);

//        �e���v
        shadow(xy,box, buffImg,tetrisGame.getDownY());

        //��ܤ���
        showScore(score, buffImg);
        
        //�N�Ȧs���ϡA�e��e��
        g.drawImage(bufferImg,0,0,this);
        buffImg.dispose();
    }

    //�e�w������P��L�I����l
    private void showBacegroundBox(int [][] boxAry, Graphics buffImg){
        for(int i = 0; i < boxAry.length; i++){
            for(int j = 0; j < boxAry[i].length; j++){
                int style = boxAry[i][j];
                if(style > 0){//�e�w�����
                    //buffImg.fillOval(BOX_START_X + (BOX_IMG_W * j),BOX_START_Y + (BOX_IMG_H * i),BOX_IMG_W,BOX_IMG_H);
                    drawBox(style, j, i, buffImg);
                }else{//�e��L�I����l
                    buffImg.drawRect(BOX_START_X + (BOX_IMG_W * j),BOX_START_Y + (BOX_IMG_H * i),BOX_IMG_W,BOX_IMG_H);
                }
            }
        }
    }

//    �e�����������
    private void showDownBox(int [] xy, int [][] box, Graphics buffImg){
        int boxX = xy[0];
        int boxY = xy[1];
        for(int i = 0; i < box.length; i++){
            for(int j = 0; j < box[i].length; j++){
                int style = box[i][j];
                if(style > 0){
                    drawBox(style, (j + boxX), (i + boxY), buffImg);
                }
            }
        }
    }

//    �e�k��U���n�X�{�����
    private void showBufferBox(int [][][] boxBuf, Graphics buffImg){
        for(int n = 0; n < boxBuf.length; n++){
            int [][] ary = boxBuf[n];

            for(int i = 0; i < ary.length; i++){
                for(int j = 0; j < ary[i].length; j++){
                    int style = ary[i][j];
                    if(style > 0){
                        //buffImg.drawOval(160 + (BOX_IMG_W * (j + 5)),0 + (BOX_IMG_H * (i + 5)), BOX_IMG_W, BOX_IMG_H);
                        buffImg.setColor(color[style]);
                        buffImg.fill3DRect(160 + (BOX_IMG_W * (j + 5)),(n * 50) + (BOX_IMG_H * (i + 5)), BOX_IMG_W, BOX_IMG_H, true);
                        //buffImg.setColor(Color.BLACK);
                        //buffImg.drawRect(160 + (BOX_IMG_W * (j + 5)),(n * 50) + (BOX_IMG_H * (i + 5)), BOX_IMG_W, BOX_IMG_H);
                    }
                }
            }
        }
    }

//    �e���v
    private void shadow(int [] xy,int [][] box,Graphics buffImg, int index){
        int boxX = xy[0];
        //int boxY = xy[1];

        for(int i = 0; i < box.length; i++){
            for(int j = 0; j < box[i].length; j++){
                int style = box[i][j];
                if(style > 0){
                    buffImg.setColor(colorAlpha[style]);
                    buffImg.fill3DRect(BOX_START_X + (BOX_IMG_W * (j + boxX)),BOX_START_Y + (BOX_IMG_H * (i + index)), BOX_IMG_W, BOX_IMG_H, true);
                }
            }
        }
    }
    
    private void showScore(long sc, Graphics buffImg){
        buffImg.setColor(Color.RED);
        buffImg.drawString("SCORE:"+sc, 50, 50);
    }
    
    /**
     * �e�C�Ӥp��l
     * @param style
     * @param x
     * @param y
     * @param buffImg
     */
    public void drawBox(int style, int x, int y, Graphics buffImg){
        //buffImg.fill3DRect(arg0, arg1, arg2, arg3, arg4)
        buffImg.setColor(color[style]);
        buffImg.fill3DRect(BOX_START_X + (BOX_IMG_W * x),BOX_START_Y + (BOX_IMG_H * y),BOX_IMG_W,BOX_IMG_H, true);
        buffImg.setColor(Color.BLACK);
        //buffImg.drawRect(BOX_START_X + (BOX_IMG_W * x),BOX_START_Y + (BOX_IMG_H * y),BOX_IMG_W,BOX_IMG_H);
    }
    
    /**
     * �N�U�Ӥ���r���ন2������}�C�A�H�Kø��
     * @param bufbox
     * @param tetris
     * @return
     */
    public int [][][] getBufBox(GameLoop tetris, int cnt){
        String [] bufbox = tetris.getN_box(cnt);
        int [][][] ary = new int[bufbox.length][][];
        for(int i = 0; i < bufbox.length; i++){
            ary[i] = tetris.createBox(Integer.parseInt(bufbox[i]));
        }
        return ary;
    }

    /**
     * �Ҧ�
     */
    public void tetrisEvent(String code, String data) {
        //���쭫�e�ۤv�e�����}�C
        if(code.equals("repaint")){
            repaint();
            return;
        }
        //������쩳
        if(code.equals("boxDown")){
            System.out.println("�{�b�������["+tetrisGame.getNowBoxIndex()+"]");
            
            //������쩳�w��ʵe

            return;
        }
        //�إߧ��U�@�Ӥ��
        if(code.equals("creatBox")){
            boxBuffer = getBufBox(tetrisGame, NEXT_BOX_COUNT);
            return;
        }
//        ������i�M��,�N�n�M�����,�i���o�n���h��������
        if(code.equals("willCleanLine")){
            System.out.println("������i�M��,�N�n�M�����,�i���o�n���h��������");
            score += (tetrisGame.getNowBoxIndex() + 1) * 100;//�[����
            //System.out.println("�U������Ҧ�==>,index��m["+data+"],��Ƭ�["+tetrisGame.getLineList(data,false)+"]");
            //System.out.println("�W������Ҧ�==>index��m["+data+"],��Ƭ�["+tetrisGame.getLineList(data,true)+"]");
            return;
        }
        //����M������
        if(code.equals("cleanLineOK")){
            System.out.println("����M������"+data);


            return;
        }
        //�p��ۤv�U�������
        if(code.equals("garbageBox")){


            return;
        }
        //�������̰��B�A�C������
        if(code.equals("gameOver")){
            System.out.println("��᭫�s...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            score = 0;
            //�M�����e�����
            tetrisGame.clearBox();

            //�����쳻�ɡA�|�۰ʱNGameOver�]��true,�]���U���n�}�l�ɻݳ]�w�C����false��ܥi�i��C��
            tetrisGame.setGameOver(false);
        }
        return;
    }

    public void objEvent(String code, Object obj) {

    }
}