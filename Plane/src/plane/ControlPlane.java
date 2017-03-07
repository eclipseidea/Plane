package plane;

public class ControlPlane {

	private int lenght;
	private int width;
	private int weight;

	public ControlPlane(int lenght, int width, int weight) {
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double goUp() {
		return Math.random();
	}

	public double goDown() {
		return Math.random();

	}

	public double goAhead() {
		return Math.random();

	}

	public double goBack() {
		return Math.random();
	}

}
