package xc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateStr = "2010/05/04 12:34:23";
		Date date = new Date();
		// ע��format�ĸ�ʽҪ������String�ĸ�ʽ��ƥ��
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			date = sdf.parse(dateStr);
			System.out.println(dateStr.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}