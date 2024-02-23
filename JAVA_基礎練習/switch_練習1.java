import java.util.Scanner;

public class switch_練習1 {

    public static void main(String[] args) {
        System.out.println("-----\r\n"
        		+ "switch控制\r\n"
        		+ "利用比對值的方式來決定要執行的流程，\r\n"
        		+ "可以比對的資料類型只有char、byte、short、int和Enum等5種；\r\n"
        		+ "通常搭配break來表示流程結束。\r\n"
        		+ "switch比對成功後就不會再做任何比對。\r\n"
        		+ "-----");

        Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入分數："); 
        int scores = sc.nextInt();

        switch (scores / 10) {
            case 10:
            case 9:  System.out.println("成績等級：A"); break;
            case 8:  System.out.println("成績等級：B"); break;
            case 7:  System.out.println("成績等級：C"); break;
            case 6:  System.out.println("成績等級：D"); break;
            default: System.out.println("成績等級：F"); break;
        }
        sc.close();
    }
}

