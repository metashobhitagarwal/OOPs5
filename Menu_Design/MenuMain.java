package Menu_Design;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {

		//Initializing menus and submenus
		Menu menuTV= new Menu("TV"); 
		menuTV.setSubMenu(new SubMenu("LED"));
		menuTV.setSubMenu(new SubMenu("LCD"));
		
		Menu menuMobile= new Menu("Mobile");
		menuMobile.setSubMenu(new SubMenu("IOS"));
		menuMobile.setSubMenu(new SubMenu("Android"));
		
		Menu menuPC= new Menu("PC");
		menuPC.setSubMenu(new SubMenu("Desktop"));
		menuPC.setSubMenu(new SubMenu("Laptop"));
		
		MenuAction menuAction= new MenuAction();
		menuAction.addMenu(menuTV);
		menuAction.addMenu(menuMobile);
		menuAction.addMenu(menuPC);
		
		menuAction.displyMenu();
		menuAction.displaySubMenu(menuAction.getChoice(menuAction.getList().size()));
		
	}

}