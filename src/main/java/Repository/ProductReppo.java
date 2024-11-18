package Repository;

import Models.Customer;
import Models.Payment;
import Models.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductReppo {
    public   void CreateDetails(Product product){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(product);



        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public List<Customer> getcustomers(Long id) {
        Configuration configuration=null;
        SessionFactory sessionFactory=null;
        Session session=null;
        try{
            configuration=new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
            Product product1 = session.get(Product.class, id);
            List<Customer> customer = product1.getCustomer();

            return customer;

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            session.close();
            sessionFactory.close();
        }
        return null;

    }
}
