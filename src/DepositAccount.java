import java.util.*;
/**
 *@ClassName:DepositAccount 
 *@Description:
 *@author Chenjiao
 *@date:2017��10��14��
 */
public class DepositAccount {
	private String AccountNum;  //�˺�
	private String depositor;   //������
	private int password;       //����
	private double balance;      //���
	private double DepositMoney; //�����
	private double YearInterest; //����Ϣ
	private double MonthInterest;//����Ϣ
	static double AnnualRate;    //������
	Scanner in=new Scanner(System.in);
	DepositAccount(String number,String name,double year_rate )           //���캯����ʼ��
	{
		AccountNum=number;
		depositor=name;
		AnnualRate=year_rate;
	}
	public void OpenAccout()   //����
	{
		System.out.print("�����˺�Ϊ:");
		AccountNum=in.nextLine();
		System.out.println("��������������:");
		depositor=in.nextLine();
		System.out.println("��������Ҫ���õ�����:");
		password=in.nextInt();
	}
	public void deposit(double balance1,double money)      //���
	{
		balance1+=money;
		balance=balance1;
	}
	public void inquire()      //��ѯ
	{
		System.out.println("�������Ϊ:"+balance+"Ԫ");
	}
	public double YearInterest()     //��������Ϣ
	{
		YearInterest=balance*AnnualRate;
		return YearInterest;
	}
	public void MonthInterest()    //��������Ϣ
	{
		MonthInterest=YearInterest/12;
	}
	
}
