package Showdoibong;

public class TeamFactory {
    
    public static Team manchesterUnited() {
      Team team = new Team(
        "Manchester United", 
        "Old Trafford", 
        "Ole Gunnar Solskjær",
        "1878"
      );
  
      team.addPlayer(new Player("David de Gea", 1, Position.GOALKEEPER));
      team.addPlayer(new Player("Victor Lindelöf", 2, Position.DEFENDER));
      team.addPlayer(new Player("Bruno Fernandes", 18, Position.MIDFIELD));
      team.addPlayer(new Player("Wes Brown",6 , Position.DEFENDER));
      team.addPlayer(new Player("Patric Eva",4, Position.DEFENDER));
      team.addPlayer(new Player("Nemanja Vidic",3, Position.DEFENDER));
      team.addPlayer(new Player("Michael Carrick",7, Position.MIDFIELD));
      team.addPlayer(new Player("Paul Scholes",9 , Position.MIDFIELD));
      team.addPlayer(new Player("Edison Cavani",11, Position.FORWARDER));
      team.addPlayer(new Player("Mayson Greenwwood",12,Position.MIDFIELD));
      team.addPlayer(new Player("Anthony Martial", 11, Position.FORWARDER));
      return team;
    }
  
    public static Team barcelona() {
      Team team = new Team(
        "Barcelona", 
        "Nou Camp", 
        "Ronald Koeman",
        "1899"
      );
  
      team.addPlayer(new Player("Marc-André ter Stegen", 1, Position.GOALKEEPER));
      team.addPlayer(new Player("Gerard Piqué ", 3, Position.DEFENDER));
      team.addPlayer(new Player("Lionel Messi ", 10, Position.FORWARDER));
      team.addPlayer(new Player("Samuel Umtiti",23 , Position.DEFENDER));
      team.addPlayer(new Player("Jordi Alba",4, Position.DEFENDER));
      team.addPlayer(new Player("Sergio Busques",6, Position.MIDFIELD));
      team.addPlayer(new Player("Miralem Pialic",7,Position.MIDFIELD));
      team.addPlayer(new Player("Philipe Continho",11, Position.MIDFIELD));
      team.addPlayer(new Player("Asu Fati",12, Position.FORWARDER));
      team.addPlayer(new Player("Ousmane Dembele",13, Position.FORWARDER));
      team.addPlayer(new Player("Antoine Giezmain",9, Position.FORWARDER));
      return team;
    }
    public static Team liverpool() {
        Team team = new Team(
          "Liverpool", 
          "Anfield", 
          "Jürgen Klopp",
          "1892"
        );
    
        team.addPlayer(new Player("Alison Becker", 1, Position.GOALKEEPER));
        team.addPlayer(new Player("Virgil van Dijk", 3, Position.DEFENDER));
        team.addPlayer(new Player("Alexander-Arnold",23 , Position.DEFENDER));
        team.addPlayer(new Player("Joel Matip",13, Position.DEFENDER));
        team.addPlayer(new Player("Andrew Robertson",4, Position.DEFENDER));
        team.addPlayer(new Player("Jordan Henderson",6, Position.MIDFIELD));
        team.addPlayer(new Player("Alex Chamberlain",7,Position.MIDFIELD));
        team.addPlayer(new Player("Xherdan Shaqiri",11, Position.MIDFIELD));
        team.addPlayer(new Player("Mohamed Salah",12, Position.FORWARDER));
        team.addPlayer(new Player("Antoine Giezmain",9, Position.FORWARDER));
        team.addPlayer(new Player("Thiago Alcantara", 10, Position.FORWARDER));
        return team;
      }
      public static Team real() {
        Team team = new Team(
          "Real Madrid", 
          "Santiago Bernabéu", 
          "Zinédine Zidane",
          "1902"
        );
    
        team.addPlayer(new Player("Thibaut Courtois", 1, Position.GOALKEEPER));
        team.addPlayer(new Player("Marcelo", 3, Position.DEFENDER));
        team.addPlayer(new Player("Raphael Varane",23 , Position.DEFENDER));
        team.addPlayer(new Player("Sergio Ramos",13, Position.DEFENDER));
        team.addPlayer(new Player("Andrew Robertson",4, Position.DEFENDER));
        team.addPlayer(new Player("Eden Hazrad",6, Position.MIDFIELD));
        team.addPlayer(new Player("Isco",7,Position.MIDFIELD));
        team.addPlayer(new Player("Luka Modric",11, Position.MIDFIELD));
        team.addPlayer(new Player("Toni Kroos",12, Position.MIDFIELD));
        team.addPlayer(new Player("Marco Asensio",9, Position.FORWARDER));
        team.addPlayer(new Player("Karim Benzema", 10, Position.FORWARDER));
        return team;
      }
      public static Team bayern() {
        Team team = new Team(
          "Bayern München", 
          "Allianz Arena", 
          "Hans-Dieter Flick",
          "1900"
        );
    
        team.addPlayer(new Player("Manuel Neuer", 1, Position.GOALKEEPER));
        team.addPlayer(new Player("Jerome Boateng", 3, Position.DEFENDER));
        team.addPlayer(new Player("Javi Martinez",23 , Position.DEFENDER));
        team.addPlayer(new Player("David Alaba",13, Position.DEFENDER));
        team.addPlayer(new Player("Andrew Robertson",4, Position.DEFENDER));
        team.addPlayer(new Player("Kingsley Coman",6, Position.MIDFIELD));
        team.addPlayer(new Player("Isco",7,Position.MIDFIELD));
        team.addPlayer(new Player("Serge Gnabry",11, Position.MIDFIELD));
        team.addPlayer(new Player("Leroy Sane",12, Position.MIDFIELD));
        team.addPlayer(new Player("Thomas Muller",9, Position.FORWARDER));
        team.addPlayer(new Player("Robert Lewandowski", 10, Position.FORWARDER));
        return team;
      }
      
  }
