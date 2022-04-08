package model;

import config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ActiveProduct {


    public void save(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(getThis());
        transaction.commit();
    }

    public void update(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(getThis());
        transaction.commit();
    }

    public void delete(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(getThis());
        tx.commit();
    }


    public Product getThis(){
        return (Product) this;
    }

    public static Product retrieve(Integer productId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        //load -> vrati NULL ako red s ovim productId
        Product product =(Product) session.load(Product.class, productId);
        //get  -> ispali exception ako red ovim productId
//        Product product = (Product) session.get(Product.class, productId);
        return product;
    }
}
