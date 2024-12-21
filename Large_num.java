package Test1;

public class Large_num {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 4;
		int d = 15;
		
		int largenum = a;
		
		if(b > largenum) {
			largenum = b;
		}
		else if(c > largenum) {
			largenum = c;
		}
		else {
			largenum = d;
		}
		
		System.out.print("Large number is : " + largenum);
	}
}
