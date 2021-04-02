package hello;

public class CatchTest {

    String asc = "[9]*S";


    public static void main(String[] args) {

        PersonalInfo readInfo = readPeronalInfo();

    }

    private static PersonalInfo readPeronalInfo() {

        return null;
    }


    public static void AgeInputException(){



    }

}

class AgeInputException extends Exception
{

    public AgeInputException()
    {
        super("나이x");
    }

}

class NameLengthException extends Exception
{
    String wrongName;

    public NameLengthException(String name)
    {
        super("이름x");
        wrongName = name;
    }

    public void showWrongName()
    {
        System.out.println("이름x : "+ wrongName);
    }
}

class PersonalInfo {

    String name;
    int age;

    public PersonalInfo(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void showPersonalInfo() {

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);

    }







}
















