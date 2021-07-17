package generic;

import java.util.ArrayList;
import java.util.List;

public class PersonController<T> {
    ArrayList<T> list = new ArrayList<T>();
    
    
    public void add (T obj){
         list.add(obj);
    }
    public void display(){
        for(T object : list){
            System.out.println(object);
      } 
}
}
