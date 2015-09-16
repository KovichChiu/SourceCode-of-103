package ด๚ธี;

public class calc
{
    private double x;
    private double y;
    public calc(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public void print(double theta)
    {
        if( ((Math.toDegrees(theta) / 90) % 2) == 1)
        {
            x = x*0;
            y = y*Math.sin(theta);
        }
        else if( ((Math.toDegrees(theta) / 90) % 2) == 0)
        {
            x = x*Math.cos(theta);
            y = y*0; 
        }
        else
        {
           x = x*Math.cos(theta);
           y = y*Math.sin(theta); 
        }
        System.out.println("cos 90 : "+x);
        System.out.println("sin 90 : "+y);
    }
    public static void main(String[]args)
    {
        calc p = new calc(3,4);
        p.print(Math.toRadians(90));
    }
}