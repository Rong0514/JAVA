import java.util.Arrays;

public class 陣列sort排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data = new int[10];
		
		double r=0;
		for(int i=0; i<data.length; i++) {
			r = Math.random();
			int new_r = (int)(r * 51+10);
			data[i] = new_r;
		}
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
	}
}
