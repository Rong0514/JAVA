import java.text.DecimalFormat;
import java.util.Scanner;

public class 圓形面積計算 {

    public static void main(String[] args) {
        // 創建 Scanner 物件，用於接收輸入
        Scanner input = new Scanner(System.in);
        // 創建 DecimalFormat 物件，用於格式化小數點位數
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        // 宣告常數 PI，代表圓周率，近似值
        final float PI = 3.1416f;
        // 提示用戶輸入半徑
        System.out.print("請輸入半徑 : ");
        float r = input.nextFloat();
        // 使用圓面積的計算公式計算面積，並轉換為字串
        String area = decimalFormat.format((r * r) * PI);
        // 印出計算得到的圓面積
        System.out.println("圓的面積為: " + area);
        // 關閉 Scanner 物件
        input.close();
    }
}
