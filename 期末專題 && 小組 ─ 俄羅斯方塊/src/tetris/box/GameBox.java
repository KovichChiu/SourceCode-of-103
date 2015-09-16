package tetris.box;

public class GameBox{
    public int BOX_H = 20;
    public int BOX_W = 10;
    private int [][] boxAry;    //��ӥi�H��m����B���ʤ�����j�}�C

    private Box nowBox;        //�ثe���ʤ������    

    public GameBox() {
        GameBoxInit();
        //defaultMap();
    }

    public void GameBoxInit(){
        boxAry = new int[BOX_H][BOX_W];
    }

    //----------------------------public method------------begin--------------------
    /**
     * �إ߷s�����,�^��:true:�إߦ��\�A����������L���,false:�إߥ��ѡA��������L���
     * @param style
     * @return
     */
    public boolean createBaseObj(int style){
        boolean b = true;
        Box nb = new Box();
        nb.setBoxData(style);
        nb.nowX = (BOX_W / 2) - 1;
        nowBox = nb;

        if(hitTest(boxAry, nowBox)){//����@�إߴN����
            b = false;
        }
        return b;
    }
    
    public int [][] createBox(int style){
        Box b = new Box();
        b.setBoxData(style);
        return b.getBoxAry(0);
    }

    /**
     * �V�U��1��,�^�ǬO�_�i�A���U�� true:�i�~��U��,false:���i���U��
     * @return
     */
    public boolean moveDown(){
        Box tempNowBox = nowBox;

//        �P�_������쩳��
        int boxY = tempNowBox.nowY + tempNowBox.getNowTurnHeight();
        if(boxY >= BOX_H){
            return false;
        }

        boolean b = true;
        int [][] nbAry = tempNowBox.getNowturnBoxAry();
        int nx = tempNowBox.nowX;
        int ny = tempNowBox.nowY;

        if(hitTest(boxAry, nbAry, nx, ny + 1)){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
            b = false;
        }else{//����S�I�����L����A�i�U��
            tempNowBox.move(0, 1);
        }
        return b;
    }

    /**
     * ����k��,�^�ǬO�_�i�A���k�� true:�i�~��k��,false:���i���k��
     * @return
     */
    public boolean moveRight(){
        boolean b = true;
        Box tempNowBox = nowBox;
        //���o�ثe����k���᪺x��m+�W������e��
        int x = tempNowBox.nowX + tempNowBox.getNowTurnWight()+1;//���]�k��1��

        if(x > BOX_W){//�P�_�����m�O�_�|�W�LboxAry���e��
            b = false;
        }else{//�S�W�L��A�P�_�O�_�����L���
            if(hitTest(boxAry, tempNowBox.getNowturnBoxAry(), tempNowBox.nowX + 1, tempNowBox.nowY)){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
                b = false;
            }else{
                tempNowBox.move(1, 0);
            }
        }

        return b;
    }

    /**
     * �������1��,�^�ǬO�_�i�A������ true:�i�~�򥪲�,false:���i������
     * @return
     */
    public boolean moveLeft(){
        boolean b = true;
        Box tempNowBox = nowBox;
        int [][] nowturnBoxAry = tempNowBox.getNowturnBoxAry();
        int x = tempNowBox.nowX - 1;

        //�P�_��������̥����l�ɡA��������O�_�i�A����
        if(x == -1){
            for(int i = 0; i < nowturnBoxAry.length; i++){
                if(nowturnBoxAry[i][0] > 0){
                    return false;
                }
            }
        }

        if( x < -1){
            b = false;
        }else{
            if(hitTest(boxAry, nowturnBoxAry, tempNowBox.nowX - 1, tempNowBox.nowY)){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
                b = false;
            }else{
                tempNowBox.move(-1, 0);
            }
        }

        return b;
    }

    /**
     * �������������w��
     */
    public void quickDown(){
        while(true){
            if(!moveDown()){
                break;
            }
        }
    }

