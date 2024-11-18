package Repository;

import Models.Customer;
import Models.Payment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class PaymentReppo {
    public static  void CreateDetails(Payment payment,Long id){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        payment.setCustomer(customer);
        session.persist(payment);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public Payment getDetailsById(Long Id){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Payment payment = session.get(Payment.class, Id);
        session.close();
        sessionFactory.close();
        return payment;
    }
    public List<Payment> getDetailsByForiegn(Long id) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        String hql = "select p from Payment p where p.customer = :customer";
        Query<Payment> query = session.createQuery(hql, Payment.class);
        query.setParameter("customer", customer);

        List<Payment> resultList = query.getResultList();

        transaction.commit();
        session.close();
        sessionFactory.close();
        return resultList;
    }
    public Integer getNoOfTrancEach(Long id) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        String hql = "select p from Payment p where p.customer = :customer";
        Query<Payment> query = session.createQuery(hql, Payment.class);
        query.setParameter("customer", customer);

        List<Payment> resultList = query.getResultList();
        int size = resultList.size();


        transaction.commit();
        session.close();
        sessionFactory.close();
        return size;
    }



    public void deleteById(Long id) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Payment payment = session.get(Payment.class, id);
        System.out.println(payment);
        session.remove(payment);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }


    public List<Payment> getByName(String name) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        Customer customer = session.get(Customer.class, id);
        String hql = "select p from Payment p where p.customer.name = :name";
        Query<Payment> query = session.createQuery(hql, Payment.class);
        query.setParameter("name", name);

        List<Payment> resultList = query.getResultList();
        int size = resultList.size();


        transaction.commit();
        session.close();
        sessionFactory.close();
        return resultList;


    }
}
