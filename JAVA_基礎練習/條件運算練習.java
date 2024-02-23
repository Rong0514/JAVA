import java.util.Scanner;

public class 條件運算練習 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("請輸入數字1 : ");
		float num1 = input.nextFloat();
		
		System.out.print("請輸入數字2 : ");
		float num2 = input.nextFloat();
		
		String result = num1 > num2 ? "num1 比較大" : "num2 比較大";
		System.out.print(result);
		
		input.close();	
	}
}
