package CarAndDriver;

public class Driver extends Car {
	
	public void drive () {
		System.out.println("We are driving! Vroom, vroom!");
		super.setGas(getGas() - 1);
		this.checkGameOver();
		this.getRemainingGas();
	}
	
	public void useBoosters () {
		if(super.getGas() < 3) {
			System.out.println("You do not have enough gas to boost.");
			this.getRemainingGas();
			return;
		}
		System.out.println("Tuuurrboo!!!");
		super.setGas(getGas() - 3);
		this.checkGameOver();
		this.getRemainingGas();
	}
	
	public void refuel () {
		if(super.getGas() > 8) {
			System.out.println("Your tank is too full to be refueled.");
			this.getRemainingGas();
			return;
		}
		System.out.println("Refueling the car.");
		super.setGas(getGas() + 2);
		this.getRemainingGas();
	}
	
	public void checkGameOver () {
		if(super.getGas() <= 0) {
			System.out.println("YOU HAVE RUN OUT OF GAS");
			System.out.println("GAME OVER!");
		}
	}
	
	public void getRemainingGas () {
		System.out.printf("Gas remaining: %d/10\n", super.getGas());
	}
}