    /**
     * ���ɰw��,true:�i�~����,false:���බ��
     * @return
     */
    public boolean turnRight(){
        Box tempNowBox = nowBox;
        int rightTurn = tempNowBox.nextTurn(1);//���X����1���᪺�����m���ޭ�
        int turnW = tempNowBox.getWight(rightTurn);
        int turnH = tempNowBox.getHeight(rightTurn);
        int h = tempNowBox.nowY + turnH;
        int ny = tempNowBox.nowY;
        int nx = tempNowBox.nowX;
        int w = tempNowBox.nowX + turnW;
        int [][] turnAry = tempNowBox.getBoxAry(rightTurn);

        if(h > BOX_H){//�P�_����᪺�����m�O�_�|�W�LboxAry���e�שΩ���
            return false;
        }if(nx == -1){
            //if(w > BOX_W){//�P�_�O�_��V�W�X�k��,�A�P�_�W�X��A�����������O�_�|�����L���
                int tmpX = 1;

                if(hitTest(boxAry, turnAry, nx + tmpX, ny) ){
                    return false;
                }else{
                    tempNowBox.move(tmpX, 0);
                    nx = tempNowBox.nowX;
                }
            //}

            if(hitTest(boxAry, turnAry, nx, ny) ){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
                return false;
            }else{
                tempNowBox.turnRight();
                return true;
            }
        }else{
            if(w > BOX_W){//�P�_�O�_��V�W�X�k��,�A�P�_�W�X��A�����������O�_�|�����L���
                int tmpX = w - BOX_W;

                if(hitTest(boxAry, turnAry, nx + (-tmpX), ny) ){
                    return false;
                }else{
                    tempNowBox.move(-tmpX, 0);
                    nx = tempNowBox.nowX;
                }
            }

            if(hitTest(boxAry, turnAry, nx, ny) ){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
                return false;
            }else{
                tempNowBox.turnRight();
                return true;
            }
        }
    }

    /**
     * �f�ɰw��,true:�i�~��f��,false:����f��
     * @return
     */
    public boolean turnLeft(){
        Box tempNowBox = nowBox;
        int leftTurn = tempNowBox.nextTurn(-1);//���X�f��1���᪺�����m���ޭ�
        int turnH = tempNowBox.getHeight(leftTurn) + tempNowBox.nowY;
        int turnW = tempNowBox.getWight(leftTurn);
        int w = tempNowBox.nowX + turnW;
        int nx = tempNowBox.nowX;
        int ny = tempNowBox.nowY;
        int [][] turnAry = tempNowBox.getBoxAry(leftTurn);

        if(turnH > BOX_H){//�P�_��V�O�_�W�X����
            return false;
        }if(nx == -1){
            //if(w > BOX_W){//�P�_�O�_��V�W�X�k��,�A�P�_�W�X��A�����������O�_�|�����L���
                int tmpX = 1;

                if(hitTest(boxAry, turnAry, nx + tmpX, ny) ){
                    return false;
                }else{
                    tempNowBox.move(tmpX, 0);
                    nx = tempNowBox.nowX;
                }
            //}

            if(hitTest(boxAry, turnAry, nx, ny) ){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
                return false;
            }else{
                tempNowBox.turnRight();
                return true;
            }
        }else{//�S�W�L����
            if(w > BOX_W){//�P�_�O�_�W�L�e��
                int tmpX = w - BOX_W;

                if(hitTest(boxAry, turnAry, nx + (-tmpX), ny) ){//�P�_��V��O�_�����L���
                    return false;
                }else{//�����V��W�X�e�סA�]���N�������tmpX��
                    tempNowBox.move(-tmpX, 0);
                    nx = tempNowBox.nowX;
                }
            }

            if(hitTest(boxAry, turnAry, nx, ny) ){//�P�_�ثe��m������O�_�����L�b�jboxAry�̪������
                return false;
            }else{//����i�f��
                tempNowBox.turnLeft();
                return true;
            }
        }
    }

    /**
     * �u���M����溡�����
     * @param tempBoxAry
     * @param startIndex
     * @param line
     * @return
     */
    public void clearLine(String lineData){
        if(!lineData.equals("")){
            String [] data = lineData.split("[,]");

            for(int i = 0; i < data.length; i++){
                int line = Integer.parseInt(data[i]);
                moveLine(boxAry, 0, line);
            }
        }
    }

    /**
     * �M�ž�ӥi���ʤ���ϰ쪺�G���}�C
     */
    public void clearBoxAry(){
        for(int i = 0; i < boxAry.length; i++){
            for(int j = 0; j < boxAry[i].length; j++){
                //System.out.println("�M���"+boxAry[i][j]);
                boxAry[i][j] = 0;
            }
        }
    }

    /**
     * ���o�ثe����ӹC���e���i���ʤ���ϰ쪺�G���}�C
     */
    public int [][] getBoxAry(){
        return boxAry;
    }

    /**
     * ���o�ثe�G���}�C�̡A�|�������ĴX�Ӧ�m�A0~20�ӳ��<BR>
     * �����b������쩳�ɩI�s(�YGameLoop��cleanLine()�Q�����)�A�~�i�o�쥿�T�����׸��
     * @return
     */
    public int getNowBoxIndex(){
        int index = boxAry.length + 1;
        for(int i = 0; i < boxAry.length; i++){
            index--;
            for(int j = 0; j < boxAry[i].length; j++){
                if(boxAry[i][j] > 0){
                    return index;
                }
            }
        }
        return index;
    }

