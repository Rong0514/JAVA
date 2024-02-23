
public class 方法傳值傳址 {

	public static void main(String[] args){
		int i = 10;
		myMethod1(i);
		System.out.println("In main(): " + i);
	}
	
	static void myMethod1 (int i){
		i += 1;
		System.out.println("In myMethod(): " + i);
	}
}