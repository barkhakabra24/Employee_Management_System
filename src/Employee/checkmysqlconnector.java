/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bkabra
 */
public class checkmysqlconnector {
    public checkmysqlconnector() {
        String ClassName="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded successfully");
        }catch(ClassNotFoundException e){
            System.out.println("Driver Failed to load");
            System.out.println(e.getMessage());
        }
    }
}
