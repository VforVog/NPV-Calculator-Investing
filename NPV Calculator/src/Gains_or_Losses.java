import java.text.DecimalFormat;

public class Gains_or_Losses {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		int i;
		double VPN;
		double economicGains;
		double epitokio;
		double typos;
		double initialInvesting;
		double count;
		int years;
		
		initialInvesting = 2000;
		//���� ��� ��������
		economicGains = 400;
		epitokio = 0.03;
		years = 10;
		
		
		VPN = 0;
		typos = 1 + epitokio;
		count = 0;

		
		for(i=1; i<= years; i++)
		{
			count = economicGains / Math.pow(typos, i);
			VPN = VPN + count;
		}
		
		VPN = VPN - initialInvesting;
		
		if (VPN >= 0)
			System.out.print("Accepted\n" + "The VPN was calculated and is estimated: " + df2.format(VPN) +"�");
		else
			System.out.print("Rejcted\n" + "The VPN was calculated and is estimated: " + df2.format(VPN) +"�" );
		
		
// ��� ���������� ��� ������! ������ �������� ���������, �������� -�� ��������� ������� ��� �������- ��� ����� �������! ��� ����� 
// VPN > 0, WORTH ������ ���� ���
//���� ��� ������� �.�. ��� ����� �����,'� �����������, ��������� ��� ������
// �� VPN ����� ���� ����� ��� �������� ��� ���������� ��� ������ ����� ��� ������ ��������� ��� �� ���� ��� �� ������� ������
// ��� �� ���� ��� ������, ���� ��� �� ����. ��� �� ����� ������ � �������� ����?
		
	}


}
