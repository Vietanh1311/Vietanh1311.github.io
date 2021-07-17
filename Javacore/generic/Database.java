package generic;

public class Database {
    public PersonController<Teacher> teacher;
    public PersonController<Student> student;
   
  
    public Database() {
      teacher = new PersonController<>();
      student = new PersonController<>();
    }
}
