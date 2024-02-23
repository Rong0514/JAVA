
public class 陣列讀取修改 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("陣列 = 串列\r\n"
				+ "1.型態一定是固定\r\n"
				+ "2.大小一定是固定設定大小多少就是多少\r\n"
				+ "3.陣列 = 參考型別又稱動態型別(空間是new出來的大小)\r\n"
				+ "-----[宣告] 跟 [設定] 是分開的-----\r\n\n");
		
		
		System.out.println("這裡for~each只能讀取 num 的值，不能修改 numbers 陣列中對應的元素值");
		int[] numbers = {1, 2, 3, 4, 5};
		for (int num : numbers) {
		    System.out.println(num);
		    num++;//此 行 無 效
		}
		
		System.out.println("在這裡可以修改 numbers 陣列中對應的元素值");
		for (int num=0; num<numbers.length; num++) {
			numbers[num] *= 2;
			System.out.println(numbers[num]);
		}
	}
}
