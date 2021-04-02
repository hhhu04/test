package interEx;

public class PersonalNumberStirageImpl implements PersonalNumberStorage{

    PersonalNumInfo[] perArr;
    int numOfPerInfo;

    PersonalNumberStirageImpl(int sz){
        perArr=new PersonalNumInfo[sz];
        numOfPerInfo=0;
    }

    @Override
    public void addPersonalInfo(String name, String perNum) {

        perArr[numOfPerInfo] = new PersonalNumInfo(name,perNum);
        numOfPerInfo++;

    }

    @Override
    public String searchName(String perNum) {

        for(int i=0;i<numOfPerInfo;i++)
        {
            if(perNum.compareTo(perArr[i].getNumber())==0)
                return perArr[i].getName();
        }

        return null;
    }
}
