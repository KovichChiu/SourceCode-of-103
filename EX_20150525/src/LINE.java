 import javax.swing.*; 
 import java.awt.*; 
 public class LINE extends JComponent { 
  public LINE() {
 
  }
   
  public void paintComponent(Graphics g) {
   super.paintComponent(g);
   
   
   
   for(int i=0;i<=10;i++){
	   g.drawLine(100+(i*20),100,100+(i*20),500);
   }
   for(int i=0;i<=20;i++){
	   g.drawLine(100,100+(i*20),300,100+(i*20));
   }
   g.setColor(Color.orange);
   g.fillRect(101,101,19,19);
   g.fillRect(121,101,19,19);
   g.fillRect(141,101,19,19);
   g.fillRect(161,101,19,19);
 
  }
 
  //�갵�ۭq����ɡA
  //�̦n�мg�ogetPreferredSize�BgetMaximumSize�BgetMinimumSize�T�Ӥ�k
  //�]���\�hLayoutManager���i��ѳo�T�Ӥ�k�ӨM�w�����󪺤j�p
  public Dimension getPreferredSize() {
   return new Dimension(400, 600);
  }
 
  public Dimension getMaximumSize() {
   return getPreferredSize();
  }
 
  public Dimension getMinimumSize() {
   return getPreferredSize();
  }
 
  public static void main(String[] args) {
   //�]�w�������~�[
   JFrame.setDefaultLookAndFeelDecorated(true);
 
 
   JFrame frame = new JFrame("MyCanvasDemo_2");
 
   //�bSwing��JFrame���󤤡A
   //�n�W�[����άO�]�wLayoutManager���ʧ@�A
   //�n�����z�LgetContentPane()��k���oRootPane�A
   //�~��b�W���i��ʧ@�C
   frame.getContentPane().add(new LINE());
   frame.getContentPane().setBackground(Color.WHITE);
 
   //�]�w������ܦb�ù��b����m
   frame.setLocation(1300,100);
 
   //�������k�W����X�ϥܳQ���U����A�����|����
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
   frame.pack();
   frame.setVisible(true);
  }
 }
 