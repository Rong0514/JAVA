import java.util.Arrays;

public class 陣列多維練習 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[][] data = new long[5][3];

		
		
		for(long a=0; a<9999; a++) {
			for (int i = 0; i < data.length; i++) {
			    for (int x = 0; x < data[i].length; x++) { 
			        double r   = Math.random();
			        int new_r  = (int)(r * (100-10+1) + 10); 
			        data[i][x] = new_r;
			    }
			}
			for(int n=0; n<data.length; n++) {
				System.out.println(Arrays.deepToString(data));
			}
		}
	}
}
