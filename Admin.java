/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybenhvien;

/**
 *
 * @author admin
 */
public class Admin extends Person{

    public Admin() {
    }

    public Admin(String ID, String name, String birthday, String position, String sex, String Username, String password) {
        super(ID, name, birthday, "Admin", sex, Username, password);
    }
    
}
