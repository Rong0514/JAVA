
public class while___迴圈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("random概念\r\n");

		double r = 0;
		int n = 0;
		while (r != 9999) {
		    r = Math.random(); // 介於 0-1 之間
		    System.out.println(r);
		    r = (int) (r * (9999 - 1000 + 1) + 1000);
		    System.out.println(r);
		    System.out.println("");
		    n += 1;
		}
		System.out.print("總次數為 : " + n + "次\n\n");
		System.out.println("random概念\r\n"
				  +"如果今天要產生一個1000-9999範圍隨機亂數\r\n"
				  +"計算公式為 : (尾數 - 頭數 + 1) + 頭數\r\n");
	}
}
