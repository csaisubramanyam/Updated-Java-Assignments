package valtech_spring.client;
import java.util.Date; 
import java.util.List;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import valtech_spring.orm.Account;
import valtech_spring.orm.Address;
import valtech_spring.orm.Article;
import valtech_spring.orm.AtmTx;
import valtech_spring.orm.Author;
import valtech_spring.orm.Author_Address;
import valtech_spring.orm.BankAccount;
import valtech_spring.orm.BankAccountId;
import valtech_spring.orm.Blog;
import valtech_spring.orm.Book;
import valtech_spring.orm.Car;
import valtech_spring.orm.CarDetails;
import valtech_spring.orm.ChequeTx;
import valtech_spring.orm.Customer;
import valtech_spring.orm.HardBook;
import valtech_spring.orm.Publisher;
import valtech_spring.orm.TellerTx;
import valtech_spring.orm.Tx;
import valtech_spring.orm.dao.CustomerDAO;
import valtech_spring.orm.dao.CustomerDAOImpl;


public class HibernateClient {

	public static void main(String[] args) {
//		SessionFactory sf = new Configuration()
		SessionFactory sf = (SessionFactory) new AnnotationConfiguration()
				.configure()
//				.addClass(Car.class)
				.addAnnotatedClass(BankAccount.class)
				.addAnnotatedClass(Tx.class).addAnnotatedClass(TellerTx.class)
				.addAnnotatedClass(AtmTx.class).addAnnotatedClass(ChequeTx.class)
				.addAnnotatedClass(Customer.class).addAnnotatedClass(Address.class)
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Car.class)
				.addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(Author_Address.class)
				.addAnnotatedClass(Article.class)
				.addAnnotatedClass(Blog.class)
				.addAnnotatedClass(HardBook.class)
				.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		
//		Publisher publisher = new Publisher("Sai", "Nandyal", 123456789);
//		ses.save(publisher);
//		
//		
//		Book book = new Book("Harry Potter", 2020);
//		ses.save(book);
//		
		Author_Address address = new Author_Address("ANagar", "Bngl", "Kar");
		ses.save(address);
		
		HardBook hardbook = new HardBook(1,200,1984,5);
		ses.save(hardbook);

		Article article = new Article("jfxggfdsfjvfs@gmail.com");
		ses.save(article);
		
		Blog blog = new Blog("gajdfsvfs@gmail.com", 4);
		ses.save(blog);
		
		Author author = new Author(1, "Chethan", 321344724);
		ses.save(author);
		
		Author_Address address1 = new Author_Address("Nagar", "Nandyal", "Andhra");
		ses.save(address1);
		
		
		
		/*Customer c1 = new Customer("Pqr", new Date(90, 5, 13),1);
		ses.save(c1);*/
		
//		CustomerDAO customerDAO = new CustomerDAOImpl();
		/*for(Customer c : customerDAO.getByAccountBalanceGreaterThan(ses, 5000)) {
			System.out.println(c);
		}*/
//		
//		for(Customer c : customerDAO.getByAccountType(ses, "SB")) {
//			System.out.println(c);
//		}
////		
//		System.out.println("Combined Bal for Customer 1 = "+customerDAO.getCombinedBalance(ses, 10));
//		System.out.println("Combined Bal for Customer 2 = "+customerDAO.getCombinedBalance(ses, 30));
//		
//		
//		List objects = ses.createQuery("SELECT o FROM java.lang.Object o").list();
//		for(Object o:objects) {
//			System.out.println(o);
//		}
		
		/*Customer c = new Customer("Pqr", new Date(90, 5, 13),1);
		Address a = new Address("Jp Nagar", "Bnglr", "Kar",560078);
		ses.save(c);
		ses.save(a);
		c.setAddress(a);
		
		
		
		Customer c1 = new Customer("Absdskjb", new Date(90, 5, 13),1);
		ses.save(c1);
		
		
		Account ac = new Account(1000,"SB");
		Account ac1 = new Account(10000, "CA");
		ses.save(ac);
		ses.save(ac1);
		
		Account ac2 = new Account(2000, "SB");
		Account ac3 = new Account(3000, "SB");
		ses.save(ac2);
		ses.save(ac3);
		
		
		c.addAccount(ac);
		c.addAccount(ac3);
		c.addAccount(ac2);
		
		c1.addAccount(ac3);
		c1.addAccount(ac1);*/
		
			
		
		/*Account ac = new Account(1000,"SB");
		Account ac1 = new Account(10000, "CA");*/
		
		/*ses.save(new Tx(1000));
		ses.save(new ChequeTx(2000,123456,false,2));
		ses.save(new TellerTx(2500,"Teller1","JP Nagar"));
		ses.save(new AtmTx(3000,123,"Jayanagar"));*/
		
		/*ses.save(ac);
		ses.save(ac1);
		*/
//		
//		ses.save(new Tx(1000));
//		ses.save(new ChequeTx(2000,123456,false,2));
//		ses.save(new TellerTx(2500,"Teller1","JP Nagar"));
//		ses.save(new AtmTx(3000,123,"Jayanagar"));
		
		
		/*List<Tx> txs = ses.createQuery("SELECT tx FROM Tx tx").list();
		for(Tx t : txs) {
			//Ternary Operation boolCOnd ? true : false
			t.setAccount(t.getId() % 2 == 0 ? ac : ac1);
		}*/
		
		
		
		/*Customer c = new Customer("Abc", new Date(1974, 6, 13),1);
		Address a = new Address("Jp Nagar", "Bnglr", "Kar",560078);
		ses.save(c);
		ses.save(a);
		a.setCustomer(c);
		c.setAddress(a);*/
		
			
		
		
		/*List <Tx> txs = ses.createQuery("SELECT t from Tx t").list();
		for(Tx t : txs) {
			System.out.println(t);
		}
		
		
		/*BankAccount ba = (BankAccount)ses.load(BankAccount.class, new BankAccountId(1, "SB"));
		System.out.println(ba);*/
		
		
		/*ba.setAccountNo(1);
		ba.setAccountType("SB");
		ba.setActive(true);
		ba.setBalance(1000);
		ba.setOpeningDate(new Date());
		ses.save(ba);*/
		
		/*Car car = new Car("Benz", "320d", 2018, 3000000, "Black", new CarDetails(25000,true,1));
		ses.save(car);*/
		
		//Car car = (Car) ses.load(Car.class, 10);
     	//System.out.println("Car loaded" +car.getClass().getName());
		//car.getMake();
		//car.setPrice(1250000);
		//ses.update(car);
		
		tx.commit();
		ses.close();
		sf.close();
	}
}
