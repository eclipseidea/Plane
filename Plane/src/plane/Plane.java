package plane;

public abstract class Plane {

	double startEngines() {
		return Math.random()* ( 88 - 20 );
	}
	
	double flyPlane() {
		return Math.random()* ( 1000 - 0 );
	}
	String planeGoesDown(){
		return "Plane Goes Down";
	}
}
