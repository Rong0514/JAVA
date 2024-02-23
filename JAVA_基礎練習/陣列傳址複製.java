
public class 陣列傳址複製 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("陣列指派(傳址)");
		int [] a = {1,2,3};
		int [] b = a;
		
		a[0] = 666;
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("陣列複製");
		int[] c = {1, 2, 3};
		int[] d = new int[c.length];

		// 複製 c 陣列的值到 d 陣列
		for (int i = 0; i < c.length; i++) {
		    d[i] = c[i];
		}
		c[0] = 666;

		for (int i = 0; i < d.length; i++) {
		    System.out.println(d[i]);
		}
	}
}
