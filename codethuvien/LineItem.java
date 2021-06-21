package codethuvien;

public class LineItem implements Entity{
    private Long id; //Unique id  
    private Integer unitPrice;
    private Integer quantity;
    private String name;

    public LineItem(String name, Integer unitPrice, Integer quantity) {
        id= IdGenerator.getNewID();
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.name = name;

      }
      

    @Override
    public String toString() {
      return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
    }


    @Override
    public Long getId() {
      return id;
    }
  
    public Integer getUnitPrice() {
      return unitPrice;
    }
  
    public void setUnitPrice(Integer unitPrice) {
      this.unitPrice = unitPrice;
    }
  
    public Integer getQuantity() {
      return quantity;
    }
  
    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
    }

    
  
    
}

