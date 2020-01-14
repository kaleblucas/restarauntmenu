import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private ArrayList<MenuItem> menuItems;
    private Date dateUpdated;

    public Menu(String name, ArrayList<MenuItem> menuItems){
        this.name = name;
        this.menuItems = menuItems;
        this.dateUpdated = new Date();
    }
}

