import config.HibernateUtil;
import model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        //HQL imena klasa i properties iz klase
//        session.createQuery("from Product p where p.name like 'Sweet%'").list().forEach(System.out::println);
//        tx.commit();
//        System.exit(0);
//        Product product = new Product();
//        product.setName("Čevapi s lukom");
//        product.setQuantityInStock(100);
//        product.setUnitPrice(BigDecimal.TEN);
//        product.save();

        Product učitaniProduct = Product.retrieve(11);
        učitaniProduct.setName("Ćevapi aaaaa lukom");
        učitaniProduct.delete();
    }
}
