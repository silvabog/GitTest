public class Desktop extends Computer{
	
	public double width;
	public double height;
	
	public Desktop() {}
	
	public Desktop(double width, double height, double weight, String manufacturer, String diskSize, String manufacturingDate, int cores) {
		this.width = width;
		this.height = height;
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

	@Override
	public String toString() {
		return "Desktop [width=" + width + ", height=" + height + "]";
	}

}
