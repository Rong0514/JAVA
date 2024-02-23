
public class 方法參數列表 {

    // 範例方法，接受兩個整數作為參數
    public static void addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
	
    public static void main(String... args) {
        // 在 main 方法中呼叫 addNumbers 方法並傳遞兩個整數參數
        addNumbers(5, 7);
    }
}

