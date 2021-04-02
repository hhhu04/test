package exx.selfEX.aaa;

public class PointOne implements UpperCasePrintable{

    private int xPos, yPos;

    public PointOne(int x, int y)
    {
        xPos = x;
        yPos = y;
    }

    public String toString()
    {
        String posInfo="[x pos : "+xPos+", y pos : "+yPos+"]" ;
        return posInfo;
    }

}
