
public class Audi extends VW {
	@Override
	public void startEngine() {
		System.out.println("Audi is starting..");
		
	}
	@Override
	public void goForward() {
		System.out.println("Audi go forward..");
		
	}
	@Override
	public void goBack() {
		System.out.println("Audi go back..");
		
	}
	@Override
	public void openCar() {
		System.out.println("Audi is opening..");
		
	}
	
	public void checkEngine() {
		System.out.println("Audi has`t check");
	}
}
