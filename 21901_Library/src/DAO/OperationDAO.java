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
import Model.Operation;
public class OperationDAO {
     public void saveOp(Operation o)
    {
      Session session =  NewHibernateUtil.getSessionFactory().openSession();
      Transaction tr = session.beginTransaction();
      session.save(o);
      tr.commit();
      session.close();
    }
    
    
}
