package Menu_Design;

import java.util.ArrayList;
import java.util.List;

/*This class builds the menu items with their submenu items
 */

public class Menu {

		String menuName;
		List<SubMenu> subMenu;
		
		Menu(String name){
			menuName = name;
			subMenu = new ArrayList<SubMenu>();
		}
		
		public void setSubMenu(SubMenu sbMenu){
			subMenu.add(sbMenu);
		}
		
		public List<SubMenu> getSubMenu(){
			return subMenu;
		}
		
		public String getMenuName(){
			return menuName;
		}
		
}
