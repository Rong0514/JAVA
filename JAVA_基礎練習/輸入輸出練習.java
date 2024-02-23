import java.util.Scanner;

public class 輸入輸出練習 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);     // 創建 Scanner 物件，用於接收輸入
        System.out.print("請輸入您的年齡：");            // 提示用戶輸入年齡
        int age = input.nextInt();                  // 從用戶輸入中讀取一個整數，並存儲在變數 age 中
        age = age + 30;                             // 將年齡增加 30
        System.out.println("增加 30 後的年齡為：" + age);// 印出增加後的年齡     
        input.close();                              // 關閉 Scanner 物件
    }
}
