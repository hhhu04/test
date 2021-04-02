package exx.selfEX.bbb;

public class InnerClassTest {

    public static void main(String[] args)
    {

        OuterClass out1 = new OuterClass("1st");
        OuterClass out2 = new OuterClass("2nd");
        out1.whoAreYou();
        out2.whoAreYou();

        OuterClass.InnerClass inn1=out1.new InnerClass();
        OuterClass.InnerClass inn2=out2.new InnerClass();
        OuterClass.InnerClass inn3=out1.new InnerClass();
        OuterClass.InnerClass inn4=out1.new InnerClass();
        OuterClass.InnerClass inn5=out2.new InnerClass();

    }

}