    /**
     * ���o�i�M������Ƹ��,�Ҧp: "17,19" ��ܥi������17�B19��,style��9��ܤ��i�������U�����
     * @return
     */
    public String getClearLine(){
        Box nb = nowBox;
        StringBuffer lineList = new StringBuffer();
        int ny = nb.nowY;
        //System.out.println("�q��["+ny+"]��}�l�����i��"+nb.nowX);

        for(int i = ny; i < boxAry.length; i++){
            int BW = boxAry[i].length;
            int checkCnt = 0;
            for(int j = 0; j < BW; j++){
                int boxStyle = boxAry[i][j];
                if(boxStyle > 0 && boxStyle != 9){
                    checkCnt++;
                    if(checkCnt == BW){
                        if(lineList.length() > 0){
                            lineList.append(",");
                        }
                        lineList.append(i);
                        //System.out.println("�i������["+i+"]��");
                    }
                }
            }
        }
        return lineList.toString();
    }

    /**
     * �s�W�U�����,�@���s�W�@��,�P�@��style
     * @param style �s�W�����style
     */
    public void addGarbageBox_oneLine(int style){
        int [][] tmpAry = boxAry;
        int [] tmp = tmpAry[0];

        int i = 0;
        while(i < tmpAry.length - 1){
            tmpAry[i] = tmpAry[i + 1];
            i++;
        }

        tmpAry[i] = tmp;
        for(int j = 0; j < tmpAry[i].length; j++){
            tmpAry[i][j] = style;
        }
    }


    /**
     * �s�W�U�����,�@���s�W�@��,�P�@��style
     * @param styleList �s�W�����style�C��A�榡��"1|2|3|4|5|6|0|0|2|3"
     */
    public void addGarbageBox_oneLine(String styleList){
        String [] styleAry = styleList.split("[|]");
        int [][] tmpAry = boxAry;
        int [] tmp = tmpAry[0];

        int i = 0;
        while(i < tmpAry.length - 1){
            tmpAry[i] = tmpAry[i + 1];
            i++;
        }

        tmpAry[i] = tmp;
        for(int j = 0; j < tmpAry[i].length && j < styleAry.length; j++){
            int style = Integer.parseInt(styleAry[j]);
            if(style > 0){//�P�_���쪺����O��L�C����ন���8���C��
                style = 8;
            }
            tmpAry[i][j] = style;
        }
    }

    /**
     * ���ۤv�o���M���������ƥh�����U������A�^�Ǧۤv�ٳѴX�����i�������u<BR>
     * ��method�ȯ����style��9���U�����
     * @param count
     * @return
     */
    public int removeGarbageBox_oneLine(int count){
        if(count == 0){
            return 0;
        }

        int lineCount = count;//�o���ۤv�����X����
        int garbageCount = 0;//�ۤv�ثe���U�������

        //�p��ۤv���X�椣��������U�����
        for(int i =  boxAry.length - 1; i >= 0; i-- ){
            int style = boxAry[i][0];
            if(style == 9){
                garbageCount++;
            }
        }

        //�H�ۤv��������ƥh�M���U��������
        for(int i = count - 1; i >= 0 && garbageCount > 0; i--){
            //int line = Integer.parseInt(data[i]);
            moveLine(boxAry, 0, boxAry.length - 1);
            garbageCount--;
            lineCount--;
        }

        return lineCount;
    }

    /**
     * ���o���������
     * @return
     */
    public int [][] getNowBoxAry(){
        return nowBox.getNowturnBoxAry();
    }

    /**
     * ���o���������
     * @return
     */
    public String getNowturnBoxStyleStr(){
        return nowBox.getNowturnBoxStyleStr();
    }

    /**
     * ���o����������ثe��x�By��m,w,h�e��
     * @return
     */
    public int [] getNowBoxXY(){
        Box tempNowBox = nowBox;
        int [] xy = new int[4];
        xy[0] = tempNowBox.nowX;
        xy[1] = tempNowBox.nowY;
        xy[2] = tempNowBox.getNowTurnWight();
        xy[3] = tempNowBox.getNowTurnHeight();

        return xy;
    }

