package exOne;

public class Manager {

    String[][] array = new String[100][2];

    public static String inNumber(String obj) {
        String sNum;

        sNum = (String) obj.toUpperCase().subSequence(0, 2);

        return sNum;
    }

    public String selNum(String obj) {

        String res =null ;

        for(int i=0;i<array.length;i++){
            if(array[i][1]==obj){
               res = array[i][0];
               return res;
            }
            else{
                res="일치하는 목록이 없습니다.";
            }
        }

        return res;
    }

}