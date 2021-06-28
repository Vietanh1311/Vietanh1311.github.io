package baitapdocfileJson;

public class Person {
    long id;
    String first_name;
    String last_name;
    String Gender;
    String dataOfnirth;
    String Country;
    public Person(long id, String first_name, String last_name, String gender, String dataOfnirth, String country) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        Gender = gender;
        this.dataOfnirth = dataOfnirth;
        Country = country;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public String getDataOfnirth() {
        return dataOfnirth;
    }
    public void setDataOfnirth(String dataOfnirth) {
        this.dataOfnirth = dataOfnirth;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    @Override
    public String toString() {
        return "Person [Country=" + Country + ", Gender=" + Gender + ", dataOfnirth=" + dataOfnirth + ", first_name="
                + first_name + ", id=" + id + ", last_name=" + last_name + "]";
    }
   
    
    
}
