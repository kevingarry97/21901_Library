/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *

 */
import util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Client;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
public class ClientDAO {
     public void saveClient(Client c)
    {
      Session session =  NewHibernateUtil.getSessionFactory().openSession();
      Transaction tr = session.beginTransaction();
      session.save(c);
      tr.commit();
      session.close();
    }
     public void updateClient(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(cl);
        trans.commit();
        session.close();
    } 
     public void deleteClient(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(cl);
        trans.commit();
        session.close();
    } 	
}
