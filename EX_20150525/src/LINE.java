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
 
  //實做自訂元件時，
  //最好覆寫這getPreferredSize、getMaximumSize、getMinimumSize三個方法
  //因為許多LayoutManager都可能由這三個方法來決定此物件的大小
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
   //設定視窗的外觀
   JFrame.setDefaultLookAndFeelDecorated(true);
 
 
   JFrame frame = new JFrame("MyCanvasDemo_2");
 
   //在Swing的JFrame元件中，
   //要增加元件或是設定LayoutManager等動作，
   //要間接透過getContentPane()方法取得RootPane，
   //才能在上面進行動作。
   frame.getContentPane().add(new LINE());
   frame.getContentPane().setBackground(Color.WHITE);
 
   //設定視窗顯示在螢幕在的位置
   frame.setLocation(1300,100);
 
   //讓視窗右上角的X圖示被按下之後，視窗會關閉
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
   frame.pack();
   frame.setVisible(true);
  }
 }
 