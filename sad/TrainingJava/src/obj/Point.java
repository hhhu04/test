package obj;

import java.security.cert.PolicyNode;

class PointEX
{
    public static void main(String[] args)
    {



    }

}

public class Point {

    int xPos, yPos;

    public Point(int x, int y)
    {
        xPos = x;
        yPos = y;
    }

    public void showPosition()
    {
        System.out.printf("[%d, %d]", xPos,yPos);
    }

}

class Rectangle
{

    Point upeerLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        upeerLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public void showPosition()
    {

        System.out.println("위치정보");
        System.out.println("좌 상단");
        upeerLeft.showPosition();
        System.out.println("");
        System.out.println("우 하단");
        lowerRight.showPosition();
        System.out.println("\n");

    }

    public void equals(){

    }


}




