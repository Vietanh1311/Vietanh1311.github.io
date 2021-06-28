package baitapdocfileJson;
import java.util.HashMap;
import java.util.Map;
// import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        ReadFile readFile = new ReadFile();
        
        
        Map<String, Integer> countPeopleByCountry = new HashMap();
        for (Person person : readFile.getPersons()) {
            Integer countPeople = countPeopleByCountry.get(person.getCountry());
            if(countPeople==null){
                countPeopleByCountry.put(person.getCountry(), 1);
            }
            else{
                countPeopleByCountry.put(person.getCountry(), countPeople+1);
            }
        }
        countPeopleByCountry.forEach((k,v)-> System.out.println(k+"-"+v));
        
       
    }

    
}
