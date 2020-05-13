/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Kevin
 */
import java.math.*;
import java.security.*;
public class Encryption {
    public static String Encrypt (String str)
    {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest= md.digest(str.getBytes());
            BigInteger number = new BigInteger(1,messageDigest);
            String hashtext = number.toString(16);
            while(hashtext.length()<32)
            {
              hashtext="0" + hashtext;  
            }
            return hashtext;
        }
        catch(Exception e)
        {
            
        }
         return null;
    }
    
}
