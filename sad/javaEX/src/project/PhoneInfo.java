package project;

public class PhoneInfo {
	
	private String name;
	private String phoneNumber;

	public PhoneInfo(String name, String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	
	public void showPhoneInfo()
	{
		System.out.println("이   름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
	}
	

	
}
