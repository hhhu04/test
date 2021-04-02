package exx.selfEX.bbb;

public class OuterClass {

    private String myName;
    private int num;

    OuterClass(String name)
    {
        myName = name;
        num=0;
    }

    public void whoAreYou()
    {
        num++;
        System.out.println(myName+" outerclss "+num);
    }

    class InnerClass
    {
        InnerClass()
        {
            whoAreYou();
        }
    }

}
