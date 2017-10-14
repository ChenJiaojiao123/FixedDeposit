import java.util.*;
/**
 *@ClassName:DepositAccount 
 *@Description:
 *@author Chenjiao
 *@date:2017年10月14日
 */
public class DepositAccount {
	private String AccountNum;  //账号
	private String depositor;   //储户名
	private int password;       //密码
	private double balance;      //余额
	private double DepositMoney; //存款金额
	private double YearInterest; //年利息
	private double MonthInterest;//月利息
	static double AnnualRate;    //年利率
	Scanner in=new Scanner(System.in);
	DepositAccount(String number,String name,double year_rate )           //构造函数初始化
	{
		AccountNum=number;
		depositor=name;
		AnnualRate=year_rate;
	}
	public void OpenAccout()   //开户
	{
		System.out.print("您的账号为:");
		AccountNum=in.nextLine();
		System.out.println("请输入您的姓名:");
		depositor=in.nextLine();
		System.out.println("请输入您要设置的密码:");
		password=in.nextInt();
	}
	public void deposit(double balance1,double money)      //存款
	{
		balance1+=money;
		balance=balance1;
	}
	public void inquire()      //查询
	{
		System.out.println("您的余额为:"+balance+"元");
	}
	public double YearInterest()     //计算年利息
	{
		YearInterest=balance*AnnualRate;
		return YearInterest;
	}
	public void MonthInterest()    //计算月利息
	{
		MonthInterest=YearInterest/12;
	}
	
}
