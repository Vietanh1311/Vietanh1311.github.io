package baitapdocfileJson;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadFile {
     
     public List<Person> getPersons(){
        List<Person> listPersons= new ArrayList<Person>();
        // Gson gson = new Gson();
        try(FileReader reader = new FileReader("C:\\Users\\KyThuat88\\Desktop\\Javacore\\baitapdocfileJson\\persons.json")){

            listPersons= new Gson().fromJson(reader, new TypeToken<List<Person>>() {}.getType());
            // for (Person person : listPersons) {
            //     System.out.println(person);
            // }
            // listPersons.forEach(person->System.out.println(person));

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listPersons;
}
}
