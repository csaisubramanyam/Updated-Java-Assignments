
public abstract class vehicle {
	
	public void start() {
		System.out.println("Start Button Pressed..");
	}
	
	public void stop() {
		System.out.println("Stop Button Pressed..");
	}
	
	public abstract void accelerate();
	
	public abstract void applyBrakes();
	
	public final void driveSomeDistance() {
		start();
		accelerate();
		applyBrakes();
		stop();
	}
	
	public static void main(String[] args) {
		vehicle es = new ElectricScooter();
		es.driveSomeDistance();
	}

}
