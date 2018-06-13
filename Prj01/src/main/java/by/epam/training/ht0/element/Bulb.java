package by.epam.training.ht0.element;

public class Bulb {

	int light;

	public Bulb(int light) {
		super();
		this.light = light;
	}

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	@Override
	public String toString() {
		return "light=" + light;
	}
	
}
