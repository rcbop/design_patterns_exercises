package org.cesar.rcbop.p3abstractfactory.application1;

public class MainApplicationWindow {

	public MainApplicationWindow(GUIFactory factory) {
		Button button = factory.createButton();
		button.paint();
	}

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static void main(String[] args) {

		if (isWindows()) {
			System.out.println("This is Windows");
			new MainApplicationWindow(new WindowsGUIFactory());
		} else if (isUnix()) {
			System.out.println("This is Unix or Linux");
			new MainApplicationWindow(new GtkGUIFactory());
		} else {
			System.out.println("Your OS is not supported!");
		}
	}

	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS
				.indexOf("aix") > 0);
	}
}
