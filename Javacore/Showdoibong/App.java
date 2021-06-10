package Showdoibong;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Team manchesterUnited = TeamFactory.manchesterUnited();
        Team barcelona = TeamFactory.barcelona();
        Team liverpool = TeamFactory.liverpool();
        Team real = TeamFactory.real();
        Team bayern = TeamFactory.bayern();
        //in ra danh sách các cầu thủ trong team
        manchesterUnited.showAllPlayers();
        barcelona.showAllPlayers();
        real.showAllPlayers();
        bayern.showAllPlayers();
        liverpool.showAllPlayers();
        
        
        
    }
    
}
