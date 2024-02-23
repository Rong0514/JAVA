import java.util.Scanner;

public class BMI條件練習 {

    public static void main(String[] args) {
        // 創建 Scanner 物件，用於接收輸入
        Scanner input = new Scanner(System.in);

        // 提示用戶輸入身高(cm)，並轉換為米
        System.out.print("請輸入身高(cm) : ");
        float height  = input.nextFloat() / 100;

        // 提示用戶輸入體重(kg)
        System.out.print("請輸入體重(kg) : ");
        float weight  = input.nextFloat();

        // 計算BMI
        float BMI     = weight / (height * height);

        // 印出BMI值
        System.out.println("您的BMI為 : " + BMI);

        // 使用條件運算符判斷BMI的範圍，並給出相應的評價
        String result  = (BMI > 30) ? "過重" : (BMI > 25) ? "重" : (BMI > 20) ? "標準" : (BMI > 15) ? "輕" : "過輕";
        System.out.print("您體質為   : " + result);

        // 關閉 Scanner 物件
        input.close();
    }

}
