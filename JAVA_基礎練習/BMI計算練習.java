import java.util.Scanner;
public class BMI計算練習 {
    public static void main(String[] args) {
        // 創建 Scanner 物件，用於接收輸入
        Scanner input = new Scanner(System.in);

        // 提示用戶輸入身高(cm)，並轉換為米
        System.out.print("請輸入身高(cm) : ");
        float height = input.nextFloat() / 100;

        // 提示用戶輸入體重(kg)
        System.out.print("請輸入體重(kg) : ");
        float weight = input.nextFloat();

        // 計算BMI
        float BMI = weight / (height * height);

        // 印出BMI值
        System.out.print("您的BMI為 : " + BMI);

        // 關閉 Scanner 物件
        input.close();
    }
}
