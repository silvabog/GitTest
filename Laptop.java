
package a5;

public class Laptop extends Computer {
	
	public double width;
	public double height;
	public double weight;
	
	public Laptop() {}
	
	public Laptop(double width, double height, double weight, String manufacturer, String diskSize, String manufacturingDate, int cores) {
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.manufacturer = manufacturer;
		this.diskSize = diskSize;
		this.manufacturingDate = manufacturingDate;
		this.cores = cores;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Laptop [width=" + width + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}
