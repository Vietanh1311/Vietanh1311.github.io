package BookStore;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
public class Repository<T extends Entity> {
    protected ArrayList<T> collections = new ArrayList<>();

  public List<T> getAll() {
    return collections;
  }


  public void add(T t) {
    collections.add(t);
  }

  public void deleteByID(Long id) {
    Iterator<T> itr = collections.iterator();
    while (itr.hasNext()) {
      T item = itr.next();
      if (item.getId().equals(id)) {
        itr.remove();
      }
    }
  }
  public void update(T t) {
    for (int i = 0; i < collections.size(); i++) {
      if (collections.get(i).getId().equals(t.getId())) {
        collections.set(i, t);
      }
    }
  }
  

  
}
