package interEx;

public class AbstractInterface {
    public static  void main(String[] args){
        PersonalNumberStorage storage = new PersonalNumberStirageImpl(100);
        storage.addPersonalInfo("김기동","950000-1122333");
        storage.addPersonalInfo("홍길동","950000-2122333");

        System.out.println(storage.searchName("950000-1122333"));
        System.out.println(storage.searchName("950000-2122333"));

    }
}
