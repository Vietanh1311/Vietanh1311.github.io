package codethuvien;

public class Database {
    public Repository<Readers> ReadersRepo;
    public Repository<Book> BookRepo;
    public Repository<Voucher> VoucherRepo;
  
    public Database() {
      ReadersRepo = new Repository<>();
      BookRepo = new Repository<>();
      VoucherRepo = new Repository<>();
      
    }
}
