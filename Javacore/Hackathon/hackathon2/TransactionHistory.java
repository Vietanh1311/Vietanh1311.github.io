// package Hackathon.hackathon2;

// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class TransactionHistory {

//     private Long id;
//     private LocalDate dayTrading;
//     private String description;
//     private String beneficiaryAccount;
//     private long money;
    



//     public TransactionHistory(String description, String beneficiaryAccount, long money) {
//         super();
//         this.id = IdGenerate.getNewID();   //Id để tự động tăng
//         this.dayTrading = LocalDate.now(); //Lấy ngày hiện tại // em thấy cái này nó không nhận nên em thêm ở tostring 
//         this.description = description;
//         this.beneficiaryAccount = beneficiaryAccount;
//         this.money = money;
        
//     }
//     public TransactionHistory() {
//         super();
//     }

//     public String getBeneficiaryAccount() {
//         return beneficiaryAccount;
//     }


//     public void setBeneficiaryAccount(String beneficiaryAccount) {
//         this.beneficiaryAccount = beneficiaryAccount;
//     }


//     public Long getId() {
//         return id;
//     }


//     public LocalDate getDayTrading() {
//         return dayTrading;
//     }


//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public long getMoney() {
//         return money;
//     }

//     public void setMoney(long money) {
//         this.money = money;
//     }
//     public void nhap(){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("nhập số tài khoản muốn chuyển : ");
//         beneficiaryAccount = scanner.nextLine();
//         System.out.println("Nhập số tiền muốn chuyển : ");
//         money = scanner.nextLong();
//         System.out.println("Nhập miêu tả :");
//         description = scanner.next();
        
//     }

//     public String toString() {
//         DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//         return id + " - " + dayTrading.now().format(myFormatter)  + " - " + description + " - " + Controller.formatMoney(money) + " - " + beneficiaryAccount + "\n";
//     }
//     // dayTrading.format(myFormatter)

    
// }
