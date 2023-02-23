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
public class NhanVien extends Person{

    public NhanVien() {
    }

    public NhanVien(String ID, String name, String birthday, String position, String sex, String Username, String password) {
        super(ID, name, birthday, "Nhân viên", sex, Username, password);
    }

    public NhanVien(String position, String Username, String password) {
        super(position, Username, password);
    }
    
    
}
