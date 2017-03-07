package plane;

public class Main {

	public static void main(String[] args) {
		
		Su27 su27 = new Su27(500, "blue", new ControlPlane(50, 20, 1000));

		su27.startEngines();
		su27.flyPlane();
		su27.getControlPlane().goAhead();
		su27.getControlPlane().goBack();
		su27.getControlPlane().goUp();
		su27.getControlPlane().goDown();
		su27.stelsTech();
		su27.bigBang();
		su27.turboSpeed();
		su27.planeGoesDown();
	}

}


