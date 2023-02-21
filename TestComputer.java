
package a5;

public class TestComputer {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.setManufacturer("Dell");
		c1.setDiskSize("1189160321024 bytes");
		c1.setManufacturingDate("April 1, 2020");
		c1.setCores(2);
		
		Computer c2 = new Computer();
		c2.setManufacturer("Apple Inc");
		c2.setDiskSize("269283712040 bytes");
		c2.setManufacturingDate("March 31, 2020 ");
		c2.setCores(4);
		
		Computer c3 = new Computer();
		c3.setManufacturer("HP");
		c3.setDiskSize("2485945920221 bytes");
		c3.setManufacturingDate("June 12, 2021 ");
		c3.setCores(8);
		
		Desktop d1 = new Desktop();
		d1.setWidth(12);
		d1.setHeight(29.5);
		System.out.println("Desktop 1 dimensions are: " + d1.toString());
		
		Desktop d2 = new Desktop();
		d2.setWidth(10.5);
		d2.setHeight(27.5);
		System.out.println("Desktop 2 dimensions are: " + d2.toString());
		
		Laptop l1 = new Laptop();
		l1.setWidth(13.2);
		l1.setHeight(12.5);
		l1.setWeight(4);
		System.out.println("Laptop 1 dimensions are: " + l1.toString());
		
		Laptop l2 = new Laptop();
		l2.setWidth(15);
		l2.setHeight(11);
		l2.setWeight(8);
		System.out.println("Laptop 2 dimensions are: " + l2.toString());
		
		
	}
}
