
public class Outer {
	
	private static class Inner extends Outer{
		
		private void print() {
			System.out.println("Hello");
		}
	}
	
	private void printInner(Inner h) {
		h.print();
	}
	
	public static void main(String[] args) {
		Inner i = new Inner();
		i.print();
	}

}
