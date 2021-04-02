package project;

import java.awt.*;
import java.util.Scanner;

public class Manager {

	static Scanner sc = new Scanner(System.in);
	
	static String[][] person=new String[100][5];
	int cnt;
	private Object Exception;

	public void delete(int cnt)
	{
		System.out.print("삭제할 번호 선택 : ");
		int num=sc.nextInt();
		for(int i=num;i<100;i++)
		{
			if(i>=1) {
				person[i - 1][0] = person[i][0];
				person[i - 1][1] = person[i][1];
				person[i - 1][2] = person[i][2];
				person[i - 1][3] = person[i][3];
				person[i - 1][4] = person[i][4];
			}
			if(i==99) 
			{
				person[99][0]=null;
				person[99][1]=null;
				person[99][2]=null;
				person[99][3]=null;
				person[99][4]=null;
			}
		}
	}
	
	public void choiceNum() {
		System.out.print("번호 : ");
		int cnt = sc.nextInt();
		System.out.println();

		System.out.println("번호 : " + person[cnt - 1][0]);
		System.out.println("이름 : " + person[cnt - 1][1]);
		System.out.println("전화번 : " + person[cnt - 1][2]);

		if (person[cnt - 1][4] == null || person[cnt-1][3] != null) {
			System.out.println("회사 : " + person[cnt - 1][3]);
		} else {
			System.out.println("전공 : " + person[cnt - 1][3]);
			System.out.println("학년: " + person[cnt - 1][4]);
		}
	}






			public void input ( int num)
			{
				int choice;
				System.out.println("입력 유형 선택.");
				System.out.print("1.일반, 2.대학, 3.회사 -> ");
				choice = sc.nextInt();
				System.out.println();
				if(choice > 4) ;

				String to = Integer.toString(num);
				System.out.println("번호 : " + to);
				person[num - 1][0] = to;
				System.out.println();

				System.out.print("이름 : ");
				String name = sc.nextLine();
				name = sc.nextLine();
				person[num - 1][1] = name;
				System.out.println();

				System.out.print("전화번호 : ");
				String phoneNumber = sc.nextLine();
				person[num - 1][2] = phoneNumber;
				System.out.println();

				if (choice == 1) {
					PhoneInfo pi = new PhoneInfo(name, phoneNumber);
					System.out.println("입력정보 확인");
					pi.showPhoneInfo();
				} else if (choice == 2) {
					System.out.print("전공 : ");
					String major = sc.nextLine();
					person[num - 1][3] = major;
					System.out.println();

					System.out.print("학년 : ");
					String year = sc.nextLine();
					person[num - 1][4] = year;
					System.out.println();

					PhoneInfo pi = new PhoneUniInfo(name, phoneNumber, major, year);
					System.out.println("입력정보 확인");
					pi.showPhoneInfo();
				} else if (choice == 3) {
					System.out.print("회사 : ");
					String company = sc.nextLine();
					person[num - 1][3] = company;
					person[num - 1][4] = null;

					PhoneInfo pi = new PhoneCompanyInfo(name, phoneNumber, company);
					System.out.println("입력정보 확인");
					pi.showPhoneInfo();
				}


			}


		}


