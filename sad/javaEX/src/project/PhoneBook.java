package project;

import java.util.Scanner;

public class PhoneBook {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		Manager ma=new Manager();
		int num;
		
		while(true)
		{
			selectOne();
			num=sc.nextInt();
			sc.nextLine();
			if(num==1) 
				{
					ma.cnt++;
					ma.input(ma.cnt); 
				}
			else if(num==2) 
			{
				ma.choiceNum();
			}
			else if(num==3)
			{
				ma.delete(ma.cnt);
				ma.cnt--;
			}
			else if(num==4) break;
			else System.out.println("다시입력");
		}
		
	}
	
	public static void selectOne()
	{
		System.out.println("택 1");
		System.out.println("1. 전화번호 등록 ");
		System.out.println("2. 전화번호 검색 ");
		System.out.println("3. 전화번호 삭제 ");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		System.out.println();
	}
	
	

}
