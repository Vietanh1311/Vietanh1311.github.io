package Banhang;

public class LineItem implements Entity{
    private Long id; //Unique id  
    private Integer unitPrice;
    private Integer quantity;
    
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

    public LineItem(Long id, Integer unitPrice, Integer quantity) {
      this.id = id;
      this.unitPrice = unitPrice;
      this.quantity = quantity;
    }
  
    
}
