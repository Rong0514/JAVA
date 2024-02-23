
public class 數字型態練習 {

	public static void main(String[] args) {
		// 宣告並初始化基本數據類型的變數
		byte   a  = 127;//-128 ~ 127
		short  b  = 32767;//-32768 ~ 32767
		int    c  = 2147483647;//-2147483648 ~ 2147483647
		long   d  = 9223372036854775807L;//-9223372036854775808 ~ 9223372036854775807 
        float  e  = 3.14f;            // 32位元浮點數
        double f  = 3.14159265359;    // 64位元浮點數
        // 印出各變數的值
		System.out.println("byte  a 的值為 : " + a);
		System.out.println("short b 的值為 : " + b);
		System.out.println("int   c 的值為 : " + c);
		System.out.println("long  d 的值為 : " + d);
		System.out.println("float e 的值為 : " + e);
		System.out.println("float f 的值為 : " + f);
        
        //生日輸出練習
        short year  = 1999;
        byte  month = 5;
        byte  day   = 14;
        System.out.println("生日 : " + year + "/" + month + "/" + day);
	}
}



