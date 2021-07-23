import java.util.List;
import java.util.Scanner;

public class Constroller {
    Scanner input = new Scanner(System.in);
    Repository repository = new Repository();
    List<User> users = repository.getData();
    User Oldaccount;

    public void login() {

        // Thực hiện đăng nhập
        System.out.println("Mời bạn nhập tài khoản.");
        String Username = input.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(Username)) {
                Oldaccount = user;
                System.out.println("Mời bạn nhập mật khẩu.");
                String Password = input.nextLine();
                if (user.getPassword().equals(Password)) {
                    System.out.println(
                            "Chào mừng bạn " + user.getUsername() + ", bạn có thể thực hiện các công việc sau:");
                    int n;
                    while (true) {
                        Menu.login();
                        n = input.nextInt();
                        switch (n) {
                            case 0:{
                                break;
                            }
                            case 1:{
                                changeUsername();
                            }
                            case 2:{
                                changeEmail();
                            }
                            case 3:{
                                changePassword();
                            }
                            case 4:{

                            }
                        }
                    }

                } else {
                    System.out.println("Bạn nhập sai mật khẩu .");
                    break;
                }

            } else {
                System.out.println("Bạn nhập sai tài khoản");
                break;
            }

        }

    }

    // private String getUsername() {
    //     return null;
    // }

    public void changePassword() {
        // Thay đổi mật khẩu
        System.out.print("Nhập mật khẩu cũ: ");
        String passwordOld = Validate.validatePassword(input.next());

        if ( Oldaccount.getPassword().equals(passwordOld)) {
            System.out.print("Nhập mật khẩu mới: ");
            String passwordNew = Validate.validatePassword(input.next());

            Oldaccount.setPassword(passwordNew);
            System.out.println("Đổi mật khẩu thành công");
        } else {
            System.out.println("Mật khẩu cũ không đúng");
        }

    }

    public void changeUsername() {
        // Thay đổi username
        System.out.print("Nhập tên mà bạn muốn đổi: ");
        String username = input.next();

        Oldaccount.setUsername(username);
        System.out.println("Đổi tên thành công");

    }

    public void changeEmail() {
        // Thay đổi email
        System.out.print("Nhap email: ");
        String email = Validate.validateEmail(input.next());

        Oldaccount.setEmail(email);
        System.out.print("Đổi email thành công");

    }

    public void forgotPassword() {
        // Quên mật khẩu
        System.out.print("Để cấp lại mật khẩu vui lòng nhập email: ");
        String email = Validate.validateEmail(input.next());

        if (users.stream().anyMatch(i -> i.getEmail().equals(email))) {
            // changePassword();
            System.out.print("Nhập mật khẩu mới: ");
            String passwordNew = Validate.validatePassword(input.next());

            Oldaccount.setPassword(passwordNew);
            System.out.print("Đổi mật khẩu thành công");
            
        } else {
            System.out.print("Email này chưa được đăng kí tài khoản.Bạn muốn đăng ký tài khoản không(Y/N): ");
            String n = input.next().charAt(0) + "";
            if (n.toLowerCase().equals("Y".toLowerCase())) {
                createNewAccount();
            } else {
                if(n.toLowerCase().equals("N".toLowerCase())){
                    System.out.println("Đã thoát");
                }
                else{
                    System.out.println("Không có lựa chọn này.");
                }
            }
        }

    }

    public void createNewAccount() {
        // Tạo tài khoản mới
        System.out.print("Nhap tài khoản: ");
        String username = input.next();

        if (!users.stream().anyMatch(e -> e.getUsername().equals(username))) {
            System.out.print("Nhap email: ");
            String email = Validate.validateEmail(input.next());

            if (!users.stream().anyMatch(e -> e.getEmail().equals(email))) {
                System.out.print("Nhập mật khẩu : ");
                String password = Validate.validatePassword(input.next());

                users.add(new User(0, username, email, password));
                System.out.println("Đã tạo tài khoản mới");
            } else {
                System.out.println("Email Đã tồn tại");
            }
        } else {
            System.out.println("Tên tài khoản đã tồn tại ");
        }
    }
    

}
