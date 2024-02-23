
public class 迴圈標籤終止 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("範例\n");
		labelName : 
			for (int i = 0; i < 5; i++) {
			    System.out.println(i);
			    if (i == 2) {
			        break labelName; 
			    }
			}

		System.out.print("練習-----1\n");
		labelName : 
			for(int i=1; i<=9; i++) {
				for(int x=2; x<=9; x++) {
					System.out.print(x + "*" + i + "=" + i*x+" ");
				}
				System.out.println("\n");
				if (i == 4) {
					break labelName;
				}
			}
		
		System.out.print("練習-----2\n");
		double r=0;
		labelName :
			while(true) {
				r = Math.random();
				r = (int)(r*(20-10+1)+10);
				System.out.println("次數 = " + r);
				
				for(int i=0; i<5; i++) {
					if (r == 17 && i==3) {
						System.out.print(i);
						break labelName;
					}
				}
			}
	}
}
