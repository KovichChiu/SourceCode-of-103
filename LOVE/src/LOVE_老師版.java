import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class LOVE_老師版 extends Frame implements ActionListener
{
   static LOVE_老師版 frm=new LOVE_老師版();
   static Button btn= new Button("Draw");      
   static int width=800;
   static int height=100;
   public static void main(String args[])
   {	  
	  //frm.setTitle("Polyline");
	  
      frm.setSize(width,height);      
      BorderLayout br=new BorderLayout();
      frm.setLayout(br);
      JPanel panel =new JPanel();
      frm.add(panel);
      panel.add(btn);      
      //frm.add(btn,br.SOUTH);
      btn.addActionListener((ActionListener) frm);
      
      frm.setVisible(true);
   }
    
   public void actionPerformed(ActionEvent e)
   { 	  
      Graphics g=getGraphics();
      paintComponent(g); 
   }
   
   public static void paintComponent(Graphics g){
	      g.setColor( Color.white );
	      g.fillRect (0, 0, width, height*4); 
	      int x[]={0}; 
	      int y1[]={0};
	      int y2[]={0};
	      int i,xval,yval;	      
	      System.out.println("Enter: L O V E");
	      Scanner input = new Scanner(System.in);
	      String love=input.nextLine();
	      if (new String("L").equals(love)){
	    	  System.out.println("L");
	    	  x=new int[width];
	    	  y1=new int[width];
	    	  y2=new int[width];
	    	  for(i=0;i<x.length;i++)
		      {
		    	
		    	//sine
		    	/*xval=i-(x.length/2);
		    	x[i]=xval;
		    	y1[i]=(int) ((Math.sin(xval*3.14/180))*height)+(height*2);
		    	y2[i]=0+height*2;*/
		    	  
		    	//E
			    /*yval=i-(y1.length/2);
			    y1[i]=yval;
			    x[i]=height*2-(int) (Math.abs((Math.sin(yval*3.14/180)))*height);
			    y1[i]=y1[i]+(height*2);
			    y2[i]=0+height*2;*/
		    	
		    	//  L
		    	xval=i+1;
		    	x[i]=xval;
		    	y1[i]=(int) (-1.0/xval*height*16)+(height*2);
		    	y2[i]=0+height*2;
		    	  
		    	// V
			    /*xval=i-(x.length/2);
			    x[i]=xval;
			    y1[i]=height*2-(int) (Math.abs(-2*xval));
			    y2[i]=0+height*2;
		    	x[i]=x[i]+width/2;*/
		      }
	    	  g.setColor(Color.black);	      
		      g.drawRect(0, 0, width, height*4);
		      g.setColor(Color.red);
		      g.drawPolyline(x,y1,x.length);   
		      g.setColor(Color.green);
		      g.drawPolyline(x,y2,x.length);
		      g.setColor(Color.orange);
		      String str="   (x,y)=(0,0)";
	    	  g.drawString(str,0,height*2);//L 
	      }else if (new String("O").equals(love)){
	    	  System.out.println("O");
	    	  x=new int[360]; //O,E
	    	  y1=new int[360];//O,E
	    	  y2=new int[360];//O,E
	    	  // O
		      for(int th=0;th<360;th++)
		      {
		            
		    	  x[th]=	(int) ((Math.sin(th*3.14/180))*height)+(height*2);
		    	  y1[th]=	(int) ((Math.cos(th*3.14/180))*height)+(height*2);
		    	  y2[th]=0+height*2;
		      }
		      g.setColor(Color.black);	      
		      g.drawRect(0, 0, width, height*4);
		      g.setColor(Color.red);
		      g.drawPolyline(x,y1,x.length);   
		      g.setColor(Color.green);
		      g.drawPolyline(x,y2,x.length);
		      g.setColor(Color.orange);
		      String str="   (x,y)=(0,0)";
		      g.drawString(str,(int)(width/5.0),height*2);//sine, O, E 
	      }else if (new String("V").equals(love)){
	    	  System.out.println("V");
	    	  x=new int[width];
	    	  y1=new int[width];
	    	  y2=new int[width];
	    	  for(i=0;i<x.length;i++)
		      {
		    	
		    	//sine
		    	/*xval=i-(x.length/2);
		    	x[i]=xval;
		    	y1[i]=(int) ((Math.sin(xval*3.14/180))*height)+(height*2);
		    	y2[i]=0+height*2;*/
		    	  
		    	//E
			    /*yval=i-(y1.length/2);
			    y1[i]=yval;
			    x[i]=height*2-(int) (Math.abs((Math.sin(yval*3.14/180)))*height);
			    y1[i]=y1[i]+(height*2);
			    y2[i]=0+height*2;*/
		    	
		    	//  L
		    	/*xval=i+1;
		    	x[i]=xval;
		    	y1[i]=(int) (-1.0/xval*height*16)+(height*2);
		    	y2[i]=0+height*2;*/
		    	  
		    	// V
			    xval=i-(x.length/2);
			    x[i]=xval;
			    y1[i]=height*2-(int) (Math.abs(-2*xval));
			    y2[i]=0+height*2;
		    	x[i]=x[i]+width/2;
		      }
	    	  g.setColor(Color.black);	      
		      g.drawRect(0, 0, width, height*4);
		      g.setColor(Color.red);
		      g.drawPolyline(x,y1,x.length);   
		      g.setColor(Color.green);
		      g.drawPolyline(x,y2,x.length);
		      g.setColor(Color.orange);
		      String str="   (x,y)=(0,0)";
	    	  g.drawString(str,(int)(width/2.0),height*2);//V 
	      }else if (new String("E").equals(love)){
	    	  System.out.println("E");
	    	  x=new int[360]; //O,E
	    	  y1=new int[360];//O,E
	    	  y2=new int[360];//O,E
	    	  for(i=0;i<x.length;i++)
		      {
		    	
		    	//sine
		    	/*xval=i-(x.length/2);
		    	x[i]=xval;
		    	y1[i]=(int) ((Math.sin(xval*3.14/180))*height)+(height*2);
		    	y2[i]=0+height*2;*/
		    	  
		    	//E
			    yval=i-(y1.length/2);
			    y1[i]=yval;
			    x[i]=height*2-(int) (Math.abs((Math.sin(yval*3.14/180)))*height);
			    y1[i]=y1[i]+(height*2);
			    y2[i]=0+height*2;
		    	
		    	//  L
		    	/*xval=i+1;
		    	x[i]=xval;
		    	y1[i]=(int) (-1.0/xval*height*16)+(height*2);
		    	y2[i]=0+height*2;*/
		    	  
		    	// V
			    /*xval=i-(x.length/2);
			    x[i]=xval;
			    y1[i]=height*2-(int) (Math.abs(-2*xval));
			    y2[i]=0+height*2;
		    	x[i]=x[i]+width/2;*/
		      }
	    	  g.setColor(Color.black);	      
		      g.drawRect(0, 0, width, height*4);
		      g.setColor(Color.red);
		      g.drawPolyline(x,y1,x.length);   
		      g.setColor(Color.green);
		      g.drawPolyline(x,y2,x.length);
		      g.setColor(Color.orange);
		      String str="   (x,y)=(0,0)";
	    	  g.drawString(str,(int)(width/5.0),height*2);//sine, O, E 
	      }      
   }
}