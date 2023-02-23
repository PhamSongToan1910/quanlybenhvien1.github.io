package quanlybenhvien;


import quanlybenhvien.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Quanly extends Person{

    public Quanly() {
    }

    public Quanly(String ID, String name, String birthday, String position, String sex, String Username, String password) {
        super(ID, name, birthday, "Quản Lý", sex, Username, password);
    }
    
}
