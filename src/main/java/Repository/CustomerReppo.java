package Repository;

import Models.Customer;
import Models.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerReppo {
    public   void CreateDetails(Customer customer){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(customer);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public static Customer getDetailsById(Long id) {
        Configuration configuration=null;
        SessionFactory sessionFactory=null;
        Session session=null;
        try{
            configuration=new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
            Customer customer = session.get(Customer.class, id);
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

    public void updateById(Long id, String state) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        customer.getAddress().setState(state);
        session.merge(customer);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }

    public void deleteById(Long id) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.remove(customer);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
    public void deleteByHql(Long id){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql="delete from Customer where id=:id1";
        Query query = session.createQuery(hql);
        query.setParameter("id1",id);
        query.executeUpdate();
        transaction.commit();
        session.close();
        sessionFactory.close();

    }

    public void setProduct(Long cuid, Long id) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, cuid);
        Product product = session.get(Product.class, id);
        customer.getProducts().add(product);
        session.persist(customer);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public List<Product> getProduct(Long id) {
        Configuration configuration=null;
        SessionFactory sessionFactory=null;
        Session session=null;
        try{
            configuration=new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
            Customer customer = session.get(Customer.class, id);
            List<Product> product = customer.getProducts();

            return product;

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
