package Stream.baitapvenha;

public class Phone {
    int id;
    String name;
    String describe;
    int price;
    int amount;
    int amountsales;
    String firm;
    String directory;
    
   
    public Phone(int i, String name, String describe, int price, int amount, int amountsales, String firm,
            String directory) {
        this.id = i;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.amount = amount;
        this.amountsales = amountsales;
        this.firm = firm;
        this.directory = directory;
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


    public String getDescribe() {
        return describe;
    }


    public void setDescribe(String describe) {
        this.describe = describe;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public int getAmount() {
        return amount;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }


    public int getAmountsales() {
        return amountsales;
    }


    public void setAmountsales(int amountsales) {
        this.amountsales = amountsales;
    }


    public String getFirm() {
        return firm;
    }


    public void setFirm(String firm) {
        this.firm = firm;
    }


    public String getDirectory() {
        return directory;
    }


    public void setDirectory(String directory) {
        this.directory = directory;
    }


    @Override
    public String toString() {
        return "Phone [amount=" + amount + ", amountsales=" + amountsales + ", describe=" + describe + ", directory="
                + directory + ", firm=" + firm + ", id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    
    
}
