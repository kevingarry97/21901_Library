/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *

 */
import Model.Bookscategory;
import util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class BooksCategoryDAO {
    public void saveCat(Bookscategory bc)
    {
      Session session =  NewHibernateUtil.getSessionFactory().openSession();
      Transaction tr = session.beginTransaction();
      session.save(bc);
      tr.commit();
      session.close();
    }
    
     public void updateBcategory(Bookscategory cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(cl);
        trans.commit();
        session.close();
    } 
      public void deleteBct(Bookscategory cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(cl);
        trans.commit();
        session.close();
    } 	
}
