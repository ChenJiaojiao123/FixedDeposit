/**
 *@ClassName:Test
 *@Description:
 *@author Chenjiao
 *@date:2017��10��14��
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount("1234567890","ZhangSan",0.023);
		saver.deposit(2000.0,5000.0);   //���
		saver.inquire();   //��ѯ���
		System.out.print("��������ϢΪ:"+saver.YearInterest()+"Ԫ");    //���㲢��ʾ������
	}
}
