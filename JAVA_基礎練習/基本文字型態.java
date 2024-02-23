public class 基本文字型態 {

    public static void main(String[] args) {
        // 使用 String 類型儲存文字
        String name     = "吳威融";              // 存儲姓名的變數
        String birthday = "1999/05/14";        // 存儲生日的變數
        String number   = "0965037355";        // 存儲手機號碼的變數
        char   sex      = '男';                 // 存儲性別的變數 (使用 char 表示單一字符)
        String email    = "willy1012374@gmail.com";  // 存儲電子郵件的變數

        // 印出個人資訊
        System.out.println("姓名 : " + name);
        System.out.println("性別 : " + sex);
        System.out.println("生日 : " + birthday);
        System.out.println("手機 : " + number);
        System.out.println("信箱 : " + email);
    }
}
