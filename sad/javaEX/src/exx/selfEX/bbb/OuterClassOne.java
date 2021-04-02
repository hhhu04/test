package exx.selfEX.bbb;

class OuterClassOne {

    OuterClassOne()
    {
        NestedClass nst=new NestedClass();
        nst.simpleMethod();
    }

    static class NestedClass
    {
        public void simpleMethod(){System.out.println("nes inst me one");}
    }

}


class OuterClassTwo
{
    OuterClassTwo()
    {
        NestedClass nst=new NestedClass();
        nst.simpleMethod()    ;

    }

    static class NestedClass
    {
        public void simpleMethod(){System.out.println("nes inst me Two");}
    }

}

class TestStart
{
    public static void main(String[] args)
    {

        OuterClassOne one = new OuterClassOne();
        OuterClassTwo two = new OuterClassTwo();
        OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();

    }
}