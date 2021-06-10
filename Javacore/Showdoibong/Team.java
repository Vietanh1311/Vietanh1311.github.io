package Showdoibong;
import java.util.ArrayList;
import java.util.List;

public class Team {
  String name;
  String stadium;
  String coach;
  String establishedYear;

  private List<Player> players = new ArrayList<>();
  
  public Team(String name, String stadium) {
    this.name = name;
    this.stadium = stadium;
  }  

  public Team(String name, String stadium, 
  String coach, String establishedYear) {
    this.name = name;
    this.coach = coach;
    this.stadium = stadium;
    this.establishedYear = establishedYear;
  }


  //Tiếp là các phương thức @Override
  @Override
  public String toString() {
    return "Team [coach=" + coach + ", establishedYear=" + establishedYear + ", name=" + name + ", stadium=" + stadium
        + "]";
  }

  public String info() {
    return "Team [coach=" + coach + ", establishedYear=" + establishedYear + ", name=" + name + ", stadium=" + stadium
        + "]";
  }


  public void addPlayer(Player player) {
    players.add(player);
  }

  public void showAllPlayers() {
    
    System.out.println("Team " + this.name);
    int i = 0;
    while (i < players.size()) {
      System.out.println(" " + (i + 1) + " : " + players.get(i));
      i++;
    }
  }
  
}
