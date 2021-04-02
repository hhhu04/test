package exx.selfEX.tv;

public class MultiInheriAlternative {

    public static void main(String[] args)
    {
        IPTV iptv= new IPTV();
        iptv.powerOn();

        TV tv=iptv;
        Computer comp = iptv;
    }

}
