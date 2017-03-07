package plane;

public class Su27 extends Plane implements SpecialUse {

	private int maxSpeed;
	private String color;
	private ControlPlane controlPlane;

	
	public Su27(int maxSpeed, String color, ControlPlane controlPlane) {
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.controlPlane = controlPlane;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ControlPlane getControlPlane() {
		return controlPlane;
	}

	public void setControlPlane(ControlPlane controlPlane) {
		this.controlPlane = controlPlane;
	}

	@Override
	public void turboSpeed() {
		System.out.println(Math.random() > maxSpeed);

	}

	@Override
	public void stelsTech() {
		System.out.println("Do not see if: " + Math.random());

	}

	@Override
	public void bigBang() {
		System.out.println("Random bombs: " + Math.random() * (9 - 0));

	}
}