    /**
     * ���o���Y�Ӧ�m�|������,�^�ǥثe������������|���쪺���Ψ�L�������w���m
     * @return
     */
    public int getDownY(){
        Box tempNowBox = nowBox;
        int nx = tempNowBox.nowX;
        int ny = tempNowBox.nowY;
        int [][] nbAry = tempNowBox.getNowturnBoxAry();

        while(true){
//            �P�_������쩳��
            int boxY = ny + tempNowBox.getNowTurnHeight();
            if(boxY >= BOX_H){
                return ny;
            }

            if(hitTest(boxAry, nbAry, nx, ny + 1)){//����S�I�����L����A�i�U��
                break;
            }else{
                ny++;
            }
        }
        return ny;
    }

    /**
     * �e�W�s��m���
     * @param b
     * @param x
     * @param y
     */
    public void addBox(){
        Box nb = nowBox;
        int [][] tempBoxAry = boxAry;
        int x = nb.nowX;
        int y = nb.nowY;
        int [][] b = nb.getNowturnBoxAry();

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                if(b[i][j] > 0)
                    tempBoxAry[i+y][j+x] = nb.getStyle();
            }
        }
    }

    /**
     *
     * @param lineData
     * @param isGap
     * @return
     */
    public String getLineList(String lineData,boolean isGap){
        Box nb = nowBox;
        int [][] tempBoxAry = boxAry;
        StringBuffer lineListStr = new StringBuffer();
        String [] lineAry = lineData.split("[,]");

        if(isGap){
            int [][] downBox = nb.getNowturnBoxAry();
            int nx = nb.nowX;
            int ny = nb.nowY;
            for(int i = 0; i < downBox.length; i++){
                for(int j = 0; j < downBox[i].length; j++){
                    if(downBox[i][j] > 0){
                        //System.out.println("�M��["+(i+oy)+"]["+(j+ox)+"]");
                        for(int k = 0; k < lineAry.length; k++){
                            if(lineAry[k].equals(String.valueOf(i+ny))){
                                tempBoxAry[i+ny][j+nx] = 0;
                                break;
                            }
                        }

                    }
                }
            }
        }


        for(int i = 0; i < lineAry.length; i++){
            int line = Integer.parseInt(lineAry[i]);

            int [] box = boxAry[line];
            StringBuffer lineStr = new StringBuffer();
            for(int j = 0; j < box.length; j++){
                if(lineStr.length() > 0){
                    lineStr.append("|");
                }
                lineStr.append(box[j]);
            }
            if(lineListStr.length() > 0){
                lineListStr.append("@");
            }
            lineListStr.append(lineStr);
            lineStr.setLength(0);
        }
        return lineListStr.toString();
    }

    //------------------------------public method--------------end--------------------



    //------------------------------private method----begin-------------------

    /**
     * �P�_�ثe������A�O�_�I����boxAry�̨�L�����
     * @param tempBoxAry
     * @param nb
     * @return
     */
    protected boolean hitTest(int [][] tempBoxAry,Box nb){
        int [][] newBox = nb.getNowturnBoxAry();
        int ny = nb.nowY;
        int nx = nb.nowX;

        return hitTest(tempBoxAry, newBox, nx, ny);
    }

    /**
     * �ˬd����I��
     * @param tempBoxAry    20 x 10���j�}�C
     * @param boxBaseAry    �n�s�W�W�h������}�C
     * @param nx            ����ثe��x��m
     * @param ny            ����ثe��y��m
     * @return
     */
    protected boolean hitTest(int [][] tempBoxAry, int [][] boxBaseAry, int nx, int ny){
        for(int i = 0; i < boxBaseAry.length; i++){
            for(int j = 0; j < boxBaseAry[i].length; j++){
                //System.out.println("����I["+i+"]["+j+"],�I���I["+(i+ny)+"]["+(j+nx)+"]");
                int nbNum = boxBaseAry[i][j];
                if(nbNum > 0){
                    int byNum = tempBoxAry[i+ny][j+nx];
                    if(byNum > 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * �M�����ƺ������
     * @param tmpAry
     * @param startIndex    �}�l����m
     * @param endIndex        ��������m
     */
    protected void moveLine(int [][] tmpAry, int startIndex, int endIndex){
        int [] tmp = tmpAry[endIndex];

        for(int i = endIndex - 1; i >= startIndex; i--){
            tmpAry[i+1] = tmpAry[i];
        }
        tmpAry[startIndex] = tmp;
        for(int j = 0; j < tmpAry[startIndex].length; j++){
            tmpAry[startIndex][j] = 0;
        }
    }


//    ------------------------------private method----end-------------------


    //���ե�---------------------begin-----------------

    /**
     * �@�}�l�ɪ��w�]�a��
     */
    public void defaultMap(){
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
        addGarbageBox_oneLine(9);
    }

//    ���ե�---------------------end-----------------

}
