package exx.selfEX.tv;

public class IPTV implements TV, Computer{

    ComputerImpl comp = new ComputerImpl();

    @Override
    public void dataReceive() {
        comp.dataReceive();
    }

    public void powerOn()
    {
        dataReceive();
        onTV();
    }

    @Override
    public void onTV() {
        comp.onTV();
    }
}
