public class 最後宣告練習 {

    public static void main(String[] args) {
        // 宣告一個 final 字串變數 name，賦值為 "吳威融"
        final String name = "吳威融";
        
        // 若嘗試重新賦值給 final 變數，將導致編譯錯誤
        // String name = "周杰倫"; // 編譯錯誤：無法再次賦值給 final 變數
        
        // 印出最後宣告的 name 變數
        System.out.println(name);
    }
}
