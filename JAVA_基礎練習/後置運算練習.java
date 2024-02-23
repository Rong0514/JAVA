public class 後置運算練習 {

    public static void main(String[] args) {
        int int_i = Integer.MAX_VALUE; // 初始化 int_i 為 Integer 型態的最大值

        // 印出 int_i 的值並進行後置運算
        System.out.println("int_i = " + int_i++); // 第一次印出 int_i 的值後置運算
        System.out.println("int_i = " + int_i++); // 第二次印出 int_i 的值後置運算
        System.out.println("int_i = " + int_i++); // 第三次印出 int_i 的值後置運算
    }
}
