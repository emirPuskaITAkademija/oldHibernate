import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.createQuery("from Product").list().forEach(System.out::println);
        tx.commit();
    }
}
