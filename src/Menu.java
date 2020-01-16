import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private String name;
    private ArrayList<MenuItem> menuItems;
    private Date dateUpdated;

    public Menu(String name, ArrayList<MenuItem> menuItems){
        this.name = name;
        this.menuItems = menuItems;
        this.dateUpdated = new Date();
    }

    public Menu(String name){
        this.name = name;
        this.menuItems = new ArrayList<MenuItem>();
        this.dateUpdated = new Date();
    }

    @Override
    public String toString() {
        return name + ", updated: " + dateUpdated + "\n" + menuItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(getName(), menu.getName()) &&
                Objects.equals(getMenuItems(), menu.getMenuItems()) &&
                Objects.equals(getDateUpdated(), menu.getDateUpdated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMenuItems(), getDateUpdated());
    }

    public void addMenuItem(MenuItem menuItem){
        //TODO: Create several items and add them to a menu.
        menuItems.add(menuItem);
    }
    public void removeMenuItem(MenuItem menuItem){
        //TODO: //Delete an item from a menu, then reprint the menu.
        menuItems.remove(menuItem);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}


