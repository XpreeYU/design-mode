package bridge;

public abstract class DriverManager {

	private Driver driver;
	
	public void connet(){
		driver.connect();
	}
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
}
