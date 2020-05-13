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
import Model.Books;
public class BookDAO {
    
    public void saveBook(Books b)
    {
      Session session =  NewHibernateUtil.getSessionFactory().openSession();
      Transaction tr = session.beginTransaction();
      session.save(b);
      tr.commit();
      session.close();
    }
     public void updateBook(Books cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(cl);
        trans.commit();
        session.close();
    } 
      public void deleteBook(Books cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(cl);
        trans.commit();
        session.close();
    } 	
    
    
}
