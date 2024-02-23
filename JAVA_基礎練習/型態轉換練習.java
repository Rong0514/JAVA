public class 型態轉換練習 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 算術型態自動轉型
        int   a = 3;
        float b = 3.3f;
        System.out.println("自動轉型 : " + (a + b)); // 自動轉型，int 被提升為 float 進行運算

        // 算術型態強制轉型
        int   c = 3;
        float d = 3.3F;
        int   e = (int)(c + d); // 強制轉型，將 float 轉換為 int
        System.out.println("強制轉型 : " + e);
    }
}
