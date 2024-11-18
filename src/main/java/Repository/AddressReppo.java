package Repository;

import Models.Address;
import Models.Customer;
import dtos.OnlyAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class AddressReppo {
    public static  void CreateDetails(Address address ,Long id){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        address.setCustomer(customer);
        session.persist(address);
        session.close();
        sessionFactory.close();
    }
    public  Address getDetailsById(Long id){
        Session session =null;
        SessionFactory sessionFactory=null;

            Configuration configuration=new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
            Address address = session.get(Address.class, id);

            return address;

    }

    public void updateDetailsById(Long id, String email) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address = session.get(Address.class, id);
        address.getCustomer().setEmail(email);
        session.merge(address);
        transaction.commit();

        session.close();
        sessionFactory.close();

    }

    public List<Address> findAll() {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String hql="select a.street,a.state,a.country from Address a";
        Query<Address> query = session.createQuery(hql, Address.class);
        List<Address> resultList = query.getResultList();



        return resultList;
    }

    public List<OnlyAddress> findAllAddress() {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        List<OnlyAddress> list=new ArrayList<>();
        String hql="select a from Address a";
        Query<Address> query = session.createQuery(hql, Address.class);
        List<Address> resultList = query.getResultList();
        for (Address address:resultList){
            list.add(new OnlyAddress(address.getStreet(),address.getState(),address.getCountry()));
        }




        return list;
    }


}
