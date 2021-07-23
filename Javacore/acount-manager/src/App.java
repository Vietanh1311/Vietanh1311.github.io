import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        Constroller controller = new Constroller();
        repository.getData();
        Menu.mainMenu();

        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                controller.login();
                break;
            case 2:
                //Đăng ký
                controller.createNewAccount();
                break;
            default:
                break;
        }
        

    }
}