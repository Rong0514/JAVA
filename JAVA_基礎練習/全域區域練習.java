public class 全域區域練習 {

    static String names = "我是全域變數";// 宣告全域變數
    
    public static void main(String[] args) {
        
        String name = "我是區域變數";// 宣告區域變數

        // 印出區域變數的值
        System.out.println(name);
        System.out.println(names);
    }
}
