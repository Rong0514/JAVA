
public class Dowhile迴圈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("while    = 前測試迴圈 : 先判斷後執行\r\n"
						+"do while = 後側是迴圈 : 先執行後判斷\r\n");
		
		System.out.print("while迴圈\n\n");
		int i = 0;
		while (i < 5) {
		    System.out.println(i);
		    i++;
		}
		
		System.out.print("do while迴圈\n\n");
		int x = 0;
		do {
		    System.out.println(x);
		    x++;
		} while (x < 5);
	}
}
