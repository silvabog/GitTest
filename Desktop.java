
package aa5;

public class Computer {
	
	//Instance variables
	public String manufacturer;
	public String diskSize;
	public String manufacturingDate;
	public int cores;
	
	//Constructors
	public Computer() {}
	public Computer(String manufacturer, String diskSize, String manufacturingDate, int cores) {
		this.manufacturer = manufacturer;
		this.diskSize = diskSize;
		this.manufacturingDate = manufacturingDate;
		this.cores = cores;
	}
	
	
	//Getters and setters
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(String diskSize) {
		this.diskSize = diskSize;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", diskSize=" + diskSize + ", manufacturingDate="
				+ manufacturingDate + ", cores=" + cores + "]";
	}	
	
}