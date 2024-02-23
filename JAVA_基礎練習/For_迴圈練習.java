
public class For_迴圈練習 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("總結\r\n"
				+ "作用域 ：變數的作用域決定了它在哪些部分的程式碼中是可見的。\r\n"
				+ "區域變數：在某個特定區塊（如迴圈、方法）內宣告的變數。區域變數只在其宣告的區塊內有效。\r\n"
				+ "第一個迴圈中的 i 是一個區域變數，只在迴圈內部有效。\r\n"
				+ "第二個迴圈利用了一個在迴圈外宣告的變數 x，因此 x 在迴圈外仍然可用。");
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("_______________迴圈區域概念 : 內區域");
		for(int i=0; i<10; i++) {
			System.out.print(i);
		}
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("_______________迴圈區域概念 : 外區域");
		int x=0;
		for(x=0; x<10; x++) {
		}
		System.out.print(x);
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("____________________快速計算次數");
		int n = 0;
		for(int a=1; a<=15; a+=7) {
			n++;
		}
		System.out.println(n);
		System.out.print("快速計算次數公式為 : (終止值-初始值)/間隔值");
	}

}
