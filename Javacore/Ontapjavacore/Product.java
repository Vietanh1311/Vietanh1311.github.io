package Ontapjavacore;

public class Product {
    private Long id;
    private String name;
    private String type;
    private int quantity;
    private int price;
    private int quantitysold;
    public Product( String name, String type, int quantity, int price, int quantitysold) {
        id = IdGenerator.getNewID();
        
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.quantitysold = quantitysold;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantitysold() {
        return quantitysold;
    }
    public void setQuantitysold(int quantitysold) {
        this.quantitysold = quantitysold;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
                + ", quantitysold=" + quantitysold + ", type=" + type + "]";
    }
    
    
}
