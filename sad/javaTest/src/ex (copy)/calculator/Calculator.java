package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //과목수, 각 과목 점수, 평점
        int subNum;
        System.out.print("과목 수 입력 : ");
        subNum = sc.nextInt();
        System.out.println();

        String[] score=new String[subNum]; //학점 문자
        double[] sumNum=new double[subNum]; //학점 점수
        double ave=0.0; //평점
        double sum=0.0;//평점을 위한 더하기
        int num;

        for(int i=0;i<subNum;i++) {
            System.out.print((1+i)+"점수 각각 입력 : ");
            num = sc.nextInt();
            System.out.println();

            if (num > 94) {
                score[i] = "A+";
                sumNum[i] = 4.5;
            } else if (num > 89) {
                score[i] = "A";
                sumNum[i] = 4.0;
            } else if (num > 84) {
                score[i] = "B+";
                sumNum[i] = 3.5;
            } else if (num > 79) {
                score[i] = "B";
                sumNum[i] = 3.0;
            } else if (num > 69) {
                score[i] = "C";
                sumNum[i] = 2.5;
            } else {
                score[i] = "F";
                sumNum[i] = 0;
            }
        }

        System.out.print("각 학점은 :");
        for(int i=0;i<subNum;i++) {

            System.out.print(" "+score[i]+" ");
            sum = sum+sumNum[i];

        }

        ave=sum/subNum;
        System.out.println();
        System.out.println("평점은 : "+ave);





    }

}
