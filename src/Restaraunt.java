public class Restaraunt {
    public static void main(String[] args) {
        //TODO: Create several items and add them to a menu.
        MenuItem bruschetta = new MenuItem("Bruschetta", "Balsamic dress over roasted tomato. Served on a lightly grilled bagette slice.", 9, "Appetizer");
        MenuItem hamburger = new MenuItem("Hamburger", "Lettuce, pickle, and tomato rest atop a juicy, Wagyu beef patty tenderized to perfection.", 15.0, "Main");
        MenuItem pannaCotta = new MenuItem("Panna Cotta","Italian dessert enriched with notes of coffee and blueberry.", 11, "Dessert");
        Menu italianThreeCourse = new Menu("Italian 3-Course");
        italianThreeCourse.addMenuItem(bruschetta);
        italianThreeCourse.addMenuItem(hamburger);
        italianThreeCourse.addMenuItem(pannaCotta);

        Menu italianThreeCourse1 = new Menu("Italian 3-Course");
        italianThreeCourse1.addMenuItem(bruschetta);
        italianThreeCourse1.addMenuItem(hamburger);
        italianThreeCourse1.addMenuItem(pannaCotta);
        //TODO: Print the entire, updated menu to the screen.
        System.out.println(italianThreeCourse.toString());
        //TODO: Print an individual menu item to the screen.
        System.out.println(hamburger.toString());
        //TODO: Delete an item from a menu, then reprint the menu.
        italianThreeCourse.removeMenuItem(hamburger);
        System.out.println(italianThreeCourse);
        System.out.println(italianThreeCourse.equals(italianThreeCourse1));
    }
}
