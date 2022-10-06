
public class Outer2 {
	
	private int x = 5;
	
	private void printY(Inner i) {
		
	}
	
	private static class Inner {
		
		private int y = 5;
		
		void printX(Outer2 o) {
			System.out.println("X = "+o.x);
		}
		
		public void increment(Outer2 o) {
			o.x++;
		}
	}
	
	public static void main(String[]args) {
		Outer2 o = new Outer2();
		Inner i = new Inner();
		o.printY(i);
		i.printX(o);
		i.increment(o);
		new Inner().increment(o);
		i.printX(o);
		i.printX(new Outer2());
	}

}
