/**
 *@ClassName:Test
 *@Description:
 *@author Chenjiao
 *@date:2017年10月14日
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount("1234567890","ZhangSan",0.023);
		saver.deposit(2000.0,5000.0);   //存款
		saver.inquire();   //查询余额
		System.out.print("您的年利息为:"+saver.YearInterest()+"元");    //计算并显示年利率
	}
}
