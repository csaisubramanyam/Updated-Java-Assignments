
public class Point {
    
	public static final Point ORIGIN = new Point(0,0);
	
	public int x;
	public int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
		Point p = (Point) obj;
		return p.x == x && p.y == y;
	}
		return false;
		}
	
	
	public int hashCode() {
		return toString.hashCode();
	}
	
	public String toString() {
		return new StringBuffer("X =").append(x).append("Y =").append(y).toString();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println("x="+p.getX()+ " y="+p.getY());
		System.out.println(p.distance());
		System.out.println(p.distance(10,20));
		
	}




	public double distance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
