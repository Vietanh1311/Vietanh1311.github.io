package Hackathonnumber2.Hackathon2;

public class Customer {
    private int CustomerCode;
    private String Name;
    private String DateOfBirth;
    private String Sex;
    private String Country;
    private String PhoneNumber;
    private String Email;
    public Customer(int customerCode, String name, String dateOfBirth, String sex, String country, String phoneNumber,
            String email) {
        CustomerCode = customerCode;
        Name = name;
        DateOfBirth = dateOfBirth;
        Sex = sex;
        Country = country;
        PhoneNumber = phoneNumber;
        Email = email;
    }
    public int getCustomerCode() {
        return CustomerCode;
    }
    public void setCustomerCode(int customerCode) {
        CustomerCode = customerCode;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDateOfBirth() {
        return DateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String sex) {
        Sex = sex;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    @Override
    public String toString() {
        return "Customer [Country=" + Country + ",CustomerCode=" + CustomerCode + ",DateOfBirth=" + DateOfBirth
                + ", Email=" + Email + ", Name=" + Name + ",PhoneNumber=" + PhoneNumber + ",Sex=" + Sex + "]";
    }
    
}
