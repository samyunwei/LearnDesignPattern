package Iterator;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
		MenuComponent dinermenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","DESSERT of coures");
		
		
		MenuComponent allMenus = new Menu("ALL Menus","All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinermenu);
		allMenus.add(cafeMenu);
		
		dinermenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce,and a slice of sourdough break",true,3.89));
		dinermenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust,topped with vanilla ice cream",true,1.59));
		
		Waitress waitress = new Waitress(allMenus);
		//waitress.printMenu();
		waitress.printVegetarianMenu();
	}

}
