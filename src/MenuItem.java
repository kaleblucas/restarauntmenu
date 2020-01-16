import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price = 0.0;
    private Date dateCreated;


    public MenuItem(String name, String description, double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateCreated = new Date();
    }

    @Override
    public String toString() {
        return  "******\n"+
                name +
                "\nDescription: " + description +
                "\nCategory: " + category +
                "\nPrice: " + price +
                "\nCreated: " + dateCreated +
                "\n******\n\n";
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
