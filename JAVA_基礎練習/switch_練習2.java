import java.util.Scanner;

public class switch_練習2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        
        for(int i = 5; i > 0; i--) {
            System.out.println("你還有" + i + "機會");
            System.out.print("請輸入1-5位數 : ");
	        int number = sc.nextInt();   
            if (number < 0) {
            	System.out.println("輸入值不得為負數");
            	System.out.println("");
            	System.out.println("----------");   
            	System.out.println("");
            	continue;
            }

	        switch (number) {
	        case 1 : 
	        case 2 : 
	        case 4 : 
	        case 5 : 
	            System.out.println("答案錯誤");
	            break;
	        case 3 : 
	            System.out.println("答案正確");
	            i = 0;
	            break;
	        default:
	            System.out.print("答案錯誤  ");
	            System.out.println("超出範圍!!");
	        }	
	    System.out.println("");
	    System.out.println("----------");   
	    System.out.println("");
        } 
        sc.close();
    }
}








