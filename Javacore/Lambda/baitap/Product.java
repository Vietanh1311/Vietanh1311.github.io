package Lambda.baitap;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private int amountsales;
    
    
    public Product(int id, String name, int price, String description, int amountsales) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.amountsales = amountsales;
       

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmountsales() {
        return amountsales;
    }
    

    public void setAmountsales(int amountsales) {
        this.amountsales = amountsales;
    }
    public static int compareByName(Product p1, Product p2){
        return p1.getName().compareTo(p2.getName());
    }
    public static int compareByAmountsales(Product p1, Product p2){
        return p1.getAmountsales() - p2.getAmountsales();
    }

    @Override
    public String toString() {
        return "Product [amountsales=" + amountsales + ", description=" + description + ", id=" + id + ", name=" + name
                + ", price=" + price + "]";
    }
    
    
    
}
