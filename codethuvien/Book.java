package codethuvien;

public class Book implements Entity {
    private Long id;
    private String name;
    private String manufacturer;


    private String madeIn;
    private String description;
    private String Author;
    private String Numberpage;
    public Book(Long id, String name, String manufacturer, String madeIn, String description, String author , String numberpage) {
        id = IdGenerator.getNewID();
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.madeIn = madeIn;
        this.description = description;
        Author = author;
        Numberpage = numberpage;
        
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ",name=" + name + ",Author=" + Author + ", description=" + description + ",  madeIn=" + madeIn
                + ", manufacturer=" + manufacturer + ",numberpage = " + Numberpage + "]";
    }

    
}
    
    
   