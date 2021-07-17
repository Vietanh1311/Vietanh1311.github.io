package generic;

public class App {
    public static void main(String[] args){
        Database db = new Database();
        db.teacher.add(new Teacher(1,"Nguyễn Văn A",4800000));
        db.teacher.add(new Teacher(2,"Nguyễn Văn B",500000));
        db.teacher.display();

        db.student.add(new Student(1,"Nguyễn Minh An",20));
        db.student.add(new Student(2,"Nguyễn Việt Anh",20));
        db.student.display();
        
    }
    
    
    
}
