package BookStore;

public class Database {
    public Repository<TextBook> TextBookRepo;
    public Repository<Project> ProjectRepo;
    public Repository<ElectronicDocuments> ElectronicDocumentsRepo;
  
    public Database() {
      TextBookRepo = new Repository<>();
      ProjectRepo = new Repository<>();
      ElectronicDocumentsRepo = new Repository<>(); 
    }
}
