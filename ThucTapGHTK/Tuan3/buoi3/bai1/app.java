package buoi3.bai1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        System.out.println("Mời bạn nhập tháng muốn xem : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1:{
                System.out.println("January có : " + month.January.getNumberOfDays());
                break;
            }
            case 2:{
                System.out.println("February có : " + month.February.getNumberOfDays());
                break;
            }
            case 3:{
                System.out.println("March có : " + month.March.getNumberOfDays());
                break;
            }
            case 4:{
                System.out.println("April có : " + month.April.getNumberOfDays());
                break;
            }
            case 5:{
                System.out.println("May có : " + month.May.getNumberOfDays());
                break;
            }
            case 6:{
                System.out.println("June có : " + month.June.getNumberOfDays());
                break;
            }
            case 7:{
                System.out.println("July có : " + month.July.getNumberOfDays());
                break;
            }
            case 8:{
                System.out.println("August có : " + month.August.getNumberOfDays());
                break;
            }
            case 9:{
                System.out.println("September có : " + month.September.getNumberOfDays());
                break;
            }
            case 10:{
                System.out.println("October có : " + month.October.getNumberOfDays());
                break;
            }
            case 11:{
                System.out.println("November có : " + month.November.getNumberOfDays());
                break;
            }
            case 12:{
                System.out.println("December có : " + month.December.getNumberOfDays());
                break;
            }
            default:
                System.out.println("Nhập sai");
        }

    }
}
