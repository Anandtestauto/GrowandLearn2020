package W3.D2;

public class Desktop implements HardWare {

	public void desktopModel() {
		System.out.println("desktopModel");
	}

	public void softwareResources() {
		System.out.println("softwareResources");

	}

	public void hardwareResources() {
		System.out.println("hardwareResources");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();

	}

}
